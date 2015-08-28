package com.pillow.mohamedaliaddi.scaryy;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.os.Vibrator;

import com.millennialmedia.android.MMInterstitial;
import com.millennialmedia.android.MMRequest;


public class GameScreen extends ActionBarActivity {

private int i;
    private int y;
    final MediaPlayer mp = new MediaPlayer();
    MMInterstitial interstitial;
    MMRequest request;

public void pic1(View view){


    Intent i = new Intent(this, LoseScreen.class);
    startActivity(i);


}
    public void pic4(View view){
        Intent i = new Intent(this, LoseScreen.class);
        startActivity(i);
    }
    public void pic5(View view) {
        ImageView first = (ImageView) findViewById(R.id.pic5);
        if (i > 0 && view.equals(first)) {
            i = 0;

            first.setImageResource(R.drawable.closedflower1);
            ImageView third = (ImageView)findViewById(R.id.points);
            third.setImageDrawable(getResources().getDrawable(R.drawable.six));
            IntentLauncher8 i = new IntentLauncher8();
            i.start();
        }else{Intent i = new Intent(this, LoseScreen.class);
            startActivity(i);}
    }
    public void pic6(View view) {
        ImageView first = (ImageView) findViewById(R.id.pic6);
        if (i > 0) {
            i = 0;

            Intent i = new Intent(this, LoseScreen.class);
            startActivity(i);
        }else{Intent i = new Intent(this, LoseScreen.class);
            startActivity(i);}
    }
    public void pic7(View view) {
        ImageView first = (ImageView) findViewById(R.id.pic7);
        if (i >0 && view.equals(first)) {
            i = 0;
            first.setImageResource(R.drawable.closedflower1);
            ImageView third = (ImageView)findViewById(R.id.points);
            third.setImageDrawable(getResources().getDrawable(R.drawable.eight));
            IntentLauncher11 i = new IntentLauncher11();
            i.start();
        }else{Intent i = new Intent(this, LoseScreen.class);
            startActivity(i);}
    }
    public void pic9(View view){
        Intent i = new Intent(this, LoseScreen.class);
        startActivity(i);
    }
    public void pic10(View view){
        Intent i = new Intent(this, LoseScreen.class);
        startActivity(i);
    }
    public void pic11(View view){
        if(i>0){
            i = 0;
            ImageView first = (ImageView)findViewById(R.id.pic11);
            first.setImageResource(R.drawable.closedflower1);
            ImageView third = (ImageView)findViewById(R.id.points);
            third.setImageDrawable(getResources().getDrawable(R.drawable.seven));
            IntentLauncher10 i = new IntentLauncher10();
            i.start();
        }else{Intent i = new Intent(this, LoseScreen.class);
            startActivity(i);}
    }
    public void pic12(View view){
        Intent i = new Intent(this, LoseScreen.class);
        startActivity(i);
    }
    public void pic14(View view) {
        ImageView first = (ImageView) findViewById(R.id.pic14);
        if (i > 0) {
            i = 0;

            Intent i = new Intent(this, LoseScreen.class);
            startActivity(i);
        }else{Intent i = new Intent(this, LoseScreen.class);
            startActivity(i);}
    }
    public void pic15(View view){
        if(i>0){
            i = 0;
            ImageView first = (ImageView)findViewById(R.id.pic15);
            first.setImageResource(R.drawable.closedflower1);
            ImageView third = (ImageView)findViewById(R.id.points);
            third.setImageDrawable(getResources().getDrawable(R.drawable.nine));
            IntentLauncher20 i = new IntentLauncher20();
            i.start();
        } else{Intent i = new Intent(this, LoserScreen.class);
            startActivity(i);}
    }
    public void pic16(View view){
        Intent i = new Intent(this, LoseScreen.class);
        startActivity(i);
    }

    public void pic13(View view){
        if(i>0){
            i = 0;
            ImageView first = (ImageView)findViewById(R.id.pic13);
            first.setImageResource(R.drawable.closedflower1);
            ImageView third = (ImageView)findViewById(R.id.points);
            third.setImageDrawable(getResources().getDrawable(R.drawable.one));
            IntentLauncher2 i = new IntentLauncher2();
            i.start();
        } else{Intent i = new Intent(this, LoserScreen.class);
            startActivity(i);}
    }
    public void pic3(View view){
        if(i>0){
            i = 0;
            ImageView first = (ImageView)findViewById(R.id.pic3);
            first.setImageResource(R.drawable.closedflower1);
            ImageView third = (ImageView)findViewById(R.id.points);
            third.setImageDrawable(getResources().getDrawable(R.drawable.two));
            IntentLauncher3 i = new IntentLauncher3();
            i.start();
        }else{Intent i = new Intent(this, LoseScreen.class);
            startActivity(i);}
    }

