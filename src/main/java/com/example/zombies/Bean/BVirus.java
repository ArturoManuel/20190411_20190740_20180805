package com.example.zombies.Bean;

public class BVirus {
    private int id_virus;
    private String nombre_virus;
    private BVariante variante;

    private int cantidad ;


    public BVirus() {
    }

    public BVirus(int id_virus, String nombre_virus, BVariante variante, int cantidad) {
        this.id_virus = id_virus;
        this.nombre_virus = nombre_virus;
        this.variante = variante;
        this.cantidad = cantidad;
    }

    public int getId_virus() {
        return id_virus;
    }

    public void setId_virus(int id_virus) {
        this.id_virus = id_virus;
    }

    public String getNombre_virus() {
        return nombre_virus;
    }

    public void setNombre_virus(String nombre_virus) {
        this.nombre_virus = nombre_virus;
    }

    public BVariante getVariante() {
        return variante;
    }

    public void setVariante(BVariante variante) {
        this.variante = variante;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
