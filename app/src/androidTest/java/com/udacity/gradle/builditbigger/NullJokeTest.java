package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

import java.util.concurrent.ExecutionException;

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
            result=endpointsAsyncTask.get();
            Log.d(TAG,"String received is non-empty");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        assertNotNull("null object received",result);
        assertTrue("Length of string not greater than 0", result.length()>0);
    }
}
