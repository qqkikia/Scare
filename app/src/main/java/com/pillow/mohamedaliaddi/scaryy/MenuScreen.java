package com.pillow.mohamedaliaddi.scaryy;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ShareActionProvider;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;


public class MenuScreen extends ActionBarActivity {
private int i;
    Intent intent;
    private ShareActionProvider mShareActionProvider;
    final MediaPlayer mp = new MediaPlayer();
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);        setContentView(R.layout.activity_menu_screen);
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2050801508710646/9026338016");
        intent = new Intent(this, Tutorial.class);
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                requestNewInterstitial();

                startActivity(intent);
            }
        });
        requestNewInterstitial();
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }

    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("ca-app-pub-2050801508710646/9026338016")
                .build();

        mInterstitialAd.loadAd(adRequest);
    }


    public void setShareIntent(View view) {
        Intent shareIntent =
                new Intent(android.content.Intent.ACTION_SEND);

//set the type
        shareIntent.setType("text/plain");

//add a subject
        shareIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,
                "This Jumpscare App is sooo scary!");

//build the body of the message to be shared
        String shareMessage = "https://play.google.com/store/apps/details?id=com.pillow.mohamedaliaddi.scaryy";

//add the message
        shareIntent.putExtra(android.content.Intent.EXTRA_TEXT,
                shareMessage);

//start the chooser for sharing
        startActivity(Intent.createChooser(shareIntent,
                "Where to share to?"));
    }

    public void PlayGame(View view){
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            requestNewInterstitial();
        } else{startActivity(intent);}



    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu_screen, menu);
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

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_menu_screen, container, false);
            return rootView;
        }
    }
}
