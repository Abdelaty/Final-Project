package builditbigger;

import android.test.AndroidTestCase;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import java.util.concurrent.TimeUnit;

public class AsyncTaskTest extends AndroidTestCase {
    public void testNonEmptyJoke() {
        try {
            EndpointsAsyncTask task = new EndpointsAsyncTask();
            task.execute();
            String joke = task.get(45, TimeUnit.SECONDS);

            assertNotNull(joke);
            assertTrue(joke.length() > 0);
        } catch (Exception e) {
            fail("time out");
        }

    }
}
