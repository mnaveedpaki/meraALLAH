package com.edu.pk.gulehri.meraallah.UI;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.edu.pk.gulehri.meraallah.Adaptors.MenuAdaptor;
import com.edu.pk.gulehri.meraallah.Adaptors.NamesAdaptor;
import com.edu.pk.gulehri.meraallah.Model.Model;
import com.edu.pk.gulehri.meraallah.R;

public class NamesActivity extends AppCompatActivity implements View.OnClickListener {

    //Vars
    public static final String TAG = "NamesActivity";
    public static String clickedItem;
    public static boolean musicFlag;
    private static int count = 0;
    private MediaPlayer mediaPlayer, mediaPlayer2;
    private Toolbar mToolbar;
    private Intent intent;
    RecyclerView mRecyclerView;
    public static NamesAdaptor namesAdaptor;


    int ii=0;
    int position = 0;
    int prepare = 0;

    Model model;
    //Widgets
    private TextView toolbarText;
    private ImageButton toolbarPlay, toolbarFav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_names);

        //setting Intents
        intent = getIntent();
        clickedItem = intent.getStringExtra(MenuAdaptor.MENU_NAME);
        model = new Model();

        mRecyclerView = findViewById(R.id._99names);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        namesAdaptor = new NamesAdaptor(this);
        mRecyclerView.setAdapter(namesAdaptor);
        setToolbar();
        toolbarPlay.setOnClickListener(this);

        Log.i(TAG, "onCreate: Names Activity Called");
    }


    private void setToolbar() {
        mToolbar = findViewById(R.id.mToolbar);
        toolbarText = findViewById(R.id.toolbarText);
        toolbarPlay = findViewById(R.id.toolbarPlay);
        toolbarFav = findViewById(R.id.toolbarFav);

        try {
            setSupportActionBar(mToolbar);
            if (NamesAdaptor.flag) {

                toolbarText.setText(intent.getStringExtra("MenuName"));
            } else {
                toolbarText.setText(clickedItem);
            }

            toolbarFav.setImageResource(0);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            final Drawable backArrow = getResources().getDrawable(R.drawable.back_arrow);
            getSupportActionBar().setHomeAsUpIndicator(backArrow);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            this.startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.toolbarPlay) {
            count++;
            checkForClick();
        }
    }

    private void checkForClick() {
        if (count == 1) {
            musicFlag = true;
//            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.asma_un_nabi);
//            mediaPlayer.setLooping(true);
//            mediaPlayer.start();


            if (clickedItem.equals("Asma Ul Husna"))
            playALLAHName();
            else if (clickedItem.equals("Asma Ul Rasool"))
            playRASOOLName();

            if (mediaPlayer.isPlaying()) {
                toolbarPlay.setImageResource(R.drawable.pause);
            }
        } else if (count == 2) {
            musicFlag = false;
            mediaPlayer.stop();
            toolbarPlay.setImageResource(R.drawable.play);
            count = 0;
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        try {
            mediaPlayer.stop();
            toolbarPlay.setImageResource(R.drawable.play);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.i(TAG, "onPause:Names Activity Called ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: Names Activity Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        clickedItem = intent.getStringExtra(MenuAdaptor.MENU_NAME);
        Log.i(TAG, "onStop: Names Activity Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: Names Activity Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mediaPlayer.stop();
        Log.i(TAG, "onDestroy: Names Activity Called");
    }

    public void higlightNames(){
        if (ii<100){
            namesAdaptor.notifyDataSetChanged();
            Model.position=ii;
            ii++;

        }
        else {
            ii=0;
        }
    }

    public void higlightNames2(){
        if (ii<102){
            namesAdaptor.notifyDataSetChanged();
            Model.position=ii;
            ii++;

        }
        else {
            ii=0;
        }
    }

    public void playALLAHName(){
        try {

            if (musicFlag) {

                int DURATION_DELTA = 200;
                mediaPlayer = MediaPlayer.create(getApplicationContext(), Model.ALLAHNameIds[position]);
                mediaPlayer.start();
                int duration = mediaPlayer.getDuration();
//                if (duration >1000 && duration < 2000)
//                    DURATION_DELTA = 300;
//
//                if (duration >2000 && duration < 3000)
//                    DURATION_DELTA = 500;
                if (duration < 1000)
                    DURATION_DELTA = 100;
                else {
                    DURATION_DELTA = 200;
                }

                position++;
                higlightNames();

                Handler mHandler = new Handler();
                mHandler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        playALLAHName();
                    }
                }, duration - DURATION_DELTA);

//                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                    @Override
//                    public void onCompletion(MediaPlayer mp) {
//
//                        mediaPlayer2 = MediaPlayer.create(getApplicationContext(), Model.ALLAHNameIds[position]);
//                        mediaPlayer2.start();
//
//                        mediaPlayer.stop();
//                        mediaPlayer.reset();
//                        mediaPlayer.release();
//
//                        if (position < 100)
//                            playName();
//                        else {
//                            position = 0;
//                            mediaPlayer.stop();
//                            mediaPlayer.reset();
//                            mediaPlayer.release();
//                        }
//                    }
//                });
            } else {
                mediaPlayer.stop();
                mediaPlayer.reset();
                mediaPlayer.release();
            }
        }catch (Exception e){
            Log.d(TAG, e.getMessage());
        }

    }

    public void playRASOOLName(){
        try {

            if (musicFlag) {

                int DURATION_DELTA = 200;
                mediaPlayer = MediaPlayer.create(getApplicationContext(), Model.RASOOLNameIds[position]);
                mediaPlayer.start();
                int duration = mediaPlayer.getDuration();
//                if (duration >1000 && duration < 2000)
//                    DURATION_DELTA = 300;
//
//                if (duration >2000 && duration < 3000)
//                    DURATION_DELTA = 500;
                if (duration < 1000)
                    DURATION_DELTA = 100;
                else {
                    DURATION_DELTA = 200;
                }

                position++;
                higlightNames2();

                Handler mHandler = new Handler();
                mHandler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        playRASOOLName();
                    }
                }, duration - DURATION_DELTA);

//                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                    @Override
//                    public void onCompletion(MediaPlayer mp) {
//
//                        mediaPlayer2 = MediaPlayer.create(getApplicationContext(), Model.ALLAHNameIds[position]);
//                        mediaPlayer2.start();
//
//                        mediaPlayer.stop();
//                        mediaPlayer.reset();
//                        mediaPlayer.release();
//
//                        if (position < 100)
//                            playName();
//                        else {
//                            position = 0;
//                            mediaPlayer.stop();
//                            mediaPlayer.reset();
//                            mediaPlayer.release();
//                        }
//                    }
//                });
            } else {
                mediaPlayer.stop();
                mediaPlayer.reset();
                mediaPlayer.release();
            }
        }catch (Exception e){
            Log.d(TAG, e.getMessage());
        }

    }


