package com.example.atom.daggerinjection;

import android.app.Application;

import com.example.atom.daggerinjection.main.MainActivityModule;
import com.example.atom.sample.DiDemoModule;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * @author qiuyunfei
 * @date 2018/8/17
 * @description
 */
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class,
        ActivityBuilder.class})
public interface AppComponent extends AndroidInjector<MyApplication> {

    @Override
    void inject(MyApplication app);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
