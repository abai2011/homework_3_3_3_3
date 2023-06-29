package com.example.homework_3_3_3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addFragment(new VegetablesFragment());
        addFragment(new ContactFragment());
        addFragment(new MotobrikeFragment());
    }

    private void addFragment(MotobrikeFragment motobrikeFragment) {

    }

    private void addFragment(ContactFragment contactFragment) {

    }

    private void addFragment(VegetablesFragment vegetablesFragment) {

    }


    private void addFragments(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().add(R.id.fragments, fragment).commit();

    }

}