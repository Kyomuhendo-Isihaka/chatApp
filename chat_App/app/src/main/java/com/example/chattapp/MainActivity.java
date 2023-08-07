package com.example.chattapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.TextView;

import com.example.chattapp.fragments.CallsFragment;
import com.example.chattapp.fragments.ChatsFragment;
import com.example.chattapp.fragments.StatusFragment;

public class MainActivity extends AppCompatActivity {

    TextView chats, status, calls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState==null){
            loadfragment(new ChatsFragment());
        }

        chats = findViewById(R.id.chats);
        status = findViewById(R.id.status);
        calls = findViewById(R.id.calls);

        chats.setOnClickListener(view -> loadfragment(new ChatsFragment()));

        calls.setOnClickListener(view -> loadfragment(new CallsFragment()));

        status.setOnClickListener(view -> loadfragment(new StatusFragment()));




    }

    public void loadfragment(Fragment fragment){
        FragmentManager fragmentManager =getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frame_layout, fragment);
        transaction.commit();



    }
}