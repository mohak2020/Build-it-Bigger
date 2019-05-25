package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;

import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class EndpointAsyncTaskTest {



    @Test
    public void testForJokes() throws Exception {


        EndpointsAsyncTask task = new EndpointsAsyncTask(new EndpointsAsyncTask.CallBack() {
            @Override
            public void passJoke(String result) {

            }
        });
        try {
            Thread.sleep(1000);
            String joke = task.get();
            assertNotNull("test passed successfully", joke);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
