package com.example.notasactivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView Titulo, Contenido;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Titulo = (TextView)itemView.findViewById(R.id.tvnota);
            Contenido = (TextView)itemView.findViewById(R.id.tvcontenido);
        }
    }
    public List<Notas> RestLista;

    public Adaptador(List<Notas> restLista) {
        this.RestLista = restLista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.iten_notas,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.Titulo.setText(RestLista.get(position).getTitulo());
        holder.Contenido.setText(RestLista.get(position).getContenido());
    }

    @Override
    public int getItemCount() {
        return RestLista.size();
    }
}