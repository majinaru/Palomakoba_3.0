package com.unir.listadecontatos2.helper;

import com.unir.listadecontatos2.model.Contato;

import java.util.List;

public interface IContatoDAO {

    public boolean salvar(Contato contato);
    public boolean atualizar(Contato contato);
    public boolean deletar(Contato contato);
    public List<Contato> listar();

}
