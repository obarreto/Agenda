package com.obarreto.agenda.dao;

import com.obarreto.agenda.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoDao {

    //Implemanta solução de persistência via memória, criando um atributo privado estático do tipo List<Aluno>
    private final static List<Aluno> alunos = new ArrayList<>();

    //Metodo implemantado para receber aluno
    public void salva(Aluno aluno) {
        //O método add() da lista envia o aluno recebido via parâmetro.
        alunos.add(aluno);
    }

    //Devolve um cópia da referência lista estática garantindo o encapsulamento
    public List<Aluno> todos() {
        return new ArrayList<>(alunos);


    }
}
