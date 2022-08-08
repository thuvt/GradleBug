package com.example.uitest

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.example.thuapptryagain.SettingsActivity
import org.hamcrest.CoreMatchers.containsString
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleUITest {

    @get:Rule
    var activityTestRule: ActivityTestRule<SettingsActivity> =
        ActivityTestRule(SettingsActivity::class.java)

    @Test
    fun syncEmail() {
        onView(withText(containsString("Sync email"))).perform(click())
    }
}
