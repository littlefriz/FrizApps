package com.example.project1akb;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;
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
public class ListAdapter extends RecyclerView.Adapter {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_activity, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return ActivityData.title.length;
    }

    private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView mItemText;
        private ImageView mItemImage;

        public ListViewHolder(View itemView){
            super(itemView);
            mItemText = (TextView) itemView.findViewById(R.id.itemText);
            mItemImage = (ImageView) itemView.findViewById(R.id.itemImage);
            itemView.setOnClickListener(this);

        }

        public void bindView(int position){
            mItemText.setText(ActivityData.title[position]);
            mItemImage.setImageResource(ActivityData.picturePath[position]);
        }

        @Override
        public void onClick(View v) {

        }
    }

}
