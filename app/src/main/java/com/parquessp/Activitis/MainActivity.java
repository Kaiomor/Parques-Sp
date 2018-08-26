package com.parquessp.Activitis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.parquessp.Adapters.KaioAdapter;
import com.parquessp.Helpers.Clicavel;
import com.parquessp.Pojos.Parques;
import com.parquessp.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    KaioAdapter kaioAdapter;
    RecyclerView recyclerView;
    List<Parques> listaDeParques;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.Recycler);


        String ibirapuera = getResources().getString(R.string.Ibirapuera);
        String vilalobos = getResources().getString(R.string.Vilalobos);
        String parqueMunicipalBarueri = getResources().getString(R.string.ParqueMunicipalBarueri);

        KaioAdapter parque1 = new KaioAdapter("a1","@drawable/download", ibirapuera);
        KaioAdapter parque2 = new KaioAdapter("a2","@drawable/download1",vilalobos);
        KaioAdapter parque3 = new KaioAdapter("a3","@drawable/download2",parqueMunicipalBarueri);

        listaDeParques = new ArrayList<>();
        listaDeParques.add(parque1);
        listaDeParques.add(parque2);
        listaDeParques.add(parque3);

        KaioAdapter kaioAdapter = new KaioAdapter(listaDeParques,this);
        kaioAdapter.setClickListener((Clicavel) MainActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(kaioAdapter);

    }

    public void onClick(View view, int position) {
        Parques kaioAdapter = listaDeParques.get(position);
        Intent intent = new Intent(view.getContext(), DetalheParques.class);
        intent.putExtra("nome", kaioAdapter.getNome());
        intent.putExtra("conteudo", kaioAdapter.getDescrição());
        intent.putExtra("imagem", kaioAdapter.getImagem());
        startActivity(intent);
    }
}
