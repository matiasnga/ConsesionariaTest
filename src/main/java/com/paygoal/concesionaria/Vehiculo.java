package com.paygoal.concesionaria;

import java.text.NumberFormat;
import java.util.Locale;

abstract class Vehiculo {

    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean esDeLujo() {
        return false;
    }

    public String precioFormateado() {
        Locale locale = new Locale("es", "AR");
        NumberFormat formatPrecio = NumberFormat.getCurrencyInstance(locale);
        String precioToSend = (formatPrecio.format(this.getPrecio()));
        return precioToSend.replaceAll(" ", "");
    }
     
   
}
