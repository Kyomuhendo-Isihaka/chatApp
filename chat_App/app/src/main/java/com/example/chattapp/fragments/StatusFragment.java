package com.example.chattapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.chattapp.Adapters.StatusAdapter;
import com.example.chattapp.R;

import java.util.List;

public class StatusFragment extends Fragment {

    private StatusAdapter statusAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_status, container, false);

        ListView statusListView = view.findViewById(R.id.statusListView);

        int statusPost[]={R.drawable.what_icon,R.drawable.pic1,R.drawable.what_icon};
        String statusSender[]={"Joan","edson","Nakakwa"};
        String status_time[]={"4hours ago","15minutes ago","5hours ago"};

        statusAdapter = new StatusAdapter(getContext(), statusPost, statusSender, status_time);
        statusListView.setAdapter(statusAdapter);


        return view;
    }
}