package deveryware.deveryware_android_project;

import android.support.test.InstrumentationRegistry;
import android.test.ActivityInstrumentationTestCase2;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import org.junit.Before;
import org.junit.Test;

public class MyEspressoTest
        extends ActivityInstrumentationTestCase2<MainActivity> {

    private static final Object STRING_TO_BE_TYPED = "Test";
    private MainActivity mActivity;

    public MyEspressoTest() {
        super(MainActivity.class);
    }

    @Before
    public void setUp() throws Exception {
        super.setUp();
        injectInstrumentation(InstrumentationRegistry.getInstrumentation());
        mActivity = getActivity();
    }

    @Test
    public void testChangeText_sameActivity() {
        onView(withId(R.id.button)).perform(click()).check(matches(isDisplayed()));
    }
}
