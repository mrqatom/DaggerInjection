package com.example.atom.daggerinjection;

import android.app.Application;
import android.content.Context;


import dagger.Binds;
import dagger.Module;

/**
 * @author qiuyunfei
 * @date 2018/8/17
 * @description
 */
@Module
public abstract class AppModule {
    @Binds
    abstract Context provideContext(Application application);
}
