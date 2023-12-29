//Santiago Blanco(282654) y Federico de Alava(288858) - M2B
package dominio;
import java.io.*;

public class Articulo implements Serializable{
    private String nombre; //unico
    private String descripcion;
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String unaDescripcion){
        descripcion = unaDescripcion;
    }
    public Articulo(String unNombre,String unaDescripcion){
        this.nombre = unNombre;
        this.descripcion = unaDescripcion;
    }
    @Override
    public String toString(){
        return this.nombre;
    }
    @Override
    public boolean equals(Object o){
        return this.nombre.equalsIgnoreCase(((Articulo)o).getNombre());
    }
}
