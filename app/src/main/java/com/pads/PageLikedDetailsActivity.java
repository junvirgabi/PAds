package com.pads;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by srthg on 3/13/2016.
 */
public class PageLikedDetailsActivity extends AppCompatActivity {

    static ImageView mImgPagePic;
    static String mPicUrl;
    private TextView mTvPageName;
    private TextView mTvPageCategory;
    private String mName;
    private String mCategoty;

    public static Bitmap getImageBitmap(String sUrl) {
        if (TextUtils.isEmpty(sUrl)) {
            throw new RuntimeException("Url passed is either null or empty");
        }

        try {
            URL url = new URL(sUrl);
            InputStream inputStream = url.openConnection().getInputStream();

            if (inputStream == null) {
                return null;
            }

            return BitmapFactory.decodeStream(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_liked_details);

        // check intent data passed
        Intent intent = getIntent();
        if (intent == null) {
            throw new RuntimeException("PageLikedDetailsActivity is expecting an int extra passed by Intent");
        }

        // checks if a movie is present
        int position = intent.getIntExtra("key_position", -1);
        if (position == -1) {
            throw new IllegalArgumentException("position passed is invalid.");
        }

        if (intent == null) {
            throw new NullPointerException("No movie found at the passed position.");
        }

        mName = intent.getStringExtra("PAGE_NAME");
        mCategoty = intent.getStringExtra("PAGE_CATEGORY");
        mPicUrl = intent.getStringExtra("PAGE_PIC_URL");
        // find all views
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mImgPagePic = (ImageView) findViewById(R.id.imgPagePicture);
        mTvPageName = (TextView) findViewById(R.id.tvPageName);
        mTvPageCategory = (TextView) findViewById(R.id.tvPageCategory);

        mTvPageName.setText("Page Name: " + mName);
        mTvPageCategory.setText("Page Category" + mCategoty);
        new getPagePic().execute();

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(mName);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    static class getPagePic extends AsyncTask<Void, Void, Bitmap> {

        @Override
        protected Bitmap doInBackground(Void... params) {
            return getImageBitmap(mPicUrl);
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            mImgPagePic.setImageBitmap(bitmap);
        }
    }

}
