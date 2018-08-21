package com.example.atom.daggerinjection.second.fragment;

import dagger.Module;
import dagger.Provides;


@Module
public class SecondFragmentModule {

    @Provides
    SecondFragmentView provideDetailFragmentView(SecondFragment detailFragment){
        return detailFragment;
    }

}
