package com.example.mauriciocantu.sqlite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TelaMenu extends AppCompatActivity {

    private Button btCadastrar, btAcoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_menu);
        this.inicializaComponentes();
        this.btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itTelaCadastro = new Intent(TelaMenu.this, TelaCadastro.class);
                startActivity(itTelaCadastro);
            }
        });

        this.btAcoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itTelaLista = new Intent(TelaMenu.this, TelaLista.class);
                startActivity(itTelaLista);
            }
        });
    }

    private void inicializaComponentes(){
        this.btCadastrar = (Button)findViewById(R.id.bt_Cadastrar);
        this.btAcoes = (Button)findViewById(R.id.bt_Acoes);
    }
}
