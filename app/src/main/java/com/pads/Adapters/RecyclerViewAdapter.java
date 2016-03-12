package com.pads.Adapters;

/**
 * Created by srthg on 3/12/2016.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.pads.Entities.Advertisements;
import com.pads.R;

import java.util.List;

/**
 * Created by srthg on 3/12/2016.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MovieViewHolder> {

    private Context mContext;
    private int mLayoutId;
    private List<Advertisements> mAds;

    public RecyclerViewAdapter(Context context, int layoutId, List<Advertisements> ads) {
        mContext = context;
        mLayoutId = layoutId;
        mAds = ads;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(mLayoutId, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        Advertisements ad = mAds.get(position);

        if (ad != null) {
//            if (holder.imgMovie != null) {
//                holder.imgMovie.setImageResource(movie.getImageId());
//            }
            if (holder.tvName != null) {
                holder.tvName.setText(ad.getAdsname());
            }
            if (holder.tvCategory != null) {
                holder.tvCategory.setText(ad.getAdsCategory());
            }
        }
    }

    @Override
    public int getItemCount() {
        return mAds.size();
    }

    static class MovieViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView imgMovie;
        public TextView tvName;
        public TextView  tvCategory;

        public MovieViewHolder(View view) {
            super(view);

            tvName = (TextView) view.findViewById(R.id.tvLikeName);
            tvCategory = (TextView) view.findViewById(R.id.tvLikeCategory);

            // once an item view (list item or grid item) is clicked
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
