package com.pads.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.Profile;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.pads.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;

/**
 * Created by daleg on 10/02/2016.
 */
public class LoginWithFacebookActivity extends Fragment {

    private LoginButton mLoginButton;
    private CallbackManager mCallbackManager;
    private AccessToken mAccessToken;
    private TextView mTvTestData;
    private TextView mTvName;
    //    private ImageView mImgViewProfilePic;
    private Profile mProfile;

//    private FacebookCallback<LoginResult> mCallback = new FacebookCallback<LoginResult>() {
//        @Override
//        public void onSuccess(LoginResult loginResult) {
//
//        }
//
//        @Override
//        public void onCancel() {
//
//        }
//
//        @Override
//        public void onError(FacebookException error) {
//
//        }
//    };

    public static LoginWithFacebookActivity newInstance() {
        return new LoginWithFacebookActivity();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getActivity().getApplicationContext());
        mCallbackManager = CallbackManager.Factory.create();


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login_with_facebook, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        //find all the views
        mLoginButton = (LoginButton) view.findViewById(R.id.login_button);
        mTvTestData = (TextView) view.findViewById(R.id.tvTestData);
        mTvName = (TextView) view.findViewById(R.id.tvName);
//        mProfile = (ImageView) view.findViewById(R.id.imgViewProfilePic);

        mLoginButton.setReadPermissions(Arrays.asList("public_profile", "user_friends", "user_likes"));
        mLoginButton.setFragment(this);
        mLoginButton.registerCallback(mCallbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                mAccessToken = loginResult.getAccessToken();
                mProfile = Profile.getCurrentProfile();

                if (mProfile != null) {
                    mTvTestData.setText(mProfile.getName());
//                    mTvName.setText(mProfile.getName());
                    Log.d("NAME", "" + mProfile.getFirstName());
                }
                Log.d("FB User Token", loginResult.getAccessToken().getToken());
                Log.d("ACCESS TOKEN", "" + mAccessToken);

            }

            @Override
            public void onCancel() {

            }

            @Override
            public void onError(FacebookException error) {

            }
        });

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        mCallbackManager.onActivityResult(requestCode, resultCode, data);
    }
}
