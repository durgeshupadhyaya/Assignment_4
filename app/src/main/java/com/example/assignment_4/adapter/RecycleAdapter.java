package com.example.assignment_4.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment_4.R;
import com.example.assignment_4.model.Data;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {

    Context context;

    public RecycleAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.data_layout, parent, false);
        ViewHolder postHolder = new ViewHolder(view);
        return postHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView profilepic;
        ImageView postimage;
        TextView caption,profilename;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            profilename = itemView.findViewById(R.id.name);
            caption = itemView.findViewById(R.id.caption);
            postimage = itemView.findViewById(R.id.image);
            profilepic = itemView.findViewById(R.id.pp);


        }
    }

}
