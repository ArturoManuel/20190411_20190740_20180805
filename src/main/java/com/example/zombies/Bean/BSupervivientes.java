package com.example.zombies.Bean;

public class BSupervivientes {

    private int peso;
    private int fuerza;

    private  BHumanos humanos;
    private BHumanos pareja ;


    public BSupervivientes(int peso, int fuerza, BHumanos humanos, BHumanos pareja) {
        this.peso = peso;
        this.fuerza = fuerza;
        this.humanos = humanos;
        this.pareja = pareja;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public BHumanos getHumanos() {
        return humanos;
    }

    public void setHumanos(BHumanos humanos) {
        this.humanos = humanos;
    }

    public BHumanos getPareja() {
        return pareja;
    }

    public void setPareja(BHumanos pareja) {
        this.pareja = pareja;
    }
}
