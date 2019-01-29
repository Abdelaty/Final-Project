package com.example.andlib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String joke;
    public final static String INTENT_JOKE = "INTENT_JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainjoke);
        // Processing the joke intent
        joke = getIntent().getStringExtra(INTENT_JOKE);
        Log.v("tesssssst", joke);
        TextView textViewJoke = (TextView) findViewById(R.id.android_tv);
        textViewJoke.setText(joke);
    }

}
