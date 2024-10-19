package main.java.org.strategy.rutas;

import main.java.org.strategy.interfaces.RutaStrategy;

public class RutaMasCorta implements RutaStrategy {

    @Override
    public String calcularRuta(String puntoA, String puntoB) {

        return "Es la Ruta más corta entre " + puntoA + " y " + puntoB;

    }

}
