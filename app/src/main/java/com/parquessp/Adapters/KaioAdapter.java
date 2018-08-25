package com.parquessp.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.parquessp.Pojos.Parques;
import com.parquessp.R;

import java.util.List;

public class KaioAdapter extends  RecyclerView.Adapter<KaioAdapter.ViewHolder> {

    private List<Parques>listaDeParques;
    private Context context;
    Clicavel clicavel;

    public KaioAdapter(List<Parques> listaDeParques, Context context, Clicavel clicavel) {
        this.listaDeParques = listaDeParques;
        this.context = context;
        this.clicavel = clicavel;
    }

    @NonNull
    @Override
    public KaioAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new ViewHolder(inflater.inflate(R.layout.itemrecycler,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Parques parque = listaDeParques.get(position);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        ImageView imageView;
        TextView text;
        TextView text2;

        public ViewHolder(View itemView) {
            super(itemView);

            cardView = (CardView) itemView.findViewById(R.id.Card);
            imageView = (ImageView) itemView.findViewById(R.id.image);
            text = (TextView) itemView.findViewById(R.id.text1);
            text2 = (TextView) itemView.findViewById(R.id.text2);

        }
    }
    public void bind (){


    }
}


