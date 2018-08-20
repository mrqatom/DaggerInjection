package com.example.atom.daggerinjection.main;

import android.app.Activity;
import android.support.v4.app.Fragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * @author qiuyunfei
 * @date 2018/8/20
 * @description
 */
@Module(subcomponents = MainFragmentComponent.class)
public abstract class MainFragmentModule {

    @Binds
    @IntoMap
    @FragmentKey(MainFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment>
    bindMainFragmentInjectorFactory(MainFragmentComponent.Builder builder);
}
