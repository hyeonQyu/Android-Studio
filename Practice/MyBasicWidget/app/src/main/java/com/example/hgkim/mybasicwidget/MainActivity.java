package com.example.hgkim.mybasicwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton mRadioButton = findViewById(R.id.radioButton);
        RadioButton fRadioButton = findViewById(R.id.radioButton2);

        boolean isChecked = mRadioButton.isChecked();
    }
}
