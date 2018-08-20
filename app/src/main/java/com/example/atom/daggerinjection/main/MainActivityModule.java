package com.example.atom.daggerinjection.main;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * @author qiuyunfei
 * @date 2018/8/17
 * @description
 */
@Module(subcomponents = MainActivityComponent.class)
public abstract class MainActivityModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    bindMainActivityInjectorFactory(MainActivityComponent.Builder builder);

}
