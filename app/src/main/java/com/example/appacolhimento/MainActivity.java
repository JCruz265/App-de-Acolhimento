package com.example.appacolhimento;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

Button ButLogin1, ButLogin2, ButAnt, ButPos, ButInic;
    TextView user, senha,resp, nome, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CarregarTelaInicial();
    }
    @SuppressLint("MissingInflatedId")
    public void CarregarTelaInicial() {
        setContentView(R.layout.activity_main);
        ButLogin1 = (Button) findViewById(R.id.idBut);
        ButLogin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {                CarregarTelaLogin();            }
        });
    }/*
    @SuppressLint("MissingInflatedId")
    public void Escrever (View view){
        setContentView(R.layout.activity_login);
        nome = findViewById(R.id.idName);
        result = findViewById(R.id.idTitle);
                String name = nome.getText().toString();
                result.setText("Bem-Vindo\n"+name);

    }*/


    @SuppressLint("MissingInflatedId")
    public void CarregarTelaLogin() {
        setContentView(R.layout.activity_login);
        //
        user = findViewById(R.id.idMat);
        senha = findViewById(R.id.idSenha);
        resp = findViewById(R.id.idIncor);//
        String [] Funcionarios = new String[] {"1111", "2222", "3333", "4444"};
       String [] senhasCad = new String[] {"EstouAqui", "FuiAli", "FiqueiFora", "NemParticipei"};
        //
        ButLogin2 = (Button) findViewById(R.id.idButLogin);
        ButLogin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int j=0;
                for(int i =0; i < Funcionarios.length;i++){
                    if(Funcionarios[i].equals(user.getText().toString())){
                        j = i;
                    }
                }
                if( senhasCad[j].equals(senha.getText().toString())){
                CarregarTelaLista();}
                else{
                    resp.setText("Matricula ou Senha Incorreta");
                }
            }
        });
    }

    @SuppressLint("MissingInflatedId")
    public void CarregarTelaLista() {
        setContentView(R.layout.activity_lista);
        ButAnt = (Button) findViewById(R.id.idAnt);
        ButAnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTelaLogin();
            }
        });
        ButPos = (Button) findViewById(R.id.idInic);
        ButPos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTelaLista2();
            }
        });
    }

    @SuppressLint("MissingInflatedId")
    public void CarregarTelaLista2() {
        setContentView(R.layout.activity_capacit);
        ButAnt = (Button) findViewById(R.id.idAnt);
        ButAnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTelaLista();
            }
        });
        ButPos = (Button) findViewById(R.id.idInic);
        ButPos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTelaFinal();
            }
        });
    }
    @SuppressLint("MissingInflatedId")
    public void CarregarTelaFinal() {
        setContentView(R.layout.activity_final);
        ButAnt = (Button) findViewById(R.id.idAnt);
        ButAnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTelaLista2();
            }
        });
        ButInic = (Button) findViewById(R.id.idInic);
        ButInic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTelaInicial();
            }
        });
    }
}
