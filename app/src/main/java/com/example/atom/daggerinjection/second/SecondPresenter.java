package com.example.atom.daggerinjection.second;

import com.example.atom.daggerinjection.data.ApiService;

import javax.inject.Inject;

@SuppressWarnings("WeakerAccess")
public class SecondPresenter {

    SecondView mainView;
    ApiService apiService;

    @Inject
    public SecondPresenter(SecondView mainView, ApiService apiService) {
        this.mainView = mainView;
        this.apiService = apiService;
    }

    public void loadSecond() {
        apiService.loadData();
        mainView.onSecondLoaded();
    }
}
