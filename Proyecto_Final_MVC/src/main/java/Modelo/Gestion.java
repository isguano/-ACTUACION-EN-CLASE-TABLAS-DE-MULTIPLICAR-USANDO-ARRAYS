package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Gestion {
    
    private List<Tareas> tareas;

    public Gestion() {
        tareas = new ArrayList<>();
    }

    public void agregarProducto(Tareas tarea1) {
        tareas.add(tarea1);
    }

    public List<Tareas> getProductos() {
        return tareas;
    }

}





