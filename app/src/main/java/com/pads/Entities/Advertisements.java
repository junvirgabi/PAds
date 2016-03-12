package com.pads.Entities;

/**
 * Created by srthg on 3/12/2016.
 */
public class Advertisements
{
    private String Adsname;
    private String AdsCategory;

    public Advertisements(String adsname, String adsCategory) {

        Adsname = adsname;
        AdsCategory = adsCategory;
    }

    public Advertisements() {

    }

    public String getAdsname() {
        return Adsname;
    }

    public void setAdsname(String adsname) {
        Adsname = adsname;
    }

    public String getAdsCategory() {
        return AdsCategory;
    }

    public void setAdsCategory(String adsCategory) {
        AdsCategory = adsCategory;
    }

}

