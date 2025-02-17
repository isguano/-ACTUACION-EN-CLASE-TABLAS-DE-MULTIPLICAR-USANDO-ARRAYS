
package Modelo;

public class Contenido {
    public String remitario;
    public String destinario;
    public String contenido;

    public Contenido(String remitario, String destinario, String contenido) {
        this.remitario = remitario;
        this.destinario = destinario;
        this.contenido = contenido;
    }
    
    public String getObtenerMensaje(){
        //DE: Stiven Guano -> PARA: anonimo
        //MENSAJE: Feliz dia de la amistad 
        return"De:"+remitario+" -> Para: "+destinario+"\n "+" Mensaje:"+contenido;
    }
    
    public void setDestinario(String destinario) {
        this.destinario = destinario;
    }

    public void setRemitario(String remitario) {
        this.remitario = remitario;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getDestinario() {
        return destinario;
    }

    public String getRemitario() {
        return remitario;
    }

    public String getContenido() {
        return contenido;
    }
    
}
