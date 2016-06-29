package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.test.AndroidTestCase;
import android.test.suitebuilder.annotation.SmallTest;
import android.util.Log;
import android.util.Pair;

public class TestBuildGroupTask extends AndroidTestCase implements TestTaskItf{


    private SyncronizeTalker async = null;

    public void setUP() throws Exception{
        super.setUp();
    }

    public void tearDown() throws Exception{
        super.tearDown();
    }

    @SmallTest
    public void test____Run(){

         mContext = getContext();

         //assertNotNull(mContext);

        async = new SyncronizeTalker();

        TestTaskItf me = this;
        MainActivity.EndpointsAsyncTask task = new MainActivity().new EndpointsAsyncTask(me);
        task.execute(new Pair<Context, String>(getContext(), "Manfred"));

        async.doWait(); // <--- wait till "async.doNotify()" is called
    }

    @Override
    public void onDone(String result) {
        assertNotNull(result);

        // run other validations here

        async.doNotify(); // release "async.doWait()" (on this step the unitest is finished)
    }
}