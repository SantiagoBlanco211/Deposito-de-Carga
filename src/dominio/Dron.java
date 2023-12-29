//Santiago Blanco(282654) y Federico de Alava(288858) - M2B
package dominio;
import java.io.*;
import java.util.*;

public class Dron implements Serializable{
    private String identificacion; //unico
    private String modelo;
    private int camara;
    private ArrayList<Vuelo> vuelos;
    public String getIdentificacion(){
        return identificacion;
    }
    public void setIdentificacion(String unaIdentificacion){
        identificacion = unaIdentificacion;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String unModelo){
        modelo = unModelo;
    }
    public int getCamara(){
        return camara;
    }
    public void setCamara(int unaCamara){
        camara = unaCamara;
    }
    public ArrayList<Vuelo> getVuelos(){
        return vuelos;
    }
    public void setVuelos(Vuelo unVuelo){
        vuelos.add(unVuelo);
    }
    public Dron(String unaIdentidicacion,String unModelo,int unaCamara){
        this.identificacion = unaIdentidicacion;
        this.modelo = unModelo;
        this.camara = unaCamara;
        this.vuelos = new ArrayList<Vuelo>();
    }
    @Override
    public String toString(){
        return this.identificacion;
    }
    @Override
    public boolean equals(Object o){
        return this.identificacion.equalsIgnoreCase(((Dron)o).getIdentificacion());
    }
}
