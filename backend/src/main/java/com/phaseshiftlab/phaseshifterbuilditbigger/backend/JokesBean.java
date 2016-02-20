package com.phaseshiftlab.phaseshifterbuilditbigger.backend;

/** The object model for the data we are sending through endpoints */
public class JokesBean {

    private String randomJoke;

    public String getJoke() {
        return randomJoke;
    }

    public void setJoke(String data) {
        randomJoke = data;
    }
}