package com.example.huelladactilar;

import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Main2 extends AppCompatActivity {

    private Object View;

    public void una(){
        setContentView(R.layout.activity2);

    }
    Button cerrar= (Button) findViewById(R.id.Salir);
    public void onClick(android.view.View v) {
        finish();
    }
}
