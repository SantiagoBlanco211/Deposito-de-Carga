//Santiago Blanco(282654) y Federico de Alava(288858) - M2B
package prueba;
import interfaz.*;
import dominio.*;
import java.io.*;

public class Obligatorio2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Sistema s = new Sistema();
        s.crearEspacios(); // crea los espacios del inventario
        // abre el archivo guardado
        try {
        FileInputStream arch = new FileInputStream("Datos");
        ObjectInputStream leer = new ObjectInputStream(arch);
        s = (Sistema)leer.readObject();
        leer.close();
        }
        catch(IOException e){
            System.out.println("No pude leer "+e.getMessage());
        }
        //hasta aca
        VentanaMenu vMenu = new VentanaMenu(s);
        vMenu.setVisible(true);
    }   
}
