package com.example.zombies.Bean;

public class BObjetos {
    private int id_objeto;
    private String nombre;
    private int cantidad;
    private int peso;
    private String tipo;

    public BObjetos(String nombre, int cantidad, int peso, String tipo) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.peso = peso;
        this.tipo = tipo;
    }

    public int getId_objeto() {
        return id_objeto;
    }

    public void setId_objeto(int id_objeto) {
        this.id_objeto = id_objeto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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
