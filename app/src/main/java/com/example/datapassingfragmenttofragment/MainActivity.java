package com.example.datapassingfragmenttofragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        FragmentOne fragmentOne = new FragmentOne();
        FragmentTwo fragemntTwo = new FragmentTwo();

        transaction.add(R.id.frame1, fragmentOne);
        transaction.add(R.id.frame2, fragemntTwo);

        transaction.commit();
    }

    public void f1(String name, String address) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        FragmentTwo fragemntTwo = new FragmentTwo();
        Bundle b1 = new Bundle();
        b1.putString("name", name);
        b1.putString("address", address);
        fragemntTwo.setArguments(b1);
        transaction.add(R.id.frame2, fragemntTwo);
        transaction.commit();
    }
}
