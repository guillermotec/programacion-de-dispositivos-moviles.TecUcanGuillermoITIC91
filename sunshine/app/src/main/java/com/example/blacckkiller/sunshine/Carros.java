package com.example.blacckkiller.sunshine;

import android.widget.Switch;

/**
 * Created by blaccKkiller on 25/05/2015.
 */
public class Carros {
    private String modelo;
    private String marca;




    public void setModelo(String modelo) {

        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.color = color;
    }

    public String getModelo(String modelo){
        return modelo;
    }
    public String getMarca(String marca) {
        return color;
    }

    public int getCarrosImages(int position) {
        switch (position) {
            case 0:
                return(android.R.drawable.1);
            case 1:
                return(R.drawable.2);
            case 2:
                return (R.drawable.3);
            case 3:
                return (R.drawable.4);
            default:
                return (R.drawable.5);
        }
    }
}
