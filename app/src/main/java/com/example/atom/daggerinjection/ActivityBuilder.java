package com.example.atom.daggerinjection;


import com.example.atom.daggerinjection.main.MainActivity;
import com.example.atom.daggerinjection.main.MainActivityModule;
import com.example.atom.daggerinjection.second.SecondFragmentProvider;
import com.example.atom.daggerinjection.second.SecondActivity;
import com.example.atom.daggerinjection.second.SecondActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();

    @ContributesAndroidInjector(modules = {SecondActivityModule.class, SecondFragmentProvider.class})
    abstract SecondActivity bindSecondActivity();
}