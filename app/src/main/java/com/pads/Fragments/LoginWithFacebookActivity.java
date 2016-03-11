package com.pads.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.login.widget.LoginButton;
import com.pads.R;

/**
 * Created by daleg on 10/02/2016.
 */
public class LoginWithFacebookActivity extends Fragment {

    LoginButton loginButton;
    CallbackManager callbackManager;
    AccessToken accessToken;
    TextView tvTestData;

    public static LoginWithFacebookActivity newInstance() {
        return new LoginWithFacebookActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login_with_facebook, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        //find all the views
        loginButton = (LoginButton) view.findViewById(R.id.login_button);
        tvTestData = (TextView) view.findViewById(R.id.tvTestData);

    }
}
