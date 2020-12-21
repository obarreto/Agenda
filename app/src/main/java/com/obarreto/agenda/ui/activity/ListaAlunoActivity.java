package com.obarreto.agenda.ui.activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.obarreto.agenda.R;
import com.obarreto.agenda.dao.AlunoDao;

public class ListaAlunoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lista_aluno);
        setTitle("Lista de Alunos");

        ListView listaDeAlunos = findViewById(R.id.lista_de_alunos_listview);

        AlunoDao dao = new AlunoDao();
        listaDeAlunos.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                dao.todos()));

    }
}