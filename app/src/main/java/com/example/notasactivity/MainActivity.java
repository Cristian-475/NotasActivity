package com.example.notasactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewNotas;
    private Adaptador adaptadorNotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewNotas =(RecyclerView)findViewById(R.id.RecyclreNotas);
        recyclerViewNotas.setLayoutManager(new LinearLayoutManager(this));

        adaptadorNotas = new Adaptador(obtenerRestaurantes());
        recyclerViewNotas.setAdapter(adaptadorNotas);
    }

    public List<Notas> obtenerRestaurantes(){
        List<Notas> notas= new ArrayList<>();
        notas.add(new Notas("Listas de compras","Comprar pan tostado"));
        notas.add(new Notas("Recordar","He aparcado el coche en la csalle Republica Dominicana" +
                "no olvidarme de pagar en el parquimetro"));
        notas.add(new Notas("Cumpleaños (Fiesta)","Eeeeeeeeeeeee"));
        return notas;
    }
}