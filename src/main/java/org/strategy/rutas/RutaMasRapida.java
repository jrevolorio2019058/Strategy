package main.java.org.strategy.rutas;

import main.java.org.strategy.interfaces.RutaStrategy;

public class RutaMasRapida implements RutaStrategy {

    @Override
    public String calcularRuta(String puntoA, String puntoB){

        return "Es la Runta más rápida entre " + puntoA + " y " +  puntoB;

    }

}
