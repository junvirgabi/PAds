package com.pads.API;

import android.os.Bundle;
import android.util.Log;

import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.pads.Entities.UserLikes;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daleg on 12/03/2016.
 */
public class FacebookApi {

    private static final String FB_NAME = "name";
    private static final String FB_LIKES = "likes";
    private static final String FB_DATA = "data";
    private static final String FB_CATEGORY = "category";
    private static final String FB_ID = "id";

    private static JSONObject jsonObject, jsonObject2;
    private static JSONArray jsonArray;

    private static String mId;
    private static String mName;
    private static String mCategory;

    private static List<UserLikes> likes = new ArrayList<>();

    public static List<UserLikes> getUserLikes(AccessToken accessToken) {

        final GraphRequest request = GraphRequest.newMeRequest(accessToken, new GraphRequest.GraphJSONObjectCallback() {
            @Override
            public void onCompleted(JSONObject object, GraphResponse response) {
                try {
                    jsonObject = object.getJSONObject(FB_LIKES);
                    jsonArray = jsonObject.getJSONArray(FB_DATA);
                    for (int i = 0; i < jsonArray.length(); i++) {
                        jsonObject2 = jsonArray.getJSONObject(i);

                        mId = jsonObject2.getString(FB_ID);
                        mName = jsonObject2.getString(FB_NAME);
                        mCategory = jsonObject2.getString(FB_CATEGORY);

                        likes.add(new UserLikes(mName, mCategory, mId));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

        Bundle parameters = new Bundle();
        parameters.putString("fields", "name,likes{name,category}");
        request.setParameters(parameters);
        request.executeAsync();

        return likes;
    }
}
