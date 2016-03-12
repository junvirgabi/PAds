package com.pads.Adapters;

/**
 * Created by srthg on 3/12/2016.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.pads.Entities.Advertisements;
import com.pads.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by srthg on 3/12/2016.
 */
public class AdvertisementsAdapter extends ArrayAdapter<Advertisements> {


    private Context mContext;
    private int    mLayoutId;
    private List<Advertisements> mAds= new ArrayList<>();
    private TextView txtName;
    private List<Advertisements> LAds = new ArrayList<>();

    public AdvertisementsAdapter(Context context, int resource, List<Advertisements> ads) {
        super(context, resource, ads);

        mContext = context;
        mLayoutId = resource;
        mAds = ads;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            // Inflate the layout
            convertView = LayoutInflater.from(mContext).inflate(mLayoutId, parent, false);

            // create the view holder
            viewHolder = new ViewHolder();
            viewHolder.tvName = (TextView) convertView.findViewById(R.id.tvLikeName);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        // Set the movie data
        Advertisements ad = mAds.get(position);

        if (ad != null) {
            if (viewHolder.tvName != null) {
                viewHolder.tvName.setText(ad.getAdsname());

            }
        }

        return convertView;
    }

    private static class ViewHolder {
        public TextView  tvName;
    }







}
