package main.java.org.strategy;

import main.java.org.strategy.rutas.RutaMasCorta;
import main.java.org.strategy.rutas.RutaMasEconomica;
import main.java.org.strategy.rutas.RutaMasRapida;

public class Main {
    public static void main(String[] args) {

        NavegadorGPS gps = new NavegadorGPS(new RutaMasRapida());

        gps.calcularRuta("Punto A", "Punto B");

        gps.setStrategy(new RutaMasCorta());

        gps.calcularRuta("Punto A", "Punto B");

        gps.setStrategy(new RutaMasEconomica());

        gps.calcularRuta("Punto A", "Punto B");

    }
}