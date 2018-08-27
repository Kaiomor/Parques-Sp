package com.parquessp.Activitis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.parquessp.Adapters.KaioAdapter;
import com.parquessp.Helpers.Clicavel;
import com.parquessp.Pojos.Parques;
import com.parquessp.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Clicavel {

    KaioAdapter kaioAdapter;
    RecyclerView recyclerView;
    List<Parques> listaDeParques;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Associando o Recycler com o XML
        recyclerView = (RecyclerView) findViewById(R.id.Recycler);

        //Crio Strings pra obter os dados na pasta Strings
        String ibira = this.getString(R.string.ib);
        String vila = this.getString(R.string.vila);
        String muni = this.getString(R.string.Municipal);

        //Cria-se os objetos pra inserir na lista que d passada para o Adapter renderiza-la no Recycler
        Parques ibirapuera = new Parques("Ibirapuera", ibira, "@drawable/download");
        Parques vilaLobos = new Parques("Vila Lobos", vila, "@drawable/download1");
        Parques municipal = new Parques("Municipal", muni,"@drawable/download2");
        Parques ibirapuera1 = new Parques("Ibirapuera", ibira, "@drawable/download");
        Parques vilaLobos1 = new Parques("Vila Lobos", vila, "@drawable/download1");
        Parques municipal1 = new Parques("Municipal", muni,"@drawable/download2");
        Parques ibirapuera2 = new Parques("Ibirapuera", ibira, "@drawable/download");
        Parques vilaLobos2 = new Parques("Vila Lobos", vila, "@drawable/download1");
        Parques municipal2 = new Parques("Municipal", muni,"@drawable/download2");

        //Insere-se os objetos na Lista
        listaDeParques = new ArrayList<>();
        listaDeParques.add(ibirapuera);
        listaDeParques.add(vilaLobos);
        listaDeParques.add(municipal);
        listaDeParques.add(ibirapuera1);
        listaDeParques.add(vilaLobos1);
        listaDeParques.add(municipal1);
        listaDeParques.add(ibirapuera2);
        listaDeParques.add(vilaLobos2);
        listaDeParques.add(municipal2);



        //Passa-se a lista para o Adapter
        kaioAdapter = new KaioAdapter(listaDeParques, MainActivity.this);

        //Setando o clickListener do Adapter
        //Informando-o que quem vai tratar o click é a MainActivity
        kaioAdapter.setClickListener(MainActivity.this);
        //Inserindo o tipo de Layout no Recycler (Grid ou Linear)
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //Inserindo o adapter que já contém a lista de informações, no Adapter, para rederiza-la
        recyclerView.setAdapter(kaioAdapter);

    }

    public void onClick(View view, int position) {
        Parques kaioAdapter = listaDeParques.get(position);
        Intent intent = new Intent(view.getContext(), DetalheParques.class);
        intent.putExtra("nome", kaioAdapter.getNome());
        intent.putExtra("conteudo", kaioAdapter.getDescricao());
        intent.putExtra("imagem", kaioAdapter.getImagem());
        startActivity(intent);
    }
}
