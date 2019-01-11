package com.example.inuker;

import android.app.Application;

import com.inuker.ble.library.utils.ContextUtils;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ContextUtils.setContext(this);
    }
}
