package com.example.atom.daggerinjection.second;

import com.example.atom.daggerinjection.second.fragment.SecondFragment;
import com.example.atom.daggerinjection.second.fragment.SecondFragmentModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;


@Module
public abstract class SecondFragmentProvider {

    @ContributesAndroidInjector(modules = SecondFragmentModule.class)
    abstract SecondFragment provideDetailFragmentFactory();
}
