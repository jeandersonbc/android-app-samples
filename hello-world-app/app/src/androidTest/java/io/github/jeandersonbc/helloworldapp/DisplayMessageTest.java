package io.github.jeandersonbc.helloworldapp;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.SmallTest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by jbc on 2/23/16.
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class DisplayMessageTest {

    private static final String STRING_TO_BE_TYPED = "Espresso UI Test";

    @Rule
    public ActivityTestRule<MyActivity> mMyActivityRule = new ActivityTestRule<>(MyActivity.class);

    @Test
    public void displayTextTest() {
        onView(withId(R.id.edit_message)).perform(typeText(STRING_TO_BE_TYPED), closeSoftKeyboard());
        onView(withId(R.id.send_btn)).perform(click());
        onView(withId(R.id.display_msg)).check(matches(withText(this.STRING_TO_BE_TYPED)));
    }
}
