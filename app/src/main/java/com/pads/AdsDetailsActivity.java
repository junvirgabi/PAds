package com.pads;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.pads.Entities.Advertisements;

/**
 * Created by srthg on 3/13/2016.
 */
public class AdsDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ads_details);

        // check intent data passed
        Intent intent = getIntent();
        if (intent == null) {
            throw new RuntimeException("AdsDetailsActivity is expecting an int extra passed by Intent");
        }

        // checks if a movie is present
        int position = intent.getIntExtra("key_position", -1);
        if (position == -1) {
            throw new IllegalArgumentException("position passed is invalid.");
        }

        Advertisements ads = new Advertisements();
        String ad = ads.getAdsname().toString();

        if (ad == null) {
            throw new NullPointerException("No movie found at the passed position.");
        }

        // find all views
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(ads.getAdsname());
        }

        ImageView imgMovie = (ImageView) findViewById(R.id.imgAds);
        TextView tvAdsCategory = (TextView) findViewById(R.id.tvAdsCategory);



        tvAdsCategory.setText(ads.getAdsCategory());

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
