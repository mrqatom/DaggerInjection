package com.example.atom.daggerinjection.main;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.atom.daggerinjection.R;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasFragmentInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class MainActivity extends AppCompatActivity implements HasSupportFragmentInjector,HasFragmentInjector {
    @Inject
    DispatchingAndroidInjector<Fragment> androidSupportFragmentInjector;
    @Inject
    DispatchingAndroidInjector<android.app.Fragment> androidFragmentInjector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public AndroidInjector<android.app.Fragment> fragmentInjector() {
        return androidFragmentInjector;
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return androidSupportFragmentInjector;
    }
}
