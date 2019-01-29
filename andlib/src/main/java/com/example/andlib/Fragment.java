package com.example.andlib;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment extends android.support.v4.app.Fragment {
    public final static String INTENT_JOKE = "INTENT_JOKE";


    public Fragment() {


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.activity_mainjoke, container, false);
        String gce_result = getActivity().getIntent().getStringExtra(INTENT_JOKE);
        TextView gce_result_show = (TextView) v.findViewById(R.id.android_tv);
        gce_result_show.setText(gce_result);
        Log.v("test0", gce_result);

        return v;
    }
}