    public void pic17(View view) {
        ImageView first = (ImageView) findViewById(R.id.pic17);
        if (i > 0) {
            i = 0;

            Intent i = new Intent(this, LoseScreen.class);
            startActivity(i);
        }else{Intent i = new Intent(this, LoseScreen.class);
            startActivity(i);}
    }

    public void pic8(View view) {
        ImageView first = (ImageView) findViewById(R.id.pic8);
        if (i > 0 && view.equals(first)) {
            i = 0;

            first.setImageResource(R.drawable.closedflower1);
            ImageView third = (ImageView)findViewById(R.id.points);
            third.setImageDrawable(getResources().getDrawable(R.drawable.three));
            IntentLauncher5 i = new IntentLauncher5();
            i.start();
        }else{Intent i = new Intent(this, LoseScreen.class);
            startActivity(i);}
    }
    public void pic2(View view) {
        ImageView first = (ImageView) findViewById(R.id.pic2);
        if (i > 0 && view.equals(first)) {
            i = 0;

            first.setImageResource(R.drawable.closedflower1);
            ImageView third = (ImageView)findViewById(R.id.points);
            third.setImageDrawable(getResources().getDrawable(R.drawable.four));
            IntentLauncher6 i = new IntentLauncher6();
            i.start();
        }else{Intent i = new Intent(this, LoseScreen.class);
            startActivity(i);}
    }
    public void pic18(View view) {
        ImageView first = (ImageView) findViewById(R.id.pic18);
        if (i >0 && view.equals(first)) {
            i = 0;
            first.setImageResource(R.drawable.closedflower1);
            ImageView third = (ImageView)findViewById(R.id.points);
            third.setImageDrawable(getResources().getDrawable(R.drawable.five));
            IntentLauncher7 i = new IntentLauncher7();
            i.start();
        }else{Intent i = new Intent(this, LoseScreen.class);
            startActivity(i);}
    }
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            i = 0;
            y = 0;
                  setContentView(R.layout.activity_game_screen);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }

