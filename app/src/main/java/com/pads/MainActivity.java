package com.pads;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.facebook.FacebookSdk;
import com.pads.Controllers.AdvertisementController;
import com.pads.Entities.Advertisement;
import com.pads.Fragments.ListViewUserLikesFragment;
import com.pads.Fragments.LoginWithFacebookFragment;
import com.pads.Fragments.RecyclerViewUserLikesFragment;
import com.pads.Util.AdUtils;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    public AdvertisementController controller = new AdvertisementController();
    public List<Advertisement> mStaticAds = controller.getAds();
    public List<Advertisement> mPointedAds = new ArrayList<>();
    public Handler handler = new Handler();
    public int j;
    LoginWithFacebookFragment mLoginWithFacebookFragmentFragment;
    ListViewUserLikesFragment mListViewUserLikesFragment;
    RecyclerViewUserLikesFragment mRecyclerViewUserLikesFragment;
    private ImageView imgAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        mListViewUserLikesFragment = ListViewUserLikesFragment.newInstance();

        imgAd = (ImageView) findViewById(R.id.imgViewAd);
        imgAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("CLICKED", "kndj");
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://google.com"));
                startActivity(i);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        } else if (id == R.id.action_show_ads) {
            new filterAds().execute();
//            new showAds().execute();

//            Log.d("PADS SIZE", "" + mPointedAds.size());
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Called when leaving the activity
     */
    @Override
    public void onPause() {
        super.onPause();
    }

    /**
     * Called when returning to the activity
     */
    @Override
    public void onResume() {
        super.onResume();
    }

    /**
     * Called before the activity is destroyed
     */
    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_user_likes) {
//            mRecyclerViewUserLikesFragment = RecyclerViewUserLikesFragment.newInstance();
//            new filterAds().execute();
            mListViewUserLikesFragment = ListViewUserLikesFragment.newInstance();

            getSupportFragmentManager()
                    .beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .replace(R.id.fragmentContainer, mListViewUserLikesFragment)
                    .commit();

            getSupportActionBar().setTitle("User's Liked Pages");
        } else if (id == R.id.nav_pads) {
            mLoginWithFacebookFragmentFragment = LoginWithFacebookFragment.newInstance();

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragmentContainer, mLoginWithFacebookFragmentFragment)
                    .commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return super.onOptionsItemSelected(item);
    }

    public class filterAds extends AsyncTask<List<Advertisement>, Void, List<Advertisement>> {

        @Override
        protected List<Advertisement> doInBackground(List<Advertisement>... params) {
            return AdUtils.filterLikesAndAds(mListViewUserLikesFragment.mLikes, mStaticAds);
        }

        @Override
        protected void onPostExecute(List<Advertisement> pointedAds) {
            super.onPostExecute(pointedAds);
            mPointedAds.addAll(pointedAds);
            Log.d("PADS SIZE", "" + mPointedAds.size());

            for (int i = 0; i <= mPointedAds.size(); i++) {
                j = i;
                Log.d("AGI", "" + j);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Log.d("AGI", "" + j);
                        if (j >= mPointedAds.size()) {
                            j = 0;
                        }
                        imgAd.setImageResource(mPointedAds.get(j).getmImgId());
                        j++;
                    }
                }, 5000 * j);
            }
        }
    }

    public class showAds extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... params) {
            Log.d("USER LIKES SOZE", "" + mListViewUserLikesFragment.mLikes.size());
//            for (int i = 0; i <= mStaticAds.size(); i++) {
//                j = i;
////                Log.d("AGI", "" + j);
//                handler.postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
////                        Log.d("AGI", "" + j);
//                        if (j >= mStaticAds.size()) {
//                            j = 0;
//                        }
//                        imgAd.setImageResource(mStaticAds.get(j).getmImgId());
//                        j++;
//                    }
//                }, 10000 * j);
//            }

            return null;
        }
    }

}
