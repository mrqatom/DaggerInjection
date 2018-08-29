package com.example.atom.daggerinjection;

import android.app.Activity;
import android.support.v4.app.Fragment;

import com.example.atom.daggerinjection.main.MainActivity;
import com.example.atom.daggerinjection.main.MainActivityComponent;
import com.example.atom.daggerinjection.main.fragment.MainFragment;
import com.example.atom.daggerinjection.main.fragment.MainFragmentComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module
public abstract class ActivityBuilder {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(MainActivityComponent.Builder builder);


}