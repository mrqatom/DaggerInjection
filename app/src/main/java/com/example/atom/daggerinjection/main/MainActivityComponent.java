package com.example.atom.daggerinjection.main;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * @author qiuyunfei
 * @date 2018/8/17
 * @description
 */
@Subcomponent(modules = {MainActivityModule.class})
public interface MainActivityComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<MainActivity> {
    }
}
