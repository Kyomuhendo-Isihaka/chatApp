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

public class StatusAdapter extends BaseAdapter {
    private int[] statusPost;

    private Context context;
    private String statusSender[];
    private String Status_time[];

    public StatusAdapter(Context context, int[] statusPost, String[] statusSender, String[] status_time) {
        this.context = context;
        this.statusPost = statusPost;
        this.statusSender = statusSender;
        Status_time = status_time;
    }

    @Override
    public int getCount() {
        return statusSender.length;
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
        ImageView statusPost;
        TextView statusSender, status_time;

        View rootView = LayoutInflater.from(context).inflate(R.layout.item_status, null, false);

        statusPost= rootView.findViewById(R.id.statusPost);
        statusSender = rootView.findViewById(R.id.statusSender);
        status_time = rootView.findViewById(R.id.status_time);

        statusPost.setImageResource(this.statusPost[i]);
        statusSender.setText(this.statusSender[i]);
        status_time.setText(this.Status_time[i]);



        return rootView;
    }
}
