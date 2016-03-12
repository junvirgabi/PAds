package com.pads.Entities;

/**
 * Created by srthg on 3/12/2016.
 */
public class PageLiked {
    private String mPageName;
    private String mPageCategory;

    public PageLiked(String mPageName, String mPageCategory) {

        this.mPageName = mPageName;
        this.mPageCategory = mPageCategory;
    }

    public PageLiked() {

    }

    public String getmPageName() {
        return mPageName;
    }

    public void setmPageName(String mPageName) {
        this.mPageName = mPageName;
    }

    public String getmPageCategory() {
        return mPageCategory;
    }

    public void setmPageCategory(String mPageCategory) {
        this.mPageCategory = mPageCategory;
    }

}

