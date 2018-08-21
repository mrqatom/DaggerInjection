package com.example.atom.daggerinjection;

import android.app.Application;
import android.content.Context;

import com.example.atom.daggerinjection.main.MainActivityComponent;

import dagger.Binds;
import dagger.Module;

/**
 * @author qiuyunfei
 * @date 2018/8/17
 * @description
 */
@Module(subcomponents = MainActivityComponent.class)
public abstract class AppModule {
    @Binds
    abstract Context provideContext(Application application);
}
