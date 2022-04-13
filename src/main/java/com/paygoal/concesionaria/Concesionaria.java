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

        vehiculos.add(new Auto("Peugeot", "206", 200000.00, 4));
        vehiculos.add(new Moto("Honda", "Titan", 60000.00, 125));
        vehiculos.add(new Auto("Peugeot", "208", 250000.00, 5));
        vehiculos.add(new Moto("Yamaha", "YBR", 80500.50, 160));

        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println(vehiculos.get(i));
        }
        System.out.println("============================= ");

        Collections.sort(vehiculos, Comparator.comparing(Vehiculo::getPrecio));
        int masCaro = vehiculos.size() - 1;
        System.out.println("Vehículo más caro: " + vehiculos.get(masCaro).getMarca() + " " + vehiculos.get(masCaro).getModelo());

        System.out.println("Vehículo más barato: " + vehiculos.get(0).getMarca() + " " + vehiculos.get(0).getModelo());

        String toFilter = "Y";

        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getModelo().contains(toFilter)) {
                Locale locale = new Locale("es", "AR");
                NumberFormat fmt = NumberFormat.getCurrencyInstance(locale);
                String precioFormatter = (fmt.format(vehiculos.get(i).getPrecio()));
                System.out.println("Vehículo que contiene en el modelo la letra `" + toFilter + "´: " + vehiculos.get(i).getMarca() + " " + vehiculos.get(i).getModelo() + " " + precioFormatter.replaceAll(" ", ""));
            }
        }

        System.out.println("============================= ");
        Collections.reverse(vehiculos);
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println(vehiculos.get(i).getMarca() + " " + vehiculos.get(i).getModelo());
        }
         //crearAuto("Renault", "Clio", 180000.00, 5);
           //     System.out.println(crearAuto);

    }

    public int crearAuto(String marca, String modelo, double precio, int puertas) {
        vehiculos.add(new Auto(marca, modelo, precio, puertas));
        System.out.println(vehiculos);

        return 1;
    }
}
