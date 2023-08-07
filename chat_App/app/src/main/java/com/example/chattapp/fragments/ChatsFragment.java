package com.example.chattapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.chattapp.Adapters.ChatsAdapter;
import com.example.chattapp.R;


public class ChatsFragment extends Fragment {

    private ChatsAdapter chatsAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_chats, container, false);
        ListView chatsListView = view.findViewById(R.id.chatsListView);
        String senderName[]={"isihaka","joan","Edson","Angel","Davis","Opiyo"};
        String msg[]={"hello","how are you","yes dear i missed you today, how are you doing","hey","watsap","hey niga"};
        int senderPic[] = {R.drawable.what_icon,R.drawable.baseline_groups_24,R.drawable.pic1,R.drawable.green_circle_background,R.drawable.what_icon,R.drawable.baseline_search_24};
        String timeSent[]={"6:00pm","4:00pm","3:00pm","7:00pm","5:00pm","7:00pm"};
      String numSms[] = {"1","3","66","34","6","5"};

        chatsAdapter = new ChatsAdapter(getContext(), senderPic, senderName, timeSent, msg, numSms);
        chatsListView.setAdapter(chatsAdapter);

        return view;
    }
}