package com.paygoal.concesionaria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.List;
import java.util.stream.Collectors;

public class Concesionaria {

    static List<Vehiculo> vehiculos = new ArrayList();

    public static void run() {
        crearVehiculos();
        listarVehiculos();
        System.out.println("============================= ");
        vehiculoMasCaro();
        vehiculoMasBarato();
        filtrarVehiculoPorModelo("Y");
        System.out.println("============================= ");
        precioMayorAMenor();
        System.out.println("============================= ");
        listarVehiculosDeLujo();
    }

    private static void crearVehiculos() {
        vehiculos.add(new Auto("Peugeot", "206", 200000.00, 4));
        vehiculos.add(new Moto("Honda", "Titan", 60000.00, 125));
        vehiculos.add(new Auto("Peugeot", "208", 250000.00, 5));
        vehiculos.add(new Moto("Yamaha", "YBR", 80500.50, 160));
        vehiculos.add(new AutoElectrico("Tesla", "S", 500000, 4, 160));

    }

    private static void listarVehiculos() {
        vehiculos.forEach(v -> {
            System.out.println(v);
        });

    }

    private static void vehiculoMasCaro() {
        vehiculos.stream()
                //                .reduce((p1, p2) -> p1.getPrecio() > p2.getPrecio() ? p1 : p2)
                .max(Comparator.comparing(Vehiculo::getPrecio))
                .ifPresent(v -> System.out.println("Vehículo más caro: " + v.getMarca() + " " + v.getModelo()));
    }

    private static void vehiculoMasBarato() {
        vehiculos.stream()
                 .min(Comparator.comparing(Vehiculo::getPrecio))
                 .ifPresent(v -> System.out.println("Vehículo más barato: " + v.getMarca() + " " + v.getModelo()));
    }

    private static void filtrarVehiculoPorModelo(String toFilter) {
        System.out.print("Vehículo que contiene en el modelo la letra `" + toFilter + "´: ");
        vehiculos.stream()
                .filter(f -> f.getModelo().contains(toFilter))
                .forEach(v -> {
                    System.out.println(v);
                });
    }

    private static void precioMayorAMenor() {
        System.out.println("Vehículos ordenados por precio de mayor a menor: ");
        List<Vehiculo> listaOrdenada = vehiculos.stream().sorted(Comparator.comparingDouble(Vehiculo::getPrecio))
                .collect(Collectors.toList());
        Collections.reverse(listaOrdenada);
        listaOrdenada.forEach(v -> {
            System.out.println(v);
        });

    }

    private static void listarVehiculosDeLujo() {
        System.out.println("Vehículos de lujo: ");

        vehiculos.forEach(v -> {
            if (v.esDeLujo()) {
                System.out.println(v);
            }
        });

    }

}
