package com.kimjinhwan.android.tddproject;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.Toast;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by XPS on 2017-06-16.
 */

@RunWith(AndroidJUnit4.class)

public class EspressoTest {

    String testText = "espresso";
    Context context = InstrumentationRegistry.getTargetContext();

    @Rule
    public ActivityTestRule<MainActivity> mRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Before
    public void beforeTest(){

    }

    @Test
    public void testMainActivityEditText(){
        onView(withId(R.id.editText)).perform(typeText("espresso"), ViewActions.closeSoftKeyboard()).check(matches(withText("espresso")));
    }

    @Test
    public void testMainActivityListView(){

    }

    @After
    public void afterTest(){

    }
}
