package com.example.atom.daggerinjection.second.fragment;

import javax.inject.Inject;


public class SecondFragmentPresenter {

    SecondFragmentView secondFragmentView;

    @Inject
    public SecondFragmentPresenter(SecondFragmentView secondFragmentView) {
        this.secondFragmentView = secondFragmentView;
        secondFragmentView.onDetailFragmentLoaded();
    }
}
