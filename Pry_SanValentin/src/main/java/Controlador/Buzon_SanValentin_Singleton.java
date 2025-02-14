package Controlador;

import Modelo.Contenido;
import java.awt.List;
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
     public void borrar(int p){
            mensajes.remove(p);
    }
     
     public void editar(int i, String R, String d, String C){
         Contenido C1 = new Contenido(R, d, C);
         mensajes.set(i, C1);
     }
     
     public String obtener(int p){
         String R = mensajes.get(p).remitario;
         String D = mensajes.get(p).destinario;
         String C = mensajes.get(p).contenido;
         return  R+D+C;
    }
}
