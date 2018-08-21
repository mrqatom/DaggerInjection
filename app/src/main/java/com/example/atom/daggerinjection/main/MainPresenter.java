package com.example.atom.daggerinjection.main;

import com.example.atom.daggerinjection.data.ApiService;

import javax.inject.Inject;

@SuppressWarnings("WeakerAccess")
public class MainPresenter {

    MainView mainView;
    ApiService apiService;

    @Inject
    public MainPresenter(MainView mainView, ApiService apiService) {
        this.mainView = mainView;
        this.apiService = apiService;
    }

    public void loadMain() {
        apiService.loadData();
        mainView.onMainLoaded();
    }
}
