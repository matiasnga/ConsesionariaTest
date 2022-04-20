package com.paygoal.concesionaria;


public class AutoElectrico extends Auto {

    private int voltaje;

    public AutoElectrico(String marca, String modelo, double precio, int puertas, int voltaje) {
        super(marca, modelo, precio, puertas);
        this.voltaje = voltaje;
    }

    public int getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }

    @Override
    public boolean esDeLujo() {
        return true;
    }

    @Override
    public String toString() {
      
        return "Marca: " + this.getMarca() + " // Modelo: " + this.getModelo() + " // Puertas: " + this.getPuertas() + " // Voltaje: " + this.getVoltaje() + "v // " + this.precioFormateado();
    }

}
