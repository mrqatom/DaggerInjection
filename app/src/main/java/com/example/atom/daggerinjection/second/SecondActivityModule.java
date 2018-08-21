package com.example.atom.daggerinjection.second;

import com.example.atom.daggerinjection.data.ApiService;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * @author qiuyunfei
 * @date 2018/8/17
 * @description
 */
@Module
public abstract class SecondActivityModule {
    @Binds
    abstract SecondView provideSecondView(SecondActivity SecondActivity);

    @Provides
    SecondPresenter provideSecondPresenter(SecondView SecondView, ApiService apiService) {
        return new SecondPresenter(SecondView, apiService);
    }
}
