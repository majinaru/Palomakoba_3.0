package com.example.pizzaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    Button btnpagar, btnlimpar;
    CheckBox ckcalabresa, ckpalmito, ckmargarita, ck4queijos, ckmodacasa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnlimpar= findViewById(R.id.btnlimpar);
        btnpagar= findViewById(R.id.btnpagar);
        ckcalabresa= findViewById(R.id.ckcalabresa);
        ckpalmito= findViewById(R.id.ckpalmito);
        ckmargarita= findViewById(R.id.ckmargarita);
        ck4queijos= findViewById(R.id.ck4queijos);
        ckmodacasa= findViewById(R.id.ckmodacasa);
        btnlimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ckcalabresa.setChecked(false);
                ckmargarita.setChecked(false);
                ckpalmito.setChecked(false);
                ck4queijos.setChecked(false);
                ckmodacasa.setChecked(false);
            }
        });
        btnpagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double total= 0;
                if (ckcalabresa.isChecked()) {
                    total += 70;
                }
                if (ckpalmito.isChecked()){
                    total += 70;
                }
                if (ckmargarita.isChecked()){
                    total += 70;
                }
                if (ck4queijos.isChecked()){
                    total += 85;
                }
                if (ckmodacasa.isChecked()){
                    total += 85;
                }
                Intent it = new Intent(getBaseContext(),Pagamento.class);
                Bundle params = new Bundle();
                params.putDouble("total",total);
                it.putExtras(params);
                startActivity(it);
            }
        });
    }
}