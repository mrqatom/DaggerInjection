package com.example.atom.daggerinjection.main;

import android.app.Activity;

import com.example.atom.daggerinjection.data.ApiService;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * @author qiuyunfei
 * @date 2018/8/17
 * @description
 */
@Module
public class MainActivityModule {
    @Provides
    MainView provideMainView(MainActivity mainActivity){
        return mainActivity;
    }
    @Provides
    MainPresenter provideMainPresenter(MainView mainView, ApiService apiService) {
        return new MainPresenter(mainView, apiService);
    }
}
