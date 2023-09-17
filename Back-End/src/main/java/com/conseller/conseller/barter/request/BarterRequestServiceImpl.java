package com.conseller.conseller.barter.request;

import com.conseller.conseller.barter.barter.BarterRepository;
import com.conseller.conseller.barter.barter.barterDto.BarterResponseDto;
import com.conseller.conseller.barter.request.barterRequestDto.BarterRequestRegistDto;
import com.conseller.conseller.barter.request.barterRequestDto.BarterRequestResponseDto;
import com.conseller.conseller.entity.Barter;
import com.conseller.conseller.entity.BarterRequest;
import com.conseller.conseller.entity.User;
import com.conseller.conseller.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BarterRequestServiceImpl implements BarterRequestService{

    private final BarterRequestRepository barterRequestRepository;
    private final BarterRepository barterRepository;
    private final UserRepository userRepository;
    List<BarterRequestResponseDto> barterRequestResponseDtoList;
    @Override
    public List<BarterRequestResponseDto> getBarterRequestList() {
        List<BarterRequest> barterRequestList = barterRequestRepository.findAll();
        List<BarterRequestResponseDto> barterRequestResponseDtoList = new ArrayList<>();

        for(BarterRequest barterRequest : barterRequestList) {
            Barter barter = barterRequest.getBarter();
            BarterResponseDto barterResponseDto = barter.toBarterResponseDto(barter);
            BarterRequestResponseDto barterRequestResponseDto = barterRequest.toBarterRequestResponseDto(barterRequest, barterResponseDto);
            barterRequestResponseDtoList.add(barterRequestResponseDto);
        }

        return barterRequestResponseDtoList;
    }

    @Override
    public BarterRequestResponseDto getBarterRequest(Long barterRequestIdx) {
        BarterRequest barterRequest = barterRequestRepository.findByBarterRequestIdx(barterRequestIdx)
                .orElseThrow(() -> new RuntimeException());
        Barter barter = barterRequest.getBarter();
        BarterResponseDto barterResponseDto = barter.toBarterResponseDto(barter);
        BarterRequestResponseDto barterRequestResponseDto = barterRequest.toBarterRequestResponseDto(barterRequest, barterResponseDto);

        return barterRequestResponseDto;
    }

    @Override
    public List<BarterRequestResponseDto> getBarterRequestListByBarterIdx(Long barterIdx) {
        List<BarterRequest> barterRequestList = barterRequestRepository.findByBarterIdx(barterIdx);
        barterRequestResponseDtoList = new ArrayList<>();

        for(BarterRequest barterRequest : barterRequestList) {
            Barter barter = barterRequest.getBarter();
            BarterResponseDto barterResponseDto = barter.toBarterResponseDto(barter);
            BarterRequestResponseDto barterRequestResponseDto = barterRequest.toBarterRequestResponseDto(barterRequest, barterResponseDto);
            barterRequestResponseDtoList.add(barterRequestResponseDto);
        }

        return barterRequestResponseDtoList;
    }

    @Override
    public List<BarterRequestResponseDto> getBarterRequestListByRequester(Long userIdx) {
        List<BarterRequest> barterRequestList = barterRequestRepository.findByUserIdx(userIdx);
        barterRequestResponseDtoList = new ArrayList<>();

        for(BarterRequest barterRequest : barterRequestList) {
            Barter barter = barterRequest.getBarter();
            BarterResponseDto barterResponseDto = barter.toBarterResponseDto(barter);
            BarterRequestResponseDto barterRequestResponseDto = barterRequest.toBarterRequestResponseDto(barterRequest, barterResponseDto);
            barterRequestResponseDtoList.add(barterRequestResponseDto);
        }

        return barterRequestResponseDtoList;
    }

    @Override
    public void addBarterRequest(BarterRequestRegistDto barterRequestRegistDto) {
        Barter barter = barterRepository.findByBarterIdx(barterRequestRegistDto.getBarterIdx())
                .orElseThrow(() -> new RuntimeException());
        User user = userRepository.findByUserId(barterRequestRegistDto.getUserId())
                .orElseThrow(() -> new RuntimeException());
        BarterRequest barterRequest = barterRequestRegistDto.toEntity(barter, user);
        barterRequestRepository.save(barterRequest);
    }

    @Override
    public void deleteBarterRequest(Long barterRequestIdx) {

    }
}
