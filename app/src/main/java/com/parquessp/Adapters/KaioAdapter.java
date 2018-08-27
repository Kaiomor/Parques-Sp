package com.parquessp.Adapters;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.parquessp.Helpers.Clicavel;
import com.parquessp.Pojos.Parques;
import com.parquessp.R;
import java.util.List;

public class KaioAdapter extends  RecyclerView.Adapter<KaioAdapter.ViewHolder> {

    List<Parques>listaDeParques;
    Context context;
    Clicavel clicavel;

    public KaioAdapter(List<Parques>listaDeParques, Context context) {
        this.listaDeParques = listaDeParques;
        this.context = context;

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
        holder.bind(parque.getNome(),parque.getDescricao(), parque.getDescricao()
        );


    }

    @Override
    public int getItemCount() {
        return listaDeParques.size();
    }


    public void setClickListener(Clicavel clicavel) {
        this.clicavel = clicavel;
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        CardView cardView;
        ImageView imageView;
        TextView text;
        TextView text2;
        Context context;


        public ViewHolder(View itemView) {
            super(itemView);


            context = itemView.getContext();
            cardView = (CardView) itemView.findViewById(R.id.Card);
            imageView = (ImageView) itemView.findViewById(R.id.image);
            text = (TextView) itemView.findViewById(R.id.text1);
            text2 = (TextView) itemView.findViewById(R.id.text2);
            itemView.setTag(itemView);
            itemView.setOnClickListener((View.OnClickListener) this);

        }

        public int getImageDrawableResId(String imageId ){
            Resources resources = context.getResources();
            return resources.getIdentifier(imageId, "drawable", context.getPackageName());

        }

        public void bind(String nome,String descricao, String imagem){
            this.text.setText(nome);
            this.text2.setText(descricao);
            this.imageView.setImageResource(getImageDrawableResId(imagem));
        }

        @Override
        public void onClick(View v) {
            if (clicavel != null) clicavel.onClick(v, getAdapterPosition());
        }
    }
}