IntentLauncher i = new IntentLauncher();
        i.start();
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game_screen, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_game_screen, container, false);
            return rootView;
        }
    }
    public class IntentLauncher extends Thread {
        @Override
        /**
         * Sleep for some time and than start new activity.
         */
        public void run() {
            try {
                // Sleeping
                Thread.sleep(1000);
                runOnUiThread(new Runnable() {
                    public void run() {
                        ImageView first = (ImageView)findViewById(R.id.pic13);
                        first.setImageResource(R.drawable.goodflower1);
                    }
                });
            } catch (Exception e) {
                Log.e("oogooboogoo", e.getMessage());
            }
            i++;

        }
    }
    public class IntentLauncher2 extends Thread {
        @Override
        /**
         * Sleep for some time and than start new activity.
         */
        public void run() {


                try {
                    // Sleeping
                    Thread.sleep(1000);
                    runOnUiThread(new Runnable() {
                        public void run() {
                            ImageView first = (ImageView) findViewById(R.id.pic3);
                            first.setImageResource(R.drawable.goodflower1);
                        }
                    });
                } catch (Exception e) {
                    Log.e("oogooboogoo", e.getMessage());
                }
                i = 1;

            }

    }

    public class IntentLauncher3 extends Thread {
        @Override
        /**
         * Sleep for some time and than start new activity.
         */
        public void run() {
            try {
                // Sleeping
                Thread.sleep(1000);
                runOnUiThread(new Runnable() {
                    public void run() {
                        ImageView first = (ImageView)findViewById(R.id.pic17);
                        first.setImageResource(R.drawable.badflower1);
                        IntentLauncher4 i = new IntentLauncher4();
                        i.start();
                    }
                });
            } catch (Exception e) {
                Log.e("oogooboogoo", e.getMessage());
            }
            i=1;

        }
    }

    public class IntentLauncher4 extends Thread {
        @Override
        /**
         * Sleep for some time and than start new activity.
         */
        public void run() {
            try {
                // Sleeping
                Thread.sleep(1000);
                runOnUiThread(new Runnable() {
                    public void run() {
                        ImageView second = (ImageView)findViewById(R.id.pic17);
                        second.setImageResource(R.drawable.closedflower1);
                        ImageView first = (ImageView)findViewById(R.id.pic8);
                        first.setImageResource(R.drawable.goodflower1);
                    }
                });
            } catch (Exception e) {
                Log.e("oogooboogoo", e.getMessage());
            }
            i=1;

        }


    }
    public class IntentLauncher5 extends Thread {
        @Override
        /**
         * Sleep for some time and than start new activity.
         */
        public void run() {
            try {
                // Sleeping
                Thread.sleep(1000);
                runOnUiThread(new Runnable() {
                    public void run() {
                        ImageView first = (ImageView)findViewById(R.id.pic2);
                        first.setImageResource(R.drawable.goodflower1);
                    }
                });
            } catch (Exception e) {
                Log.e("oogooboogoo", e.getMessage());
            }
            i=1;

        }
    }

    public class IntentLauncher6 extends Thread {
        @Override
        /**
         * Sleep for some time and than start new activity.
         */
        public void run() {
            try {
                // Sleeping
                Thread.sleep(1000);
                runOnUiThread(new Runnable() {
                    public void run() {
                        ImageView first = (ImageView)findViewById(R.id.pic18);
                        first.setImageResource(R.drawable.goodflower1);
                    }
                });
            } catch (Exception e) {
                Log.e("oogooboogoo", e.getMessage());
            }
            i=1;

        }
    }

    public class IntentLauncher7 extends Thread {
        @Override
        /**
         * Sleep for some time and than start new activity.
         */
        public void run() {
            try {
                // Sleeping
                Thread.sleep(1000);
                runOnUiThread(new Runnable() {
                    public void run() {
                        ImageView first = (ImageView)findViewById(R.id.pic5);
                        first.setImageResource(R.drawable.goodflower1);
                    }
                });
            } catch (Exception e) {
                Log.e("oogooboogoo", e.getMessage());
            }
            i=1;

        }
    }

    public class IntentLauncher8 extends Thread {
        @Override
        /**
         * Sleep for some time and than start new activity.
         */
        public void run() {
            try {
                // Sleeping
                Thread.sleep(1000);
                runOnUiThread(new Runnable() {
                    public void run() {
                        ImageView first = (ImageView)findViewById(R.id.pic14);
                        first.setImageResource(R.drawable.badflower1);
                        IntentLauncher9 i = new IntentLauncher9();
                        i.start();
                    }
                });
            } catch (Exception e) {
                Log.e("oogooboogoo", e.getMessage());
            }
            i=1;

        }
    }


    public class IntentLauncher9 extends Thread {
        @Override
        /**
         * Sleep for some time and than start new activity.
         */
        public void run() {
            try {
                // Sleeping
                Thread.sleep(1000);
                runOnUiThread(new Runnable() {
                    public void run() {
                        ImageView first = (ImageView)findViewById(R.id.pic14);
                        first.setImageResource(R.drawable.closedflower1);
                        ImageView second = (ImageView)findViewById(R.id.pic11);
                        second.setImageResource(R.drawable.goodflower1);
                    }
                });
            } catch (Exception e) {
                Log.e("oogooboogoo", e.getMessage());
            }
            i=1;

        }
    }
    public class IntentLauncher10 extends Thread {
        @Override
        /**
         * Sleep for some time and than start new activity.
         */
        public void run() {
            try {
                // Sleeping
                Thread.sleep(1000);
                runOnUiThread(new Runnable() {
                    public void run() {
                        ImageView first = (ImageView)findViewById(R.id.pic7);
                        first.setImageResource(R.drawable.goodflower1);
                    }
                });
            } catch (Exception e) {
                Log.e("oogooboogoo", e.getMessage());
            }
            i=1;

        }
    }

    public class IntentLauncher11 extends Thread {
        @Override
        /**
         * Sleep for some time and than start new activity.
         */
        public void run() {
            try {
                // Sleeping
                Thread.sleep(1000);
                runOnUiThread(new Runnable() {
                    public void run() {
                        ImageView first = (ImageView)findViewById(R.id.pic6);
                        first.setImageResource(R.drawable.badflower1);
                        IntentLauncher12 i = new IntentLauncher12();
                        i.start();
                    }
                });
            } catch (Exception e) {
                Log.e("oogooboogoo", e.getMessage());
            }
            i=1;

        }
    }

    public class IntentLauncher12 extends Thread {
        @Override
        /**
         * Sleep for some time and than start new activity.
         */
        public void run() {
            try {
                // Sleeping
                Thread.sleep(1000);
                runOnUiThread(new Runnable() {
                    public void run() {
                        ImageView first = (ImageView)findViewById(R.id.pic6);
                        first.setImageResource(R.drawable.closedflower1);
                        ImageView second = (ImageView)findViewById(R.id.pic15);
                        second.setImageResource(R.drawable.goodflower1);

                    }
                });
            } catch (Exception e) {
                Log.e("oogooboogoo", e.getMessage());
            }
            i=1;

        }
    }

    private class IntentLauncher20 extends Thread {
        @Override
        /**
         * Sleep for some time and than start new activity.
         */
        public void run() {
            try {
                // Sleeping
                Thread.sleep(1000);
            } catch (Exception e) {
                Log.e("oogooboogoo", e.getMessage());
            }

            // Start main activity
            Intent intent = new Intent(GameScreen.this, ScareScreen.class);
            startActivity(intent);
            finish();
        }
    }
}
