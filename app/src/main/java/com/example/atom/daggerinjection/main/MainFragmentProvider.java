package com.example.atom.daggerinjection.main;

import android.support.v4.app.Fragment;

import com.example.atom.daggerinjection.main.fragment.MainFragment;
import com.example.atom.daggerinjection.main.fragment.MainFragmentComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * @author qiuyunfei
 * @date 2018/8/29
 * @description
 */
@Module
public abstract class MainFragmentProvider {
    @Binds
    @IntoMap
    @FragmentKey(MainFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindMainFragment(MainFragmentComponent.Builder builder);
}
