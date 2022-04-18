package com.paygoal.concesionaria;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Concesionaria {

    static List<Vehiculo> vehiculos = new ArrayList();

    public static void main(String[] args) {
        crearAutos();
        listarAutos();
        System.out.println("============================= ");
        masCaro();
        masBarato();
        filtrarVehiculo("Y");
        System.out.println("============================= ");
        precioMayorAMenor();
    }

    public static void crearAutos() {
        vehiculos.add(new Auto("Peugeot", "206", 200000.00, 4));
        vehiculos.add(new Moto("Honda", "Titan", 60000.00, 125));
        vehiculos.add(new Auto("Peugeot", "208", 250000.00, 5));
        vehiculos.add(new Moto("Yamaha", "YBR", 80500.50, 160));
    }

    public static void listarAutos() {
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println(vehiculos.get(i));
        }
    }

    public static void masCaro() {
        Collections.sort(vehiculos, Comparator.comparing(Vehiculo::getPrecio));
        int masCaro = vehiculos.size() - 1;
        System.out.println("Vehículo más caro: " + vehiculos.get(masCaro).getMarca() + " " + vehiculos.get(masCaro).getModelo());

    }

    public static void masBarato() {
        Collections.sort(vehiculos, Comparator.comparing(Vehiculo::getPrecio));
        System.out.println("Vehículo más barato: " + vehiculos.get(0).getMarca() + " " + vehiculos.get(0).getModelo());
    }

    public static void filtrarVehiculo(String toFilter) {
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getModelo().contains(toFilter)) {
                Locale locale = new Locale("es", "AR");
                NumberFormat fmt = NumberFormat.getCurrencyInstance(locale);
                String precioFormatter = (fmt.format(vehiculos.get(i).getPrecio()));
                System.out.println("Vehículo que contiene en el modelo la letra `" + toFilter + "´: " + vehiculos.get(i).getMarca() + " " + vehiculos.get(i).getModelo() + " " + precioFormatter.replaceAll(" ", ""));
            }
        }
    }

    public static void precioMayorAMenor() {
        Collections.sort(vehiculos, Comparator.comparing(Vehiculo::getPrecio));
        Collections.reverse(vehiculos);
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println(vehiculos.get(i).getMarca() + " " + vehiculos.get(i).getModelo());
        }

    }
}
