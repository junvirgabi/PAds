package com.pads.Entities;

/**
 * Created by daleg on 13/03/2016.
 */
public class Advertisement {
    private String mAdName;
    private String mAdCategory;
    private int mImgId;

    public Advertisement(String mAdName, String mAdCategory, int mImgId) {
        this.mAdName = mAdName;
        this.mAdCategory = mAdCategory;
        this.mImgId = mImgId;
    }

    public String getmAdName() {
        return mAdName;
    }

    public void setmAdName(String mAdName) {
        this.mAdName = mAdName;
    }

    public int getmImgId() {
        return mImgId;
    }

    public void setmImgId(int mImgId) {
        this.mImgId = mImgId;
    }

    public String getmAdCategory() {
        return mAdCategory;
    }

    public void setmAdCategory(String mAdCategory) {
        this.mAdCategory = mAdCategory;
    }
}
