package com.example.dompetkita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_login);

        View ParentView = findViewById(android.R.id.content).getRootView();
        BelajarSnakebar(ParentView);
    }



    void BelajarSnakebar(View namaVarriabelIni){
        Snackbar.make(namaVarriabelIni,"ini teks nyaaaa",Snackbar.LENGTH_LONG).show();
    }
}