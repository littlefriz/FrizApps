package com.example.project1akb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
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
public class SlideAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SlideAdapter(Context context){
        this.context = context;
    }

    public String[] slide_heading = {
            "Selamat Datang",
            "",
            ""
    };
    public String [] slide_desc = {
            "Aplikasi ini dibuat untuk mengerjakan tugas UTS Praktek yang terdapat Splash Screen, ViewPager, " +
                    "dan Navigation Drawer",
            "Aplikasi ini dibuat oleh Afri Suhendra dengan NIM 10117169 dan Kelas IF-5",
            "Semoga Aplikasi ini mendapat nilai yang baik :)"
    };
    @Override
    public int getCount() {

        return slide_heading.length;

    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (RelativeLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout,container,false);

        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading);
        TextView slideDesc = (TextView) view.findViewById(R.id.slide_desc);

        slideHeading.setText(slide_heading[position]);
        slideDesc.setText(slide_desc[position]);

        container.addView(view);

        return view;
    }

    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((RelativeLayout)object);
    }
}
