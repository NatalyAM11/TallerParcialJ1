package com.example.tallerparcialj1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    private TextView bJugar;

    TCPSingleton tcp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bJugar=findViewById(R.id.bJugar);

        tcp=TCPSingleton.getInstance();

        bJugar.setOnClickListener(this);

    }

    public void onClick(View view){
        Intent i = new Intent(this,EscogePersonaje.class);
        startActivity(i);

    }
}