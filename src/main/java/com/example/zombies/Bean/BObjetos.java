package com.example.zombies.Bean;

public class BObjetos {
    private String nombre;
    private int peso;
    private String tipo;

    public BObjetos(String nombre, int peso, String tipo) {
        this.nombre = nombre;
        this.peso = peso;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
