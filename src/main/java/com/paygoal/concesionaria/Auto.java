package com.paygoal.concesionaria;

import java.text.NumberFormat;
import java.util.Locale;

public class Auto extends Vehiculo {

    private int puertas;

    public Auto(String marca, String modelo, double precio, int puertas) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        Locale locale = new Locale("es", "AR");
        NumberFormat fmt = NumberFormat.getCurrencyInstance(locale);
        String precioFormatter = (fmt.format(this.getPrecio()));
        return "Marca: " + this.getMarca() + " // Modelo: " + this.getModelo() + " // Puertas: " + this.getPuertas() + " // " + precioFormatter.replaceAll(" ", "");
    }
}
