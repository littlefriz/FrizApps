package com.example.project1akb;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Locale;
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
public class ProfileFragment extends Fragment {
    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        Button insta = (Button) view.findViewById(R.id.btnInstagram);
        Button locat = (Button) view.findViewById(R.id.btnLocation);
        final Button facebook = (Button) view.findViewById(R.id.btnFacebook);


        insta.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.instagram.com/_u/suhendraafrii/");
                Intent instagram = new Intent(Intent.ACTION_VIEW,uri);
                instagram.setPackage("com.instagram.android");
                try{
                    startActivity(instagram);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/_u/suhendraafrii/")));
                }
            }
        });

        locat.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String uri = String.format(Locale.ENGLISH,"geo:0,0?q=-6.886473, 107.619855(Treasure)");
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/afri.suhendra.923/"));
                startActivity(link);
            }
        });

        return view;
    }
}
//-6.886473, 107.619855
