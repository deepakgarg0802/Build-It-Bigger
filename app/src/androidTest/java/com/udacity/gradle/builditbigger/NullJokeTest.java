package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by Deepak Garg on 20-10-2016.
 */

public class NullJokeTest extends AndroidTestCase {
    String TAG = EndpointsAsyncTask.class.getSimpleName();

    public void testJoke(){
        String result= null;

        EndpointsAsyncTask endpointsAsyncTask= new EndpointsAsyncTask();
        endpointsAsyncTask.execute(getContext());

        try {
            result=endpointsAsyncTask.get(30, TimeUnit.SECONDS);
            Log.d(TAG,"String received is non-empty");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            fail("Timed out");
        }

        assertNotNull("null object received",result);
        assertTrue("Length of string not greater than 0", result.length()>0);
    }
}
