package com.pads.Entities;

/**
 * Created by daleg on 12/03/2016.
 */
public class UserLikes {
    private String mName;
    private String mCategory;
    private String mId;

    public UserLikes(String mName, String mCategory, String mId) {
        this.mName = mName;
        this.mCategory = mCategory;
        this.mId = mId;
    }

    public UserLikes() {

    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmCategory() {
        return mCategory;
    }

    public void setmCategory(String mCategory) {
        this.mCategory = mCategory;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }
}
