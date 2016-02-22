package com.phaseshiftlab.jokedisplaylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class JokeDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);
        String joke = getIntent().getStringExtra("joke");
        JokeDisplayFragment jokeDisplayFragment = (JokeDisplayFragment) getSupportFragmentManager().findFragmentById(R.id.jokeDisplayFragment);
        jokeDisplayFragment.setJokeText(joke);
    }

}
