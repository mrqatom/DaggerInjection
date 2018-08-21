package com.example.atom.daggerinjection.main;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.atom.daggerinjection.R;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasFragmentInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class MainActivity extends AppCompatActivity implements HasSupportFragmentInjector, HasFragmentInjector, MainView {
    @Inject
    DispatchingAndroidInjector<Fragment> androidSupportFragmentInjector;
    @Inject
    DispatchingAndroidInjector<android.app.Fragment> androidFragmentInjector;
    @Inject
    MainPresenter presenter;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter.loadMain();
    }


    @Override
    public AndroidInjector<android.app.Fragment> fragmentInjector() {
        return androidFragmentInjector;
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return androidSupportFragmentInjector;
    }

    @Override
    public void onMainLoaded() {
        tv = findViewById(R.id.hw);
        //模拟耗时
        tv.postDelayed(new Runnable() {
            @Override
            public void run() {
                tv.setText("hello Dagger2.1");
            }
        }, 2000);
    }
}
