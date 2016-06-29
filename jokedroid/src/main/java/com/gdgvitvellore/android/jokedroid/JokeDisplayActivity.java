package com.gdgvitvellore.android.jokedroid;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

/**
 * Created by Prince Bansal Local on 27-06-2016.
 */

public class JokeDisplayActivity extends AppCompatActivity {

    private TextView joke;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);
        init();
        setData();
    }

    private void init() {
        joke=(TextView)findViewById(R.id.joke);
    }

    private void setData() {
        joke.setText(getIntent().getStringExtra("joke"));
    }

}
