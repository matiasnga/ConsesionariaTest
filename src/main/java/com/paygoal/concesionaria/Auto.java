package com.paygoal.concesionaria;


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
    public boolean esDeLujo() {
        return false;
    }

    @Override
    public String toString() {
       
        return "Marca: " + this.getMarca() + " // Modelo: " + this.getModelo() + " // Puertas: " + this.getPuertas() + " // " + this.precioFormateado();
    }
}
