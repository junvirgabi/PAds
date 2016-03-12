package com.pads.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.pads.Entities.UserLikes;
import com.pads.R;

import java.util.List;

/**
 * Created by daleg on 13/03/2016.
 */
public class ListViewAdapterUserLikes extends ArrayAdapter<UserLikes> {

    private Context mContext;
    private int mLayoutId;
    private List<UserLikes> mLikes;

    public ListViewAdapterUserLikes(Context context, int resource, List<UserLikes> objects) {
        super(context, resource, objects);

        this.mContext = context;
        this.mLayoutId = resource;
        this.mLikes = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(mLayoutId, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.mTvName = (TextView) convertView.findViewById(R.id.tvLikeName);
            viewHolder.mTvCategory = (TextView) convertView.findViewById(R.id.tvLikeCategory);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        UserLikes userLikes = mLikes.get(position);

        if (userLikes != null) {
            if (viewHolder.mTvName != null) {
                viewHolder.mTvName.setText(userLikes.getmName());
            }
            if (viewHolder.mTvCategory != null) {
                viewHolder.mTvCategory.setText(userLikes.getmCategory());
            }
        }

        return convertView;

    }

    private static class ViewHolder {
        public TextView mTvName;
        public TextView mTvCategory;
    }
}
