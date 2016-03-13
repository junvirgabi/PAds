package com.pads;

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
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.FacebookSdk;
import com.pads.Adapters.ListViewAdapterUserLikes;
import com.pads.Controllers.AdvertisementController;
import com.pads.Entities.Advertisement;
import com.pads.Fragments.ListViewUserLikesFragment;
import com.pads.Fragments.RecyclerViewUserLikesFragment;
import com.pads.Fragments.LoginWithFacebookFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    LoginWithFacebookFragment mLoginWithFacebookFragmentFragment;
    ListViewUserLikesFragment mListViewUserLikesFragment;
    RecyclerViewUserLikesFragment mRecyclerViewUserLikesFragment;

    List<Advertisement> mAds = new ArrayList<>();

    AdvertisementController controller = new AdvertisementController();

    Handler handler = new Handler();

    private ImageView imgAd;

    int j;

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

        imgAd = (ImageView) findViewById(R.id.imgViewAd);

        mAds.addAll(controller.getAds());
        Log.d("MADS", mAds.size() + "");

        handler.post(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < mAds.size(); i++) {
                    try {
                        j = i;
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                imgAd.setImageResource(mAds.get(j).getmImgId());
                            }
                        }).wait(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

//            new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < mAds.size(); i++) {
//                    imgAd.setImageResource(mAds.get(i).getmImgId());
//                }
//            }
//        }).start();
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
        }

        return super.onOptionsItemSelected(item);
    }

    /** Called when leaving the activity */
    @Override
    public void onPause() {
        super.onPause();
    }

    /** Called when returning to the activity */
    @Override
    public void onResume() {
        super.onResume();
    }

    /** Called before the activity is destroyed */
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
            mListViewUserLikesFragment = ListViewUserLikesFragment.newInstance();

            getSupportFragmentManager()
                    .beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .replace(R.id.fragmentContainer, mListViewUserLikesFragment)
                    .commit();
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_pads) {
            mLoginWithFacebookFragmentFragment = LoginWithFacebookFragment.newInstance();

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragmentContainer, mLoginWithFacebookFragmentFragment)
                    .commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
