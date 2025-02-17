package Controlador;

import Modelo.Contenido;
import java.util.ArrayList;

public class Buzon_SanValentin_Singleton {
    private static Buzon_SanValentin_Singleton instancia;
    
    private ArrayList<Contenido> mensajes;
    
    private Buzon_SanValentin_Singleton(){
        mensajes = new ArrayList<>();
    }
    public static Buzon_SanValentin_Singleton getInstancia(){
        if (instancia ==null){
            instancia = new Buzon_SanValentin_Singleton();
        }
        return instancia;
    }
    
    public void agregar(String r,String d,String c){
        mensajes.add(new Contenido(r, d, c));
    }
    
    public  ArrayList<Contenido> ObtenerMensajes(){
        return mensajes;
    }
     public void borrar(int carta){
        mensajes.remove(carta);
    }
     
     public void editar( String Remitente, String Destinario, String Contenido){
        Contenido C1 = new Contenido(Remitente, Destinario, Contenido);
        mensajes.set(0, C1);
     }
     
}
