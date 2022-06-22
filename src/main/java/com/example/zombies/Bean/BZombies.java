package com.example.zombies.Bean;

public class BZombies {
    private BHumanos humanos;
    private int tiempo_infectados;
    private BVariante variante_virus;
    private int victimas;
    private String tipo_zombie;


    public BZombies() {
    }

    public BZombies(BHumanos humanos, int tiempo_infectados, BVariante variante_virus, int victimas, String tipo_zombie) {
        this.humanos = humanos;
        this.tiempo_infectados = tiempo_infectados;
        this.variante_virus = variante_virus;
        this.victimas = victimas;
        this.tipo_zombie = tipo_zombie;
    }

    public BHumanos getHumanos() {
        return humanos;
    }

    public void setHumanos(BHumanos humanos) {
        this.humanos = humanos;
    }

    public int getTiempo_infectados() {
        return tiempo_infectados;
    }

    public void setTiempo_infectados(int tiempo_infectados) {
        this.tiempo_infectados = tiempo_infectados;
    }

    public BVariante getVariante_virus() {
        return variante_virus;
    }

    public void setVariante_virus(BVariante variante_virus) {
        this.variante_virus = variante_virus;
    }

    public int getVictimas() {
        return victimas;
    }

    public void setVictimas(int victimas) {
        this.victimas = victimas;
    }

    public String getTipo_zombie() {
        return tipo_zombie;
    }

    public void setTipo_zombie(String tipo_zombie) {
        this.tipo_zombie = tipo_zombie;
    }
}



