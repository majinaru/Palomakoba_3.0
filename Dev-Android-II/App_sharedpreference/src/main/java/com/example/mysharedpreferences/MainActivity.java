package com.example.mysharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private Button btnSalvar;
    private TextView txtNome;
    private TextInputEditText editNome;
    private static final String ARQUIVO_PREFERENCIA = "preferencias";
    private static final String CHAVE_PREFERENCIA = "nome";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSalvar = findViewById(R.id.btnSalvar);
        txtNome = findViewById(R.id.txtNome);
        editNome = findViewById(R.id.editNome);


        SharedPreferences preferences = getSharedPreferences(ARQUIVO_PREFERENCIA, MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

        if(preferences.contains(CHAVE_PREFERENCIA)){
            String nome = preferences.getString(CHAVE_PREFERENCIA, "Usuário não definido!");
            txtNome.setText("Olá, " + nome);
        }else{
            txtNome.setText("Olá, usuário não definido!");
        }

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = editNome.getText().toString();
                if(!nome.isEmpty()){
                    editor.putString(CHAVE_PREFERENCIA, nome);
                    editor.commit();
                    txtNome.setText("Olá, " + nome);
                }else{
                    Toast.makeText(MainActivity.this, "Preencha os dados!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}