package com.pads.Util;

import android.util.Log;

import com.pads.Entities.Advertisement;
import com.pads.Entities.UserLikes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daleg on 14/03/2016.
 */
public class AdUtils {

    static final int numOfStaticAds = 47;

    public static List<Advertisement> filterLikesAndAds(List<UserLikes> userLikesList, List<Advertisement> staticAds) {
        List<Advertisement> filteredAds = new ArrayList<>();

        Log.d("AdUtils", "1st param: " + userLikesList.size());
        Log.d("AdUtils", "2st param: " + staticAds.size());
        for (int i = 0; i < userLikesList.size(); i++) {
            for (int j = i, k = 0; k < numOfStaticAds; i++) {
                if (userLikesList.get(j).getmCategory().equals(staticAds.get(k).getmAdCategory())) {
                    filteredAds.add(staticAds.get(k));
                }
            }
        }

        return filteredAds;
    }
}
