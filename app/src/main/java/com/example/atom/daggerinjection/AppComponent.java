package com.example.atom.daggerinjection;

import android.app.Application;

import com.example.atom.daggerinjection.main.MainActivityModule;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * @author qiuyunfei
 * @date 2018/8/17
 * @description
 */
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class,
        MainActivityModule.class})
public interface AppComponent {

    void inject(MyApplication app);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
