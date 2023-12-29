//Santiago Blanco(282654) y Federico de Alava(288858) - M2B
package dominio;
import java.io.*;

public class Funcionario implements Serializable{
    private String nombre;
    private int edad;
    private int numero; //unico
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int unaEdad){
        edad = unaEdad;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int unNumero){
        numero = unNumero;
    }
    public Funcionario(String unNombre,int unaEdad,int unNumero){
        this.nombre = unNombre;
        this.edad = unaEdad;
        this.numero = unNumero;
    }
    @Override
    public String toString(){
        return this.nombre;
    }
    @Override
    public boolean equals(Object o){
        return this.numero==((Funcionario)o).getNumero();
    }
}
