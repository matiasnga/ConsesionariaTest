package com.paygoal.concesionaria;


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
    public boolean esDeLujo() {
        return this.getPrecio() > 70000;
    }

    @Override
    public String toString() {
        
        return "Marca: " + this.getMarca() + " // Modelo: " + this.getModelo() + " // Cilindrada: " + this.getCilindrada() + "c" + " // " + this.precioFormateado();

    }

}


