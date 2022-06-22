package com.example.zombies.Bean;
public class BVariante {
    private int idVariante;
    private String nombre ;
    private BVirus virus;

    public BVariante(int idVariante) {
        this.idVariante = idVariante;
    }

    public BVariante(String nombre) {
        this.nombre = nombre;
    }

    public BVariante(int idVariante, String nombre, BVirus virus) {
        this.idVariante = idVariante;
        this.nombre = nombre;
        this.virus = virus;
    }

    public int getIdVariante() {
        return idVariante;
    }

    public void setIdVariante(int idVariante) {
        this.idVariante = idVariante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BVirus getVirus() {
        return virus;
    }

    public void setVirus(BVirus virus) {
        this.virus = virus;
    }
}
