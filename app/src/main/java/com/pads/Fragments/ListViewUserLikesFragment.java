package com.pads.Fragments;

/**
 * Created by srthg on 3/12/2016.
 */

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.facebook.AccessToken;
import com.pads.API.FacebookApi;
import com.pads.Adapters.ListViewAdapterUserLikes;
import com.pads.Entities.UserLikes;
import com.pads.MainActivity;
import com.pads.PageLikedDetailsActivity;
import com.pads.R;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by srthg on 3/12/2016.
 */
public class ListViewUserLikesFragment extends Fragment implements AdapterView.OnItemClickListener {

    private ListView mListView;
    private List<UserLikes> mLikes = new ArrayList<>();

    private ListViewAdapterUserLikes adapter;

    public static ListViewUserLikesFragment newInstance() {
        return new ListViewUserLikesFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FetchLikes fl = new FetchLikes();
        fl.execute();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_listview, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        // find all the views
        mListView = (ListView) view.findViewById(R.id.listView);

        // create a new instance of adapter
        adapter = new ListViewAdapterUserLikes(getActivity(), R.layout.listview_list_item, mLikes);

        // set the adapter
        mListView.setAdapter(adapter);

        // set item click listener
        mListView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(getActivity(), PageLikedDetailsActivity.class);
        intent.putExtra("key_position", position);
        intent.putExtra("PAGE_NAME", (Serializable) mLikes.get(position).getmName());
        intent.putExtra("PAGE_CATEGORY", (Serializable) mLikes.get(position).getmCategory());
        startActivity(intent);
    }

    public class FetchLikes extends AsyncTask<AccessToken, Void, List<UserLikes>> {

        @Override
        protected List<UserLikes> doInBackground(AccessToken... params) {
            return FacebookApi.getUserLikes(AccessToken.getCurrentAccessToken());
        }

        @Override
        protected void onPostExecute(List<UserLikes> userLikes) {
            super.onPostExecute(userLikes);
            adapter.addAll(userLikes);
        }
    }
}

