package com.example.pizzaria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pagamento extends AppCompatActivity {
    Button btVoltar;
    double total;
    TextView txtpagar;
    String txtpizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagamento);
        btVoltar = findViewById(R.id.btVoltar);
        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        txtpagar =findViewById(R.id.edtpagar);
        Bundle params = getIntent().getExtras();
        if (params != null) {
            txtpizza = params.getString("pizzas");
            total = params.getDouble("total");
            txtpagar.setText(String.format("Total a Pagar $%5.2f", total));
        }
    }
}