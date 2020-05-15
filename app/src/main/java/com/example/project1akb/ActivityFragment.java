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

import java.util.ArrayList;
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
public class ActivityFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.fragment_activity, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.listRecyclerView);
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.listRecyclerView2);

        ListAdapter listAdapter = new ListAdapter();
        recyclerView.setAdapter(listAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        ListAdapter2 listAdapter2 = new ListAdapter2();
        recyclerView2.setAdapter(listAdapter2);
        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(layoutManager2);

        return view;
    }
}
