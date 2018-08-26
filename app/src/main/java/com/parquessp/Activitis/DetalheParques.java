package com.parquessp.Activitis;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.parquessp.R;

public class DetalheParques extends AppCompatActivity {

    TextView nome;
    TextView descrição;
    @NonNull
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_parques);


        nome = findViewById(R.id.descricaoParques);
        descrição = findViewById(R.id.descricao);
        nome.setText(getIntent().getStringExtra("nome"));
        descrição.setText(getIntent().getStringExtra("conteudo"));
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setBackground(getResources()
                .getDrawable(getResources()
                .getIdentifier(getIntent()
                .getStringExtra("imagem"),"drawable", getPackageName())));

    }
}
