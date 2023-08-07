package com.example.chattapp.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.chattapp.R;

public class CallsAdapter extends BaseAdapter {

    private Context context;
    private  int profilePic[];
    private String callerName[];
    private String timeCalled[];

    public CallsAdapter(Context context, int[] profilePic, String[] callerName, String[] timeCalled) {
        this.context = context;
        this.profilePic = profilePic;
        this.callerName = callerName;
        this.timeCalled = timeCalled;
    }

    @Override
    public int getCount() {
        return timeCalled.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView callerName, timeCalled;
        ImageView profilePic;

        View rootView = LayoutInflater.from(context).inflate(R.layout.item_call,null, false);
         callerName = rootView.findViewById(R.id.callerName);
         profilePic = rootView.findViewById(R.id.profilePic);
         timeCalled = rootView.findViewById(R.id.timeCalled);

         callerName.setText(this.callerName[i]);
         timeCalled.setText(this.timeCalled[i]);
         profilePic.setImageResource(this.profilePic[i]);



        return rootView;
    }
}
