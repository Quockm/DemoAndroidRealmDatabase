package com.furthergrow.androidrealmtutorial;

import android.app.Application;

import io.realm.Realm;

public class MyApplication extends Application {
    //Khoi tao co so du lieu trong android
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
