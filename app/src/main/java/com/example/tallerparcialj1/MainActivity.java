package com.example.tallerparcialj1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    private ImageView bEmpezar;

    TCPSingleton tcp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bEmpezar=findViewById(R.id.bEmpezar);

        tcp=TCPSingleton.getInstance();

        bEmpezar.setOnClickListener(this);

    }

    public void onClick(View view){
        Intent i = new Intent(this,EscogePersonaje.class);
        startActivity(i);

    }
}