package com.obarreto.agenda.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.obarreto.agenda.R;
import com.obarreto.agenda.dao.AlunoDao;
import com.obarreto.agenda.model.Aluno;

public class FormularioAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Novo Aluno");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);

        AlunoDao dao = new AlunoDao();
        final EditText campoNome     = findViewById(R.id.activity_formulario_aluno_nome);
        final EditText campoTelefone = findViewById(R.id.activity_formulario_aluno_telefone);
        final EditText campoEmail    = findViewById(R.id.activity_formulario_aluno_email);

        Button botaoSalvar = findViewById(R.id.activity_formulario_aluno_botao_salvar);
        botaoSalvar.setOnClickListener(v -> {
            String nome     = campoNome.getText().toString();
            String telefone = campoTelefone.getText().toString();
            String email    = campoEmail.getText().toString();

            Aluno alunoCriado = new Aluno(nome, telefone, email);
            dao.salva(alunoCriado);

            startActivity(new Intent(FormularioAlunoActivity.this,
                    ListaAlunoActivity.class));

        });

    }
}