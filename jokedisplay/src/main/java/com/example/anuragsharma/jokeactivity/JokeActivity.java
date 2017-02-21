package com.example.anuragsharma.jokeactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by anuragsharma on 16/02/17.
 */

public class JokeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intent = getIntent();
        String joke = intent.getStringExtra("joke");

        TextView jokeTextView = (TextView) findViewById(R.id.textView_joke);
        if (joke != null && joke.length() != 0) {
            jokeTextView.setText(joke);
        }
    }

}
