package com.unir.listadecontatos2.helper;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.unir.listadecontatos2.model.Contato;

import java.util.ArrayList;
import java.util.List;

public class ContatoDAO implements IContatoDAO{

    private SQLiteDatabase leitura;
    private SQLiteDatabase escrita;

    public ContatoDAO(Context context){
        DbHelper dbHelper = new DbHelper(context);
        this.escrita = dbHelper.getWritableDatabase();
        this.leitura = dbHelper.getReadableDatabase();
    }

    @Override
    public boolean salvar(Contato contato) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("nomeContato", contato.getNome());
        contentValues.put("email", contato.getEmail());
        contentValues.put("telefone", contato.getTelefone());
        this.escrita.insert(DbHelper.NOME_TABELA, null, contentValues);
        return true;
    }

    @Override
    public boolean atualizar(Contato contato) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("nomeContato", contato.getNome());
        contentValues.put("email", contato.getEmail());
        contentValues.put("telefone", contato.getTelefone());
        String [] args = {String.valueOf(contato.getId())};
        this.escrita.update(DbHelper.NOME_TABELA, contentValues, "id=?", args);
        return true;
    }

    @Override
    public boolean deletar(Contato contato) {
        String [] args = {String.valueOf(contato.getId())};
        this.escrita.delete(DbHelper.NOME_TABELA, "id=?", args);
        return true;
    }

    @SuppressLint("Range")
    @Override
    public List<Contato> listar() {
        List<Contato> contatos = new ArrayList<Contato>();
        String sql = "SELECT * FROM " + DbHelper.NOME_TABELA + ";";
        Cursor cursor = this.leitura.rawQuery(sql, null);
        while(cursor.moveToNext()){
            Long id = cursor.getLong(cursor.getColumnIndex("id"));
            String nome = cursor.getString(cursor.getColumnIndex("nomeContato"));
            String email = cursor.getString(cursor.getColumnIndex("email"));
            String telefone = cursor.getString(cursor.getColumnIndex("telefone"));
            Contato contato = new Contato(nome, email, telefone, id);
            contatos.add(contato);
        }
        return contatos;
    }
}
