package com.holamundo.diseno50.ceramicacaste;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListadoProductos extends AppCompatActivity {

    private ProductoAdapter productoItemArrayAdapter;
    ListView milista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_productos);

        ArrayList<Producto> lista = new ArrayList<Producto>();

        milista = (ListView)findViewById(R.id.milista);
        Producto producto= new Producto("Piso ceramico","500","El mejor percio","piso");
        lista.add(producto);
        producto= new Producto("Piso de madera","400","El mejor percio por mayoreo","piso");
        lista.add(producto);
        productoItemArrayAdapter= new ProductoAdapter(this,lista);
        milista.setAdapter(productoItemArrayAdapter);
    }
}
