package com.holamundo.diseno50.ceramicacaste;

import android.app.Activity;
import android.content.res.Resources;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Diseño 50 on 06/06/2016.
 */
public class ProductoAdapter extends ArrayAdapter<Producto> {

    private LayoutInflater inflater;
    private TextView textView;

    public ProductoAdapter(Activity activity, ArrayList<Producto> items) {

        super(activity, R.layout.row_producto, items);
        inflater = activity.getWindow().getLayoutInflater();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        Producto producto = getItem(position);
        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_producto, parent, false);
        }
        TextView tNombre = (TextView) convertView.findViewById(R.id.textView);

        TextView tPrecio = (TextView) convertView.findViewById(R.id.textView3);

        TextView tDescripcion = (TextView) convertView.findViewById(R.id.textView4);
        TextView timage = (TextView) convertView.findViewById(R.id.textView5);

        ImageView imgProducto= (ImageView) convertView.findViewById(R.id.imageView);

        tNombre.setText(producto.Nombre);
        tPrecio.setText(producto.Precio);
        tDescripcion.setText(producto.Descripcion);
        timage.setText(producto.image);

        Resources res=convertView.getResources();
        String mDrawableName= "cati";
        int resId=res.getIdentifier(mDrawableName,"drawable","com.holamundo.diseno50.ceramicacaste");
        imgProducto.setImageResource(resId);


        return convertView;

    }
}
