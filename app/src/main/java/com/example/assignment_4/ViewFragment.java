package com.example.assignment_4;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.assignment_4.adapter.RecycleAdapter;


public class ViewFragment extends Fragment {

    private RecyclerView view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_view, container, false);
        view = root.findViewById(R.id.list);
        RecycleAdapter adapter = new RecycleAdapter(getContext());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        view.setLayoutManager(layoutManager);
        view.setAdapter(adapter);
        return root;
    }

}
