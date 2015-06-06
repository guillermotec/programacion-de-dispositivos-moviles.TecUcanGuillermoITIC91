package com.example.blacckkiller.sunshine;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by blaccKkiller on 26/05/2015.
 */
public class carrroAdapter extends BaseAdapter {
    private ArrayList <Carros>ListaC;
    private Context context;

    public carrroAdapter(Context context, ArrayList <Carros> ListaC) {
        this.context = context;
        this.ListaC =ListaC;
    }

    @Override
    public int getCount() {
        return ListaC.size();
    }

    @Override
    public Object getItem(int position) {
        return ListaC.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Carros carro = ListaC.get(position);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View Layoult = inflater.inflate(R.layout.fragment_main,null);

        TextView Modelo = (TextView) Layoult.findViewById(R.id.t1);
        Modelo.setText(carro.getModelo());

        TextView Marca = (TextView) Layoult.findViewById(R.id.t2);
        Marca.setText(carro.getModelo());

        ImageView imagen = (ImageView) Layoult.findViewById(R.id.vi);
        imagen.setImageResource(carro.getCarrosImages(position));

        if(position  %2 ==0){
            Layoult.setBackground(Color.YELLOW);
        }

        return Layoult;
    }
}
