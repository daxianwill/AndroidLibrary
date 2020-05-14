package com.app.myapplication;

import android.app.Application;

import com.umeng.commonsdk.UMConfigure;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        UMConfigure.init(this, "5e96c3d7895cca31cd00014d", "Umeng", UMConfigure.DEVICE_TYPE_PHONE,"");
        UMConfigure.setLogEnabled(true);
        UMConfigure.setEncryptEnabled(true);
    }
}
