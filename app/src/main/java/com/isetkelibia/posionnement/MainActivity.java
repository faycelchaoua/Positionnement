package com.isetkelibia.posionnement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toast.makeText(this, "Changer l'orientation de l'écran", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, getResources().getString(R.string.message), Toast.LENGTH_SHORT).show();

    }
}
