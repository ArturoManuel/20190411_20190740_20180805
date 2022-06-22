package com.example.zombies.Bean;

public class BZombies extends BHumanos{
    private String tiempo_infectados;
    private String variante_virus;
    private int victimas;
    private String tipo_zombie;


    public BZombies(long numero_identificación, String nombre, String apellido, String sexo, String estado, String tiempo_infectados, String variante_virus, int victimas, String tipo_zombie) {
        super(numero_identificación, nombre, apellido, sexo, estado);
        this.tiempo_infectados = tiempo_infectados;
        this.variante_virus = variante_virus;
        this.victimas = victimas;
        this.tipo_zombie = tipo_zombie;
    }

    public String getTiempo_infectados() {
        return tiempo_infectados;
    }

    public void setTiempo_infectados(String tiempo_infectados) {
        this.tiempo_infectados = tiempo_infectados;
    }

    public String getVariante_virus() {
        return variante_virus;
    }

    public void setVariante_virus(String variante_virus) {
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
