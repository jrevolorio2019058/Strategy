package main.java.org.strategy.rutas;

import main.java.org.strategy.interfaces.RutaStrategy;

public class RutaMasEconomica implements RutaStrategy {

    @Override
    public String calcularRuta(String puntoA, String puntoB) {

        return "Es la ruta más economica entre " + puntoA + " y " + puntoB;

    }

}
