package com.example.scon2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private FirstFragment firstFragment = new FirstFragment();
    private SecondFragment secondFragment = new SecondFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setFragment("first");

    }

    public void setFragment(String name){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();

        switch (name){
            case "first":
                transaction.replace(R.id.container,firstFragment);
                break;
            case "second":
                transaction.replace(R.id.container,secondFragment);
        }
        transaction.addToBackStack(null);
        transaction.commit();
    }
}