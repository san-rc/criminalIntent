package com.santiagoramayo.android.criminalintent;


import java.util.Date;
import java.util.UUID;


public class Crime {
    private UUID mId;
    private String mtitle;
    private Date mDate;
    private boolean msolved;

    public Crime(){
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getmId() {
        return mId;
    }

    public String getMtitle() {
        return mtitle;
    }

    public Date getmDate() {
        return mDate;
    }

    public boolean isMsolved() {
        return msolved;
    }

    public void setmId(UUID mId) {
        this.mId = mId;
    }

    public void setMtitle(String mtitle) {
        this.mtitle = mtitle;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public void setMsolved(boolean msolved) {
        this.msolved = msolved;
    }
}
