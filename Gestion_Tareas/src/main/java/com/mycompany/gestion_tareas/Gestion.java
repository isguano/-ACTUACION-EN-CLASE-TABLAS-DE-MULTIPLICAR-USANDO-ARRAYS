package com.mycompany.gestion_tareas;

public class Gestion {
    public String nombre;
    public int prioridad;
    public boolean completada;

    public Gestion(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.completada = false;
    }
}


