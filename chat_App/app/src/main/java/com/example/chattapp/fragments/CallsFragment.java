package com.example.chattapp.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.chattapp.Adapters.CallsAdapter;
import com.example.chattapp.R;

import java.util.List;


public class CallsFragment extends Fragment {
    private CallsAdapter callsAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.fragment_calls, container, false);

       int profilePic[]={R.drawable.pic1,R.drawable.what_icon,R.drawable.pic1};
       String callerName[]={"Big Bro", "Kusemererwa Edson", "Nakakawa Juliet"};
       String timeCalled[] = {"July 24, 9:00pm","March 16, 10:34pm","June 23, 5:24am"};

       ListView callsListView = view.findViewById(R.id.callsListView);
       callsAdapter = new CallsAdapter(getContext(),profilePic,callerName,timeCalled);
       callsListView.setAdapter(callsAdapter);
       return view;
    }
}