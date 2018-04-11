package com.dingess.talktome;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends ActionBarActivity implements MediaPlayer.OnCompletionListener,
MediaPlayer.OnErrorListener{

    private MediaPlayer mMcDonalds;
    private MediaPlayer mPizza;
    private MediaPlayer mPepsi;
    private MediaPlayer mCategory;
    private MediaPlayer mWater;
    private MediaPlayer mBicycle;
    private MediaPlayer mSwimming;
    private MediaPlayer mReadBooks;
    private MediaPlayer mBlowBubbles;
    private MediaPlayer mDriveCar;
    private MediaPlayer mEatCookie;
    private MediaPlayer mEatChicken;
    private MediaPlayer mDrinkGrapefruit;
    private MediaPlayer mDrinkLemonade;
    private MediaPlayer mDrinkOrange;
    private MediaPlayer mEatRice;
    private MediaPlayer mEatDrumstick;
    private MediaPlayer mUsePotty;
    private MediaPlayer mPlayBall;
    private MediaPlayer mGoPlay;
    private MediaPlayer mExcited;
    private MediaPlayer mHappy;
    private MediaPlayer mSad;
    private MediaPlayer mColor;
    private MediaPlayer mSleep;
    private MediaPlayer mPark;
    private MediaPlayer mTV;
    private boolean isOnePlaying;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMcDonalds = MediaPlayer.create(getApplicationContext(), R.raw.eatmcdonalds);
        mPizza = MediaPlayer.create(getApplicationContext(), R.raw.eatpizza);
        mPepsi = MediaPlayer.create(getApplicationContext(), R.raw.drinkpepsi);
        mCategory = MediaPlayer.create(getApplicationContext(), R.raw.category);
        mWater = MediaPlayer.create(getApplicationContext(), R.raw.drinkwater);
        mBicycle = MediaPlayer.create(getApplicationContext(), R.raw.ridebicycle);
        mSwimming = MediaPlayer.create(getApplicationContext(), R.raw.goswimming);
        mReadBooks = MediaPlayer.create(getApplicationContext(), R.raw.readbooks);
        mBlowBubbles = MediaPlayer.create(getApplicationContext(), R.raw.bubbles);
        mDriveCar = MediaPlayer.create(getApplicationContext(), R.raw.drivecar);
        mEatCookie = MediaPlayer.create(getApplicationContext(), R.raw.eatcookie);
        mEatChicken = MediaPlayer.create(getApplicationContext(), R.raw.eatchicken);
        mDrinkGrapefruit = MediaPlayer.create(getApplicationContext(), R.raw.drinkgrapefruit);
        mDrinkLemonade = MediaPlayer.create(getApplicationContext(), R.raw.drinklemonade);
        mDrinkOrange = MediaPlayer.create(getApplicationContext(), R.raw.drinkorange);
        mEatRice = MediaPlayer.create(getApplicationContext(), R.raw.eatrice);
        mEatDrumstick = MediaPlayer.create(getApplicationContext(), R.raw.eatdrumstick);
        mUsePotty = MediaPlayer.create(getApplicationContext(), R.raw.usepotty);
        mPlayBall = MediaPlayer.create(getApplicationContext(), R.raw.playball);
        mGoPlay = MediaPlayer.create(getApplicationContext(), R.raw.goplay);
        mExcited = MediaPlayer.create(getApplicationContext(), R.raw.excited);
        mHappy = MediaPlayer.create(getApplicationContext(), R.raw.happy);
        mSad = MediaPlayer.create(getApplicationContext(), R.raw.sad);
        mColor = MediaPlayer.create(getApplicationContext(), R.raw.color);
        mSleep = MediaPlayer.create(getApplicationContext(), R.raw.sleep);
        mPark = MediaPlayer.create(getApplicationContext(), R.raw.park);
        mTV = MediaPlayer.create(getApplicationContext(), R.raw.tv);
        isOnePlaying = false;

        mMcDonalds.setOnCompletionListener(this);
        mPizza.setOnCompletionListener(this);
        mPepsi.setOnCompletionListener(this);
        mCategory.setOnCompletionListener(this);
        mWater.setOnCompletionListener(this);
        mBicycle.setOnCompletionListener(this);
        mSwimming.setOnCompletionListener(this);
        mReadBooks.setOnCompletionListener(this);
        mBlowBubbles.setOnCompletionListener(this);
        mDriveCar.setOnCompletionListener(this);
        mEatCookie.setOnCompletionListener(this);
        mEatChicken.setOnCompletionListener(this);
        mDrinkGrapefruit.setOnCompletionListener(this);
        mDrinkLemonade.setOnCompletionListener(this);
        mDrinkOrange.setOnCompletionListener(this);
        mEatRice.setOnCompletionListener(this);
        mEatDrumstick.setOnCompletionListener(this);
        mUsePotty.setOnCompletionListener(this);
        mPlayBall.setOnCompletionListener(this);
        mGoPlay.setOnCompletionListener(this);
        mExcited.setOnCompletionListener(this);
        mHappy.setOnCompletionListener(this);
        mSad.setOnCompletionListener(this);
        mColor.setOnCompletionListener(this);
        mSleep.setOnCompletionListener(this);
        mPark.setOnCompletionListener(this);
        mTV.setOnCompletionListener(this);

        mMcDonalds.setOnErrorListener(this);
        mPizza.setOnErrorListener(this);
        mPepsi.setOnErrorListener(this);
        mCategory.setOnErrorListener(this);
        mWater.setOnErrorListener(this);
        mBicycle.setOnErrorListener(this);
        mSwimming.setOnErrorListener(this);
        mReadBooks.setOnErrorListener(this);
        mBlowBubbles.setOnErrorListener(this);
        mDriveCar.setOnErrorListener(this);
        mEatCookie.setOnErrorListener(this);
        mEatChicken.setOnErrorListener(this);
        mDrinkGrapefruit.setOnErrorListener(this);
        mDrinkLemonade.setOnErrorListener(this);
        mDrinkOrange.setOnErrorListener(this);
        mEatRice.setOnErrorListener(this);
        mEatDrumstick.setOnErrorListener(this);
        mUsePotty.setOnErrorListener(this);
        mPlayBall.setOnErrorListener(this);
        mGoPlay.setOnErrorListener(this);
        mExcited.setOnErrorListener(this);
        mHappy.setOnErrorListener(this);
        mSad.setOnErrorListener(this);
        mColor.setOnErrorListener(this);
        mSleep.setOnErrorListener(this);
        mPark.setOnErrorListener(this);
        mTV.setOnErrorListener(this);

    }

    @Override
    protected void onStart(){
        super.onStart();
        boolean doHandler = false;

        PowerManager pm = (PowerManager) getSystemService(Context.POWER_SERVICE);

        if (Build.VERSION.SDK_INT < 21) {
            doHandler = pm.isScreenOn();
        }else{
            doHandler = pm.isInteractive();
        }

        if(doHandler) {
            // Execute some code after 1 second has passed
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    mCategory.start();
                }
            }, 1000);
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

    @Override
    protected void onDestroy(){
        mMcDonalds.release();
        mPizza.release();
        mPepsi.release();
        mCategory.release();
        mWater.release();
        mBicycle.release();
        mSwimming.release();
        mReadBooks.release();
        mBlowBubbles.release();
        mDriveCar.release();
        mEatCookie.release();
        mEatChicken.release();
        mDrinkGrapefruit.release();
        mDrinkLemonade.release();
        mDrinkOrange.release();
        mEatRice.release();
        mEatDrumstick.release();
        mUsePotty.release();
        mPlayBall.release();
        mGoPlay.release();
        mExcited.release();
        mHappy.release();
        mSad.release();
        mColor.release();
        mSleep.release();
        mPark.release();
        mTV.release();
        super.onDestroy();
    }

    public boolean onError(MediaPlayer mp, int what, int extra) {
        mp.stop();
        isOnePlaying = false;
        return true;
    }

    public void onCompletion(MediaPlayer mp)
    {
        isOnePlaying = false;
    }

    public void onFoodClick(View v){
        setContentView(R.layout.activity_food);
    }

    public void onDrinkClick(View v){
        setContentView(R.layout.activity_drink);
    }

    public void onActivitiesClick(View v){
        setContentView(R.layout.activity_activities);
    }

    public void onExpressionsClick(View v){
        setContentView(R.layout.activity_expressions);
    }

    public void onCategoryClick(View v){
        setContentView(R.layout.activity_main);
        if(!isOnePlaying){
            isOnePlaying = true;
            mCategory.start();
        }
    }

    public void onMcDonaldsClick(View v){
        if(!isOnePlaying){
            isOnePlaying = true;
            mMcDonalds.start();
        }
    }

    public void onPizzaClick(View v){
        if(!isOnePlaying){
            isOnePlaying = true;
            mPizza.start();
        }
    }

    public void onPepsiClick(View v){
        if(!isOnePlaying){
            isOnePlaying = true;
            mPepsi.start();
        }
    }

    public void onWaterClick(View v){
        if(!mWater.isPlaying() && !isOnePlaying){
            isOnePlaying = true;
            mWater.start();
        }
    }

    public void onBicyceClick(View v){
        if(!isOnePlaying){
            isOnePlaying = true;
            mBicycle.start();
        }
    }

    public void onSwimmingClick(View v){
        if(!isOnePlaying){
            isOnePlaying = true;
            mSwimming.start();
        }
    }

    public void onReadBooks(View v){
        if(!isOnePlaying){
            isOnePlaying = true;
            mReadBooks.start();
        }
    }

    public void onBlowBubbles(View v){
        if(!isOnePlaying){
            isOnePlaying = true;
            mBlowBubbles.start();
        }
    }

    public void onDriveCar(View v){
        if(!isOnePlaying){
            isOnePlaying = true;
            mDriveCar.start();
        }
    }

    public void onEatCookie(View v){
        if(!isOnePlaying){
            isOnePlaying = true;
            mEatCookie.seekTo(0);
            mEatCookie.start();
        }
    }

    public void onEatChicken(View v){

        if(!isOnePlaying){
            isOnePlaying = true;
            mEatChicken.seekTo(0);
            mEatChicken.start();
        }
    }

    public void onGrapefruit(View v){
        if(!isOnePlaying){
            isOnePlaying = true;
            mDrinkGrapefruit.start();
        }
    }

    public void onLemonade(View v){
        if(!isOnePlaying){
            isOnePlaying = true;
            mDrinkLemonade.start();
        }
    }

    public void onOrange(View v){
        if(!isOnePlaying){
            isOnePlaying = true;
            mDrinkOrange.start();
        }
    }

    public void onEatRice(View v){
        if(!isOnePlaying){
            isOnePlaying = true;
            mEatRice.start();
        }
    }

    public void onEatDrumstick(View v){
        if(!isOnePlaying){
            isOnePlaying = true;
            mEatDrumstick.start();
        }
    }

    public void onUsePotty(View v){
        if(!isOnePlaying){
            isOnePlaying = true;
            mUsePotty.start();
        }
    }

    public void onPlayBall(View v){
        if(!isOnePlaying){
            isOnePlaying = true;
            mPlayBall.start();
        }
    }

    public void onGoPlay(View v){
        if(!isOnePlaying){
            isOnePlaying = true;
            mGoPlay.start();
        }
    }

    public void onExcited(View v){
        if(!isOnePlaying){
            isOnePlaying = true;
            mExcited.start();
        }
    }

    public void onHappy(View v){
        if(!isOnePlaying){
            isOnePlaying = true;
            mHappy.start();
        }
    }

    public void onSad(View v){
        if(!isOnePlaying){
            isOnePlaying = true;
            mSad.start();
        }
    }

    public void onColor(View v){
        if(!isOnePlaying){
            isOnePlaying = true;
            mColor.start();
        }
    }

    public void onSleep(View v){
        if(!isOnePlaying){
            isOnePlaying = true;
            mSleep.start();
        }
    }

    public void onPark(View v){
        if(!isOnePlaying){
            isOnePlaying = true;
            mPark.start();
        }
    }

    public void onTV(View v){
        if(!isOnePlaying){
            isOnePlaying = true;
            mTV.start();
        }
    }

}
