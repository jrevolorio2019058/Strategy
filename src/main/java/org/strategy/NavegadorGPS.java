package main.java.org.strategy;

import main.java.org.strategy.interfaces.RutaStrategy;

public class NavegadorGPS {

    private RutaStrategy strategy;

    public NavegadorGPS(RutaStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RutaStrategy strategy) {
        this.strategy = strategy;
    }

    public void calcularRuta(String puntoA, String puntoB) {
        System.out.println(strategy.calcularRuta(puntoA, puntoB));
    }

}
