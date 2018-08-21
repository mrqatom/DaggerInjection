package com.example.atom.daggerinjection.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.atom.daggerinjection.R;
import com.example.atom.daggerinjection.second.SecondActivity;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity implements MainView {
    @Inject
    MainPresenter presenter;
    TextView tv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter.loadMain();
    }


    @Override
    public void onMainLoaded() {
        tv = findViewById(R.id.hw);
        btn = findViewById(R.id.turn);
        //模拟耗时
        tv.postDelayed(new Runnable() {
            @Override
            public void run() {
                tv.setText("hello Dagger2.1");
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity.this, SecondActivity.class));
                    }
                });
            }
        }, 2000);
    }
}
