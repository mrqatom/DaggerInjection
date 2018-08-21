package com.example.atom.sample;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * @author qiuyunfei
 * @date 2018/8/17
 * @description
 */
@Subcomponent
public interface DiDemoComponent extends AndroidInjector<DiDemoActivity> {
    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<DiDemoActivity> {
    }
}
