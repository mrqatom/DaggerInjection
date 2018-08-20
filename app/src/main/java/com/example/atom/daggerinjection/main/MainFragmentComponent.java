package com.example.atom.daggerinjection.main;

import android.support.v4.app.Fragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * @author qiuyunfei
 * @date 2018/8/20
 * @description
 */
@Subcomponent
public interface MainFragmentComponent extends AndroidInjector<MainFragment> {

    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<MainFragment> {
    }

}
