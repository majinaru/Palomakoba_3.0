package com.example.sac;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class Descricao extends AppCompatActivity {
    Button btnregistrar;
    EditText edtDescricao;
    String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.descricao);

        btnregistrar= findViewById(R.id.btnregistrar);

        edtDescricao = findViewById(R.id.edtDescricao);

        Bundle params= getIntent().getExtras();
        if (params != null) {
            msg = params.getString("Levaembora");
        }

        btnregistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edtDescricao.setText("");

                AlertDialog.Builder alerta = new AlertDialog.Builder(Descricao.this);

                alerta.setTitle("Informativo:");
                String textao = String.format("Sua descrição foi registrada com Sucesso!");
                alerta.setMessage(textao);
                alerta.setNeutralButton("OK",null);
                alerta.show();
            }
        });
    }
}