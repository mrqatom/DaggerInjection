package com.example.atom.daggerinjection;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * @author qiuyunfei
 * @date 2018/8/17
 * @description
 */
public class MyApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        AppComponent appComponent = DaggerAppComponent.builder().application(this).build();
        appComponent.inject(this);
        return appComponent;
    }

}
