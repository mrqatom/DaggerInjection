package com.example.atom.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

/**
 * @author qiuyunfei
 * @date 2018/8/20
 * @description
 */
public class DiDemoActivity extends AppCompatActivity {
    @Inject
    Hero hero;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidInjection.inject(this);
        showHeroDefense();
    }

    private void showHeroDefense() {
        hero.printDefense();
    }

}


class Clothes {
    final int Defense = 5;

    @Inject
    public Clothes() {
    }
}

class Pants {
    final int Defense = 10;

    @Inject
    public Pants() {
    }
}

class Hero {
    private static final String TAG = "Hero";
    private Clothes clothes;
    private Pants pants;

    @Inject
    public Hero(Clothes clothes, Pants pants) {
        this.clothes = clothes;
        this.pants = pants;
    }

    public void printDefense() {
        Log.e(TAG, "您的角色拥有防御值: " + (clothes.Defense + pants.Defense));
    }
}
