package com.example.atom.daggerinjection.main;


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
public abstract class MainActivityModule {
    @Binds
    abstract MainView provideMainView(MainActivity mainActivity);

    @Provides
    MainPresenter provideMainPresenter(MainView mainView, ApiService apiService) {
        return new MainPresenter(mainView, apiService);
    }
}
