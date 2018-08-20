package com.example.atom.sample;

import android.app.Activity;

import com.example.atom.daggerinjection.main.MainActivity;

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
@Module(subcomponents = DiDemoComponent.class)
public abstract class DiDemoModule {
    @Binds
    @IntoMap
    @ActivityKey(DiDemoActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    bindMainActivityInjectorFactory(DiDemoComponent.Builder builder);

}
