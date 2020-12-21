package com.obarreto.agenda.model;

import androidx.annotation.NonNull;

public class Aluno {
    private final String nome;
    private final String telefone;
    private final String email;

    public Aluno(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    @NonNull //Notação utilizada para indicar de que não faz sentido enviar dado nulo
    @Override
    //Retorna o atributo nome para lista que será mostrado em acitvity_lista_aluno
    public String toString() {
        return nome;
    }
}
