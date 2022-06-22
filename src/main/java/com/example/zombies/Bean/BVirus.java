package com.example.zombies.Bean;

public class BVirus {
    private int id_virus;
    private String nombre_virus;


    public BVirus() {
    }

    public BVirus(int id_virus, String nombre_virus) {
        this.id_virus = id_virus;
        this.nombre_virus = nombre_virus;
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
}
