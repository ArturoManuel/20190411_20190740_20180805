package com.example.zombies.Bean;

public class BSupervivientes extends BHumanos{

    private int peso;
    private int fuerza;

    public BSupervivientes(int numero_identificación, String nombre, String apellido, String sexo, String estado, int peso, int fuerza) {
        super(numero_identificación, nombre, apellido, sexo, estado);
        this.peso = peso;
        this.fuerza = fuerza;
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
}