//    public void playName(){
//        try {
//
//            if (musicFlag) {
//                if (prepare == 0) {
//                    mediaPlayer = MediaPlayer.create(getApplicationContext(), Model.ALLAHNameIds[position]);
//                    prepare++;
//                    mediaPlayer.start();
//                }
//
//
//
//                position++;
//                higlightNames();
//                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                    @Override
//                    public void onCompletion(MediaPlayer mp) {
//
//                        mediaPlayer2 = MediaPlayer.create(getApplicationContext(), Model.ALLAHNameIds[position]);
//                        mediaPlayer2.start();
//
//                        mediaPlayer.stop();
//                        mediaPlayer.reset();
//                        mediaPlayer.release();
//
//                        if (position < 100)
//                            play2();
//                        else {
//                            position = 0;
//                            mediaPlayer.stop();
//                            mediaPlayer.reset();
//                            mediaPlayer.release();
//                        }
//                    }
//                });
//            } else {
//                mediaPlayer.stop();
//                mediaPlayer.reset();
//                mediaPlayer.release();
//            }
//        }catch (Exception e){
//            Log.d(TAG, e.getMessage());
//        }
//
//    }
//
//    public void play2(){
//        try {
//
//            if (musicFlag) {
//
//                mediaPlayer2.start();
//                position++;
//                higlightNames();
//                mediaPlayer2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                    @Override
//                    public void onCompletion(MediaPlayer mp) {
//
//
//                        mediaPlayer = MediaPlayer.create(getApplicationContext(), Model.ALLAHNameIds[position]);
//                        mediaPlayer.start();
//                        mediaPlayer2.stop();
//                        mediaPlayer2.reset();
//                        mediaPlayer2.release();
//
//                        if (position < 100)
//                            playName();
//                        else {
//                            position = 0;
//                            mediaPlayer2.stop();
//                            mediaPlayer2.reset();
//                            mediaPlayer2.release();
//                        }
//                    }
//                });
//            } else {
//                mediaPlayer2.stop();
//                mediaPlayer2.reset();
//                mediaPlayer2.release();
//            }
//        }catch (Exception e){
//            Log.d(TAG, e.getMessage());
//        }
//
//    }



}