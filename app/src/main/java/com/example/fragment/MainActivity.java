//https://rudalle.ru/kandinsky31
//https://developer.android.com/guide/fragments
package com.example.fragment;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonListFragment = findViewById(R.id.buttonListFragment);
        Button buttonProfileFragment = findViewById(R.id.buttonProfileFragment);

        buttonListFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListFragment listFragment = new ListFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragmentContainer, listFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        buttonProfileFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProfileFragment profileFragment = new ProfileFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragmentContainer, profileFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
    }
}