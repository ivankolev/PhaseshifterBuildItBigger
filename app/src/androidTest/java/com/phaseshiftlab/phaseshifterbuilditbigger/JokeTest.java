package com.phaseshiftlab.phaseshifterbuilditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class JokeTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void tellJokeButtonIsDisplayed() {
        onView(withId(R.id.tell_joke_button)).check(matches(isDisplayed()));
    }

    @Test
    public void tellJokeButtonisOperational() {
        onView(withId(R.id.tell_joke_button)).perform(click());

        onView(withId(R.id.jokeDisplayTextView)).check(matches(isDisplayed()));
    }
}
