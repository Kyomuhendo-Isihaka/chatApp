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

public class ChatsAdapter extends BaseAdapter {

    private Context context;
    private int senderPic[];
    private String senderName[];
    private String timeSent[];
    private String msg[];
    private String numSms[];


    public ChatsAdapter(Context context, int senderPic[], String senderName[], String timeSent[], String msg[], String numSms[]) {
        this.context = context;
        this.senderPic = senderPic;
        this.senderName = senderName;
        this.timeSent = timeSent;
        this.msg = msg;
        this.numSms = numSms;
    }




    @Override
    public int getCount() {
        return senderName.length;
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

        TextView senderName, timeSent, msg, numSms;
        ImageView senderPic;

        View rootView = LayoutInflater.from(context).inflate(R.layout.item_chat, null, false);

        senderPic = rootView.findViewById(R.id.senderPic);
        senderName = rootView.findViewById(R.id.senderName);
        timeSent = rootView.findViewById(R.id.time);
        msg = rootView.findViewById(R.id.msg);
        numSms = rootView.findViewById(R.id.numSms);

        senderName.setText(this.senderName[i]);
        senderPic.setImageResource(this.senderPic[i]);
        timeSent.setText(this.timeSent[i]);
        msg.setText(this.msg[i]);
        numSms.setText(this.numSms[i]);

        return rootView;
    }
}
