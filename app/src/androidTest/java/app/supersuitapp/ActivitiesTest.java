package app.supersuitapp;
import android.app.Activity;
import android.app.Instrumentation;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import static junit.framework.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class ActivitiesTest {

    @Rule
    public ActivityTestRule<MainMenuActivity> mActivityRule = new ActivityTestRule<MainMenuActivity>(MainMenuActivity.class);

    @Test
    public void testBattery() {
        // register next activity that need to be monitored.
        Instrumentation.ActivityMonitor activityMonitor = getInstrumentation().addMonitor(BatteryActivity.class.getName(), null, false);
        onView(withId(R.id.batteryButton)).perform(click());

        Activity nextActivity = getInstrumentation().waitForMonitorWithTimeout(activityMonitor, 5000);
        // next activity is opened and captured.
        assertNotNull(nextActivity);
        nextActivity .finish();
    }

    @Test
    public void testWeight() {
        // register next activity that need to be monitored.
        Instrumentation.ActivityMonitor activityMonitor = getInstrumentation().addMonitor(Weight.class.getName(), null, false);
        onView(withId(R.id.WeightButton)).perform(click());

        Activity nextActivity = getInstrumentation().waitForMonitorWithTimeout(activityMonitor, 5000);
        // next activity is opened and captured.
        assertNotNull(nextActivity);
        nextActivity .finish();
    }

    @Test
    public void testSettings() {
        // register next activity that need to be monitored.
        Instrumentation.ActivityMonitor activityMonitor = getInstrumentation().addMonitor(OurSettingsActivity.class.getName(), null, false);
        onView(withId(R.id.settingsButton)).perform(click());

        Activity nextActivity = getInstrumentation().waitForMonitorWithTimeout(activityMonitor, 5000);
        // next activity is opened and captured.
        assertNotNull(nextActivity);
        nextActivity .finish();
    }

    @Test
    public void testMap() {
        // register next activity that need to be monitored.
        Instrumentation.ActivityMonitor activityMonitor = getInstrumentation().addMonitor(GPSActivity.class.getName(), null, false);
        onView(withId(R.id.gpsButton)).perform(click());

        Activity nextActivity = getInstrumentation().waitForMonitorWithTimeout(activityMonitor, 5000);
        // next activity is opened and captured.
        assertNotNull(nextActivity);
        nextActivity .finish();
    }

}
