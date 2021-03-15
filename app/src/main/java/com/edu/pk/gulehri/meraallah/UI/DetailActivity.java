package com.edu.pk.gulehri.meraallah.UI;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.edu.pk.gulehri.meraallah.Adaptors.NamesAdaptor;
import com.edu.pk.gulehri.meraallah.Model.Model;
import com.edu.pk.gulehri.meraallah.R;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener, GestureDetector.OnGestureListener {

    /**
     * vars
     */
    private static final int SWIPE_THRESHOLD = 100;
    private static final int SWIPE_VELOCITY_THRESHOLD = 100;
    private static final String TAG = "TAG";
    public static int position;
    private GestureDetector mGestureDetector;
    private String Name;
    private Toolbar mToolbar;
    private String ItemName;

    /**
     * widgets
     */
    private LinearLayout detailView;
    private TextView nameInArabic, nameInEnglish, meaningOfName, referenceInArabic, referenceInEnglish,
            counterView, toolbarText;
    private Button plus, minus;
    private ImageButton toolbarPlay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getReference();

        //getting Values from Main Activity
        Intent intent = getIntent();
        Name = intent.getStringExtra("menuName");
        ItemName = intent.getStringExtra(NamesAdaptor.ITEM_NAME);
        position = intent.getIntExtra("itemPosition", 0);


        //Creating Object
        mGestureDetector = new GestureDetector(this, this);

        //Setting Listeners
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        detailView.setOnTouchListener(this);

        assigningValues();
        setToolbar();

        Log.i(TAG, "onCreate: Detail Activity Method is Called ");

    }


    /**
     * Taking References of Widgets
     */
    private void getReference() {
        nameInArabic = findViewById(R.id.nameInArabic);
        nameInEnglish = findViewById(R.id.nameInEnglish);
        meaningOfName = findViewById(R.id.meaningOfName);
        referenceInArabic = findViewById(R.id.referenceInArabic);
        referenceInEnglish = findViewById(R.id.referenceInEnglish);
        counterView = findViewById(R.id.counterView);
        detailView = findViewById(R.id.detailView);
        plus = findViewById(R.id.buttonPlus);
        minus = findViewById(R.id.buttonMinus);
    }

    /**
     * Assigning Values to TextViews
     */

    @SuppressLint("DefaultLocale")
    private void assigningValues() {
        counterView.setText(String.format("%d", position + 1));


        if (Name.equals("Asma Ul Husna")) {
            nameInArabic.setText(Model.ALLAH[position].getALLAH_NAMES_ARABIC());
            nameInEnglish.setText(Model.ALLAH[position].getALLAH_NAMES_ENGLISH());
            meaningOfName.setText(String.format("Meaning: %s", Model.ALLAH[position].getALLAH_NAMES_MEANING()));
            referenceInArabic.setText(Model.ALLAH[position].getALLAH_NAMES_REFERENCE_ARABIC());
            referenceInEnglish.setText(Model.ALLAH[position].getALLAH_NAMES_REFERENCE_ENGLISH());

        } else if (Name.equals("Asma Ul Rasool")) {
            nameInArabic.setText(Model.MUHAMMAD[position].getMUHAMMAD_NAMES_ARABIC());
            nameInEnglish.setText(Model.MUHAMMAD[position].getMUHAMMAD_NAMES_ENGLISH());
            meaningOfName.setText(String.format("Meaning: %s", Model.MUHAMMAD[position].getMUHAMMAD_NAMES_MEANING()));
        }
    }

    /**
     * Handling Button Clicks
     */
    @SuppressLint("DefaultLocale")
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonPlus) {
            position++;

            if (Name.equals("Asma Ul Husna") && position < 100) {
                minus.setClickable(true);
                counterView.setText(String.format("%d", position + 1));
                nameInArabic.setText(Model.ALLAH[position].getALLAH_NAMES_ARABIC());
                nameInEnglish.setText(Model.ALLAH[position].getALLAH_NAMES_ENGLISH());
                meaningOfName.setText(String.format("Meaning: %s", Model.ALLAH[position].getALLAH_NAMES_MEANING()));
                referenceInArabic.setText(Model.ALLAH[position].getALLAH_NAMES_REFERENCE_ARABIC());
                referenceInEnglish.setText(Model.ALLAH[position].getALLAH_NAMES_REFERENCE_ENGLISH());
                toolbarText.setText(nameInEnglish.getText());

            } else if (Name.equals("Asma Ul Rasool") && position < 99) {
                minus.setClickable(true);
                counterView.setText(String.format("%d", position + 1));
                nameInArabic.setText(Model.MUHAMMAD[position].getMUHAMMAD_NAMES_ARABIC());
                nameInEnglish.setText(Model.MUHAMMAD[position].getMUHAMMAD_NAMES_ENGLISH());
                meaningOfName.setText(String.format("Meaning: %s", Model.MUHAMMAD[position].getMUHAMMAD_NAMES_MEANING()));
                toolbarText.setText(nameInEnglish.getText());
            } else {
                plus.setClickable(false);
            }


        }
        if (v.getId() == R.id.buttonMinus) {
            position--;

            if (Name.equals("Asma Ul Husna") && position >= 0) {
                plus.setClickable(true);
                counterView.setText(String.format("%d", position + 1));
                nameInArabic.setText(Model.ALLAH[position].getALLAH_NAMES_ARABIC());
                nameInEnglish.setText(Model.ALLAH[position].getALLAH_NAMES_ENGLISH());
                meaningOfName.setText(String.format("Meaning: %s", Model.ALLAH[position].getALLAH_NAMES_MEANING()));
                referenceInArabic.setText(Model.ALLAH[position].getALLAH_NAMES_REFERENCE_ARABIC());
                referenceInEnglish.setText(Model.ALLAH[position].getALLAH_NAMES_REFERENCE_ENGLISH());
                toolbarText.setText(nameInEnglish.getText());

            } else if (Name.equals("Asma Ul Rasool") && position >= 0) {
                plus.setClickable(true);
                counterView.setText(String.format("%d", position + 1));
                nameInArabic.setText(Model.MUHAMMAD[position].getMUHAMMAD_NAMES_ARABIC());
                nameInEnglish.setText(Model.MUHAMMAD[position].getMUHAMMAD_NAMES_ENGLISH());
                meaningOfName.setText(String.format("Meaning: %s", Model.MUHAMMAD[position].getMUHAMMAD_NAMES_MEANING()));
                toolbarText.setText(nameInEnglish.getText());
            } else {
                minus.setClickable(false);
            }
        }
    }


    /**
     * Gesture Detections
     */
    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
    }

    /**
     * Performing Swipe Gestures
     */
    @SuppressLint("DefaultLocale")
    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {

        try {
            //Checking for the distance user finger covered
            float diffX = e2.getX() - e1.getX();

            //Check if covered distance > 100 px/unit
            if (Math.abs(diffX) > SWIPE_THRESHOLD && Math.abs(velocityX) > SWIPE_VELOCITY_THRESHOLD) {

                //if diffX == positive then perform swipe right
                if (diffX > 0) {
                    position++;
                    if (Name.equals("Asma Ul Husna") && position < 100) {
                        counterView.setText(String.format("%d", position + 1));
                        nameInArabic.setText(Model.ALLAH[position].getALLAH_NAMES_ARABIC());
                        nameInEnglish.setText(Model.ALLAH[position].getALLAH_NAMES_ENGLISH());
                        meaningOfName.setText(String.format("Meaning: %s", Model.ALLAH[position].getALLAH_NAMES_MEANING()));
                        referenceInArabic.setText(Model.ALLAH[position].getALLAH_NAMES_REFERENCE_ARABIC());
                        referenceInEnglish.setText(Model.ALLAH[position].getALLAH_NAMES_REFERENCE_ENGLISH());
                        toolbarText.setText(nameInEnglish.getText());

                    } else if (Name.equals("Asma Ul Rasool") && position < 99) {
                        counterView.setText(String.format("%d", position + 1));
                        nameInArabic.setText(Model.MUHAMMAD[position].getMUHAMMAD_NAMES_ARABIC());
                        nameInEnglish.setText(Model.MUHAMMAD[position].getMUHAMMAD_NAMES_ENGLISH());
                        meaningOfName.setText(String.format("Meaning: %s", Model.MUHAMMAD[position].getMUHAMMAD_NAMES_MEANING()));
                        toolbarText.setText(nameInEnglish.getText());
                    }
                }
                //if diffX is negative then perform swipe left
                else {
                    position--;
                    if (Name.equals("Asma Ul Husna") && position >= 0) {
                        counterView.setText(String.format("%d", position + 1));
                        nameInArabic.setText(Model.ALLAH[position].getALLAH_NAMES_ARABIC());
                        nameInEnglish.setText(Model.ALLAH[position].getALLAH_NAMES_ENGLISH());
                        meaningOfName.setText(String.format("Meaning: %s", Model.ALLAH[position].getALLAH_NAMES_MEANING()));
                        referenceInArabic.setText(Model.ALLAH[position].getALLAH_NAMES_REFERENCE_ARABIC());
                        referenceInEnglish.setText(Model.ALLAH[position].getALLAH_NAMES_REFERENCE_ENGLISH());
                        toolbarText.setText(nameInEnglish.getText());

                    } else if (Name.equals("Asma Ul Rasool") && position >= 0) {
                        counterView.setText(String.format("%d", position + 1));
                        nameInArabic.setText(Model.MUHAMMAD[position].getMUHAMMAD_NAMES_ARABIC());
                        nameInEnglish.setText(Model.MUHAMMAD[position].getMUHAMMAD_NAMES_ENGLISH());
                        meaningOfName.setText(String.format("Meaning: %s", Model.MUHAMMAD[position].getMUHAMMAD_NAMES_MEANING()));
                        toolbarText.setText(nameInEnglish.getText());
                    }

                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return true;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        mGestureDetector.onTouchEvent(event);
        return true;
    }

    private void setToolbar() {
        mToolbar = findViewById(R.id.mToolbar);
        toolbarText = findViewById(R.id.toolbarText);
        toolbarPlay = findViewById(R.id.toolbarPlay);

        try {
            setSupportActionBar(mToolbar);
            toolbarText.setText(ItemName);
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
            NamesAdaptor.flag = true;
            Intent intent = new Intent(getApplicationContext(), NamesActivity.class);
            intent.putExtra("MenuName", Name);
            this.startActivity(intent);


        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: Detail Activity Method is Called ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: Detail Activity Method is Called ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: Detail Activity Method is Called ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: Detail Activity Method is Called ");
    }
}