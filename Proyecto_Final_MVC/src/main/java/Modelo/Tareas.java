package Modelo;

public class Tareas {
    public int Id;
    public String Nombre;
    public String Descripcion;
    public boolean Estado;

    public Tareas(int Id, String Nombre, String Descripcion, boolean Estado) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Estado = false;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
}
