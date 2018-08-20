package com.example.atom.sample;

import com.example.atom.daggerinjection.main.MainActivity;
import com.example.atom.daggerinjection.main.MainFragmentModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * @author qiuyunfei
 * @date 2018/8/17
 * @description
 */
@Subcomponent(modules = MainFragmentModule.class)
public interface DiDemoComponent extends AndroidInjector<DiDemoActivity> {
    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<DiDemoActivity> {
    }
}
