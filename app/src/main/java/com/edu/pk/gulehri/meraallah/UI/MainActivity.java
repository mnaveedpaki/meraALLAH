package com.edu.pk.gulehri.meraallah.UI;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.edu.pk.gulehri.meraallah.Adaptors.MenuAdaptor;
import com.edu.pk.gulehri.meraallah.R;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    //Vars
    public static final String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Widgets
        Toolbar mToolbar = findViewById(R.id.mToolbar);
        TextView toolbarText = findViewById(R.id.toolbarText);
        ImageButton toolbarPlay = findViewById(R.id.toolbarPlay);
        ImageButton toolbarFav = findViewById(R.id.toolbarFav);
        RecyclerView mRecyclerView = findViewById(R.id.menu);

        try {

            toolbarText.setText(R.string.menu);
            toolbarPlay.setImageResource(0);
            toolbarFav.setImageResource(0);
            setSupportActionBar(mToolbar);
            Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        mRecyclerView.setAdapter(new MenuAdaptor(this));
        Log.i(TAG, "onCreate: MainActivity is Called ");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
        Log.i(TAG, "onBackPressed: MainActivity is Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: MainActivity is Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: MainActivity is Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: MainActivity is Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: MainActivity is Called");
    }
}