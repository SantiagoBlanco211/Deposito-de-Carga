//Santiago Blanco(282654) y Federico de Alava(288858) - M2B
package dominio;
import java.io.*;

public class Vuelo implements Serializable{
    private String nombreArchivo;
    private String area;
    private String exitoso;
    private int fila;
    private int lineas;
    private int coincidencias;
    private int diferencias;
    public String getNombreArchivo(){
        return nombreArchivo;
    }
    public void setNombreArchivo(String unNombre){
        nombreArchivo = unNombre;
    }
    public String getArea(){
        return area;
    }
    public void setArea(String unArea){
        area = unArea;
    }
    public String getExistoso(){
        return exitoso;
    }
    public void setExitoso(String esExitoso){
        exitoso = esExitoso;
    }
    public int getFila(){
        return fila;
    }
    public void setFila(int unaFila){
        fila = unaFila;
    }
    public int getLineas(){
        return lineas;
    }
    public void setLineas(int unaLinea){
        lineas = unaLinea;
    }
    public int getCoincidencias(){
        return coincidencias;
    }
    public void setCoincidencias(int unaCoincidencias){
        coincidencias = unaCoincidencias;
    }
    public int getDiferencias(){
        return diferencias;
    }
    public void setDiferencias(int unadiferencia){
        diferencias = unadiferencia;
    }
    public Vuelo(String unNombreArchivo, String unArea, String esExitoso, int unaFila, int unaLinea, int unaCoincidencia, int unaDiferencia){
        this.nombreArchivo = unNombreArchivo;
        this.area = unArea;
        this.exitoso = esExitoso;
        this.fila = unaFila;
        this.lineas = unaLinea;
        this.coincidencias = unaCoincidencia;
        this.diferencias = unaDiferencia;
    }
    public String toStringExitoso(){
        return this.getNombreArchivo()+", Area: "+this.getArea()+", Fila: "+this.getFila()+", Coincidencias: "+this.getCoincidencias()+", Diferencias: "+this.getDiferencias();
    }
    public String toStringNoExitoso(){
        return this.getNombreArchivo()+", Area: "+this.getArea()+", Fila: "+this.getFila()+", Cant. Lineas: "+this.getLineas();
    }
}
