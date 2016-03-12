package com.pads.Adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pads.Entities.UserLikes;
import com.pads.R;

import java.util.List;

/**
 * Created by daleg on 12/03/2016.
 */
public class RecyclerViewAdapterUserLikes extends RecyclerView.Adapter<RecyclerViewAdapterUserLikes.UserLikesHolder> {

    private Context mContext;
    private int mLayoutId;
    private List<UserLikes> mLikes;

    public RecyclerViewAdapterUserLikes(Context mContext, int mLayoutId, List<UserLikes> mLikes) {
        this.mContext = mContext;
        this.mLayoutId = mLayoutId;
        this.mLikes = mLikes;
    }

    @Override
    public UserLikesHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(mLayoutId, parent, false);
        return new UserLikesHolder(view);
    }

    @Override
    public void onBindViewHolder(UserLikesHolder holder, int position) {
        UserLikes userLikes = mLikes.get(position);

        if (userLikes != null) {
            if (holder.tvLikeName != null) {
                holder.tvLikeName.setText(userLikes.getmName());
            }
            if (holder.tvLikeCategory != null) {
                holder.tvLikeCategory.setText(userLikes.getmCategory());
            }
        }
    }

    @Override
    public int getItemCount() {
        return mLikes.size();
    }

    static class UserLikesHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public CardView cardView;
        public TextView tvLikeName;
        public TextView tvLikeCategory;

        public UserLikesHolder(View itemView) {
            super(itemView);

            cardView = (CardView) itemView.findViewById(R.id.cardView);
            tvLikeName = (TextView) itemView.findViewById(R.id.tvLikeName);
            tvLikeCategory = (TextView) itemView.findViewById(R.id.tvLikeCategory);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
