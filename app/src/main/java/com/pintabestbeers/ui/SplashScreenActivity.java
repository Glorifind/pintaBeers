package com.pintabestbeers.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.pintabestbeers.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
    }

    public void moreThan18(View view) {
        Intent intent = new Intent(SplashScreenActivity.this, BeerListActivity.class);
        startActivity(intent);
    }

    public void lessThan18(View view) {
        this.finishAffinity();
    }
}
