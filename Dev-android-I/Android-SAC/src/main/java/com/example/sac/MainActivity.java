package com.example.sac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button btnregistrar, btnreclamacao;
    CheckBox cknotebook,ckimpressora,ckdesktop,cktablet,cknet,ckoutros;
    TextView edtemail,edtdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnregistrar= findViewById(R.id.btnregistrar);
        btnreclamacao= findViewById(R.id.btnreclamacao);
        cknotebook= findViewById(R.id.cknotebook);
        ckimpressora= findViewById(R.id.ckimpressora);
        ckdesktop= findViewById(R.id.cktablet);
        cktablet= findViewById(R.id.cknet);
        cknet= findViewById(R.id.ckoutros);

        btnreclamacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg= "";
                msg+= edtemail.getText().toString()+ "\n";
                msg+= edtdata.getText().toString()+ "\n";
                if(ckdesktop.isChecked()) {
                    msg += "Desktop\n";
                }
                if(ckimpressora.isChecked()) {
                    msg += "Impressora\n";
                }
                if(cknotebook.isChecked()) {
                    msg += "Notebook\n";
                }
                if(cktablet.isChecked()) {
                    msg += "Tablet\n";
                }
                if(cknet.isChecked()) {
                    msg += "Net\n";
                }
                if(ckoutros.isChecked()) {
                    msg += "Outros\n";
                }

                Intent it= new Intent(getBaseContext(),Descricao.class);
                Bundle params= new Bundle();
                params.putString("Levaembora",msg);
                it.putExtras(params);
                startActivity(it);

            }
        });

    }
//});
        }
       // }