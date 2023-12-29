//Santiago Blanco(282654) y Federico de Alava(288858) - M2B
package interfaz;

import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class ArchivoLectura {
    private Scanner in;
    private String linea;
    private String nombre;
    public ArchivoLectura(String unNombre) {
        try {
            in = new Scanner(Paths.get(unNombre));
            String[] separador = unNombre.split("\\\\");
            nombre = separador[separador.length-1];
        }
        catch (IOException e) {
            System.err.println("Error ");
            System.exit(1);
        }
    }
    public boolean hayMasLineas() {
        boolean hay = false;
        linea = null;
        if (in.hasNext()){
            linea = in.nextLine();
            hay = true;
        }
        return hay;
    }
    public String linea() {
        // devuelve la última linea leida
        return linea;
    }
    public void cerrar() {
        in.close();
    }
    public String getNombre(){
        return nombre;
    }
}

