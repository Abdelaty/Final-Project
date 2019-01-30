package builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest extends AndroidTestCase {
    @Test
    public void testNonEmptyJoke() {
        try {
            EndpointsAsyncTask task = new EndpointsAsyncTask();
            task.execute(InstrumentationRegistry.getTargetContext());
            String joke = task.get(45, TimeUnit.SECONDS);

            assertNotNull(joke);
            assertTrue(joke.length() > 0);
        } catch (Exception e) {
            fail("time out");
        }

    }
}
