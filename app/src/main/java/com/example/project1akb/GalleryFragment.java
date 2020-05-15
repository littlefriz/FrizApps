package com.example.project1akb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
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
public class GalleryFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.listRecyclerView3);

        GalleryAdapter listAdapter = new GalleryAdapter();
        recyclerView.setAdapter(listAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }
}
