package com.example.zombies.Bean;

public class BHumanos {
    private  long numero_identificación;
    private String nombre;
    private String apellido;
    private String sexo;
    private String estado;


    public BHumanos() {
    }

    public BHumanos(long numero_identificación, String nombre, String apellido, String sexo, String estado) {
        this.numero_identificación = numero_identificación;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.estado = estado;
    }

    public long getNumero_identificación() {
        return numero_identificación;
    }

    public void setNumero_identificación(long numero_identificación) {
        this.numero_identificación = numero_identificación;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
