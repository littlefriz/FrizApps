package com.example.project1akb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.transition.Slide;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
/*
    Afri Suhendra
    10117169
    IF5
    11/05/2020 5:02 Pembuatan SplashScreen
    11/05/2020 8:35 Pembuatan Walkthrough
    12/05/2020 7:07 Pembuatan Bottom Navigation Bar
    15/05/2020 5:59 Pembuatan Daily Activity
    15/05/2020 8:20 Pembuatan Gallery Activity
    15/05/2020 10:41 Pembuatan Music&Video Activity
    15/05/2020 15:12 Pembuatan Profile Activity
 */

public class WalkthroughActivity extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private LinearLayout mDotLayout;

    private TextView[] mDots;

    private SlideAdapter slideAdapter;

    private Button mNextBtn;
    private Button mPrevBtn;

    private int mCurrentPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough);

        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);
        mDotLayout = (LinearLayout) findViewById(R.id.dotsLayout);

        mNextBtn = (Button) findViewById(R.id.nextBtn);
        mPrevBtn = (Button) findViewById(R.id.prevBtn);

        slideAdapter = new SlideAdapter(this);

        mSlideViewPager.setAdapter(slideAdapter);

        addDotsIndicator(0);

        mSlideViewPager.addOnPageChangeListener(viewListener);
        mNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mNextBtnText = mNextBtn.getText().toString();
                mSlideViewPager.setCurrentItem(mCurrentPage+1);
                if(mNextBtnText.equals("Finish")) {
                    Intent i = new Intent(WalkthroughActivity.this, MainActivity.class);
                    startActivity(i);
                }
            }
        });
        mPrevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mNextBtnText = mNextBtn.getText().toString();
                mSlideViewPager.setCurrentItem(mCurrentPage-1);
            }
        });

    }
    public void addDotsIndicator(int positition){
        mDots = new TextView[3];
        mDotLayout.removeAllViews();

        for(int i = 0; i<mDots.length; i++){

            mDots[i]=new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.colorPrimary));

            mDotLayout.addView(mDots[i]);
        }
        if(mDots.length > 0 ){

            mDots[positition].setTextColor(getResources().getColor(R.color.colorAccent));

        }
    }
    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
            addDotsIndicator(i);

            mCurrentPage = i;
            if(i == 0){
                mNextBtn.setEnabled(true);
                mPrevBtn.setEnabled(false);
                mPrevBtn.setVisibility(View.INVISIBLE);

                mNextBtn.setText("Next");
                mPrevBtn.setText("");
            }else if (i == mDots.length-1){
                mNextBtn.setEnabled(true);
                mPrevBtn.setEnabled(true);
                mPrevBtn.setVisibility(View.VISIBLE);

                mNextBtn.setText("Finish");
                mPrevBtn.setText("Back");


            }else {
                mNextBtn.setEnabled(true);
                mPrevBtn.setEnabled(true);
                mPrevBtn.setVisibility(View.VISIBLE);

                mNextBtn.setText("Next");
                mPrevBtn.setText("Back");

            }
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };
}
