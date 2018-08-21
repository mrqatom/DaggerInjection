package com.example.atom.daggerinjection.second;

import android.os.Bundle;

import com.example.atom.daggerinjection.R;
import com.example.atom.daggerinjection.second.fragment.SecondFragment;

import javax.inject.Inject;

import dagger.android.HasFragmentInjector;
import dagger.android.support.DaggerAppCompatActivity;
import dagger.android.support.HasSupportFragmentInjector;

public class SecondActivity extends DaggerAppCompatActivity implements HasSupportFragmentInjector, HasFragmentInjector, SecondView {
    @Inject
    SecondPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        presenter.loadSecond();
    }


    @Override
    public void onSecondLoaded() {
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.content, SecondFragment.newInstance())
                .commitAllowingStateLoss();
    }
}
