package com.example.project.viewmodels;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.example.project.api.AuctionBidRequestDTO;
import com.example.project.api.AuctionConfirmBuyPageResponseDTO;
import com.example.project.api.AuctionConfirmPageResponseDTO;
import com.example.project.api.AuctionConfirmRequestDTO;
import com.example.project.api.AuctionDetailResponseDTO;
import com.example.project.api.AuctionFilterDTO;
import com.example.project.api.AuctionService;
import com.example.project.api.AuctionTradeResponseDTO;
import com.example.project.api.RegisterAuctionDTO;
import com.example.project.api.StoreConfirmPageResponseDTO;
import com.example.project.api.StoreConfirmRequestDTO;
import com.example.project.api.UpdateAuctionDTO;
import com.example.project.di.CustomException;
import com.example.project.sharedpreferences.SharedPreferencesUtil;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import java.io.IOException;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00d6\u0001J\t\u0010 \u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r\u00a8\u0006!"}, d2 = {"Lcom/example/project/viewmodels/AuctionBid;", "", "auctionBidIdx", "", "auctionBidPrice", "", "auctionRegistedDate", "", "auctionBidStatus", "userIdx", "auctionIdx", "(JILjava/lang/String;Ljava/lang/String;JJ)V", "getAuctionBidIdx", "()J", "getAuctionBidPrice", "()I", "getAuctionBidStatus", "()Ljava/lang/String;", "getAuctionIdx", "getAuctionRegistedDate", "getUserIdx", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"})
public final class AuctionBid {
    private final long auctionBidIdx = 0L;
    private final int auctionBidPrice = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String auctionRegistedDate = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String auctionBidStatus = null;
    private final long userIdx = 0L;
    private final long auctionIdx = 0L;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.project.viewmodels.AuctionBid copy(long auctionBidIdx, int auctionBidPrice, @org.jetbrains.annotations.NotNull
    java.lang.String auctionRegistedDate, @org.jetbrains.annotations.NotNull
    java.lang.String auctionBidStatus, long userIdx, long auctionIdx) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public AuctionBid(long auctionBidIdx, int auctionBidPrice, @org.jetbrains.annotations.NotNull
    java.lang.String auctionRegistedDate, @org.jetbrains.annotations.NotNull
    java.lang.String auctionBidStatus, long userIdx, long auctionIdx) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getAuctionBidIdx() {
        return 0L;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getAuctionBidPrice() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAuctionRegistedDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAuctionBidStatus() {
        return null;
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final long getUserIdx() {
        return 0L;
    }
    
    public final long component6() {
        return 0L;
    }
    
    public final long getAuctionIdx() {
        return 0L;
    }
}