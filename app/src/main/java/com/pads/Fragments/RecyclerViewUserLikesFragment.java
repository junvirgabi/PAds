package com.pads.Fragments;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.AccessToken;
import com.pads.API.FacebookApi;
import com.pads.Adapters.RecyclerViewAdapterUserLikes;
import com.pads.Entities.UserLikes;
import com.pads.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daleg on 12/03/2016.
 */
public class RecyclerViewUserLikesFragment extends Fragment {

    RecyclerViewAdapterUserLikes mRecyclerViewAdapterUserLikes;
    private RecyclerView recyclerView;
    private TextView tvEmpty;
    private List<UserLikes> mLikes = new ArrayList<>();

    public static RecyclerViewUserLikesFragment newInstance() {
        return new RecyclerViewUserLikesFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FetchLikes fl = new FetchLikes();
        fl.execute();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_recycler_view_list, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        //find all the views
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerListView);
        tvEmpty = (TextView) view.findViewById(R.id.empty);

        recyclerView.setHasFixedSize(true);

        LinearLayoutManager mLinearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLinearLayoutManager);

        mRecyclerViewAdapterUserLikes = new RecyclerViewAdapterUserLikes(getContext(), R.layout.recycler_list_item, mLikes);

        recyclerView.setAdapter(mRecyclerViewAdapterUserLikes);

        if (mRecyclerViewAdapterUserLikes.getItemCount() == 0) {
            tvEmpty.setVisibility(View.VISIBLE);
        } else {
            tvEmpty.setVisibility(View.INVISIBLE);
        }
    }

    public class FetchLikes extends AsyncTask<AccessToken, Void, List<UserLikes>> {

        @Override
        protected List<UserLikes> doInBackground(AccessToken... params) {
            return FacebookApi.getUserLikes(AccessToken.getCurrentAccessToken());
        }

        @Override
        protected void onPostExecute(List<UserLikes> userLikes) {
            super.onPostExecute(userLikes);
            Log.d("ACCESS TOKEN", AccessToken.getCurrentAccessToken().getToken());
            Log.d("LIKES", mLikes.size() + "");
        }
    }
}
