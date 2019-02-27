package com.example.hgkim.myfragment2;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ListFragment fragmentList;
    ViewerFragment fragmentViewer;

    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getSupportFragmentManager();

        fragmentList = (ListFragment)manager.findFragmentById(R.id.fragmentList);
        fragmentViewer = (ViewerFragment)manager.findFragmentById(R.id.fragmentViewer);
    }

    public void onImageChange(int index) {
        fragmentViewer.setImage(index);
    }
}
