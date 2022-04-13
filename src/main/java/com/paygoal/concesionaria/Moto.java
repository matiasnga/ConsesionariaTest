package com.paygoal.concesionaria;

import java.text.NumberFormat;
import java.util.Locale;

public class Moto extends Vehiculo {

    private int cilindrada;

    public Moto(String marca, String modelo, double precio, int cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        Locale locale = new Locale("es", "AR");
        NumberFormat fmt = NumberFormat.getCurrencyInstance(locale);
        String precioToSend = (fmt.format(this.getPrecio()));
        return "Marca: " + this.getMarca() + " // Modelo: " + this.getModelo() + " // Cilindrada: " + this.getCilindrada() + "c" + " // " + precioToSend.replaceAll(" ", "");

    }

}
