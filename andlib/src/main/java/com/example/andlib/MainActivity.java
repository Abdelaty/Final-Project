package com.example.andlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public final static String INTENT_JOKE = "INTENT_JOKE";
    String joke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);
        // Processing the joke intent
        joke = getIntent().getStringExtra(INTENT_JOKE);
//        TextView textViewJoke = (TextView) findViewById(R.id.android_tv);
//        textViewJoke.setText(joke);
//        if (savedInstanceState == null) {
        final Intent intent = new Intent(getApplicationContext(), Fragment.class);
        intent.putExtra("INTENT_JOKE", joke);
        Log.v("test0", joke);

        getSupportFragmentManager().beginTransaction().add(R.id.container, new Fragment()).commit();
//        }
    }

}
