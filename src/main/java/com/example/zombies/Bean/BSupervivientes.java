package com.example.zombies.Bean;

public class BSupervivientes {

    private double peso;
    private int fuerza;

    private  BHumanos humanos;
    private BHumanos pareja ;

    private double peso_cargado;


    public BSupervivientes() {
    }

    public BSupervivientes(double peso, int fuerza, BHumanos humanos, BHumanos pareja, double peso_cargado) {
        this.peso = peso;
        this.fuerza = fuerza;
        this.humanos = humanos;
        this.pareja = pareja;
        this.peso_cargado = peso_cargado;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
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

    public double getPeso_cargado() {
        return peso_cargado;
    }

    public void setPeso_cargado(double peso_cargado) {
        this.peso_cargado = peso_cargado;
    }
}
