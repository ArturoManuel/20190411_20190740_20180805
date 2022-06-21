package com.example.zombies.Bean;

public class BVirus {
    private int id_virus;
    private String virus;
    private int variante;


    public BVirus(int id_virus, String virus, int variante) {
        this.id_virus = id_virus;
        this.virus = virus;
        this.variante = variante;
    }

    public int getId_virus() {
        return id_virus;
    }

    public void setId_virus(int id_virus) {
        this.id_virus = id_virus;
    }

    public String getVirus() {
        return virus;
    }

    public void setVirus(String virus) {
        this.virus = virus;
    }

    public int getVariante() {
        return variante;
    }

    public void setVariante(int variante) {
        this.variante = variante;
    }
}
