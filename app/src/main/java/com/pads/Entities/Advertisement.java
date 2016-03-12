package com.pads.Entities;

/**
 * Created by daleg on 13/03/2016.
 */
public class Advertisement {
    private String mAdName;
    private String mAdCategory;

    public Advertisement() {
    }

    public Advertisement(String mAdName, String mAdCategory) {
        this.mAdName = mAdName;
        this.mAdCategory = mAdCategory;
    }

    public String getmAdName() {
        return mAdName;
    }

    public void setmAdName(String mAdName) {
        this.mAdName = mAdName;
    }

    public String getmAdCategory() {
        return mAdCategory;
    }

    public void setmAdCategory(String mAdCategory) {
        this.mAdCategory = mAdCategory;
    }
}
