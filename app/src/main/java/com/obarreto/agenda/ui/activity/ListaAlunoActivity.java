package com.obarreto.agenda.ui.activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.obarreto.agenda.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaAlunoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* TextView aluno = new TextView(this);
        aluno.setText("Ozeias Barreto");
        setContentView(aluno);
        setContentView(R.layout.activity_main);
        List<String> alunos = new ArrayList<>(Arrays.asList("Nanny", "Eu", "Tico", "Bi"));
        TextView primeiroAluno = findViewById(R.id.textView);
        TextView segundoAluno = findViewById(R.id.textView2);
        TextView terceiroAluno = findViewById(R.id.textView3);
        TextView quartooAluno = findViewById(R.id.textView4);

        primeiroAluno.setText(alunos.get(0));
        segundoAluno.setText(alunos.get(1));
        terceiroAluno.setText(alunos.get(2));
        quartooAluno.setText(alunos.get(3));*/
        setContentView(R.layout.activity_lista_aluno);
        setTitle("Lista de Alunos");
        List<String> alunos = new ArrayList<>(Arrays.asList("Nanny", "Eu", "Tico", "Bi"));
        ListView listaDeAlunos = findViewById(R.id.lista_de_alunos_listview);
        listaDeAlunos.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, alunos));

    }
}