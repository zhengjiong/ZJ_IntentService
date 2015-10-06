package com.zj.example.intentservice;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by zj on 2015/10/6.
 */
public class MyIntentService extends IntentService {
    private static final String TAG = "zj";

    public MyIntentService(){
        super("MyIntentService 1");
    }

    public MyIntentService(String name) {
        super(name);
        debug("MyIntentService 2");
    }

    /**
     * onHandleIntent是在子线程中执行的
     * @param intent
     */
    @Override
    protected void onHandleIntent(Intent intent) {
        debug("onHandleIntent");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        debug("onCreate");
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        debug("onStart");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        debug("onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        debug("onDestroy");
    }

    public static void debug(String msg) {
        Log.i(TAG, msg);
    }
}
