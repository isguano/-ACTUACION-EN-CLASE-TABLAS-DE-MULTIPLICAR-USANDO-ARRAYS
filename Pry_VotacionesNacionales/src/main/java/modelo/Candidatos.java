// Paquete modelo
package modelo;

public class Candidatos {
    private String nombres;
    private String apellidos;
    private String partido;

    public Candidatos(String nombres, String apellidos, String partido) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.partido = partido;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }
}



