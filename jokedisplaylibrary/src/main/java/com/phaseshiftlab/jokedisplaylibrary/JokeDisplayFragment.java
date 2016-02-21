package com.phaseshiftlab.jokedisplaylibrary;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class JokeDisplayFragment extends Fragment {


    public JokeDisplayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_joke_display, container, false);
    }

    public void setJokeText(String jokeText) {
        TextView textView = (TextView) getView().findViewById(R.id.jokeDisplayTextView);
        textView.setText(jokeText.replaceAll("\n", "").replaceAll(" +", " "));
    }

}
