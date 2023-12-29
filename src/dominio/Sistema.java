//Santiago Blanco(282654) y Federico de Alava(288858) - M2B
package dominio;
import java.util.*;
import java.io.*;

public class Sistema extends Observable implements Serializable{ // Observable - Actualizar y Serializable - Guardar
    private ArrayList<Articulo> listaArticulos;
    private ArrayList<Funcionario> listaFuncionarios;
    private ArrayList<Dron> listaDrones;
    private ArrayList<Carga[][]> listaCargas;
    public Sistema(){
        this.listaArticulos = new ArrayList<Articulo>();
        this.listaFuncionarios = new ArrayList<Funcionario>();
        this.listaDrones = new ArrayList<Dron>();
        this.listaCargas = new ArrayList<Carga[][]>();
    }
    public void agregarArticulo(Articulo a){
        listaArticulos.add(a);
        setChanged();
        notifyObservers();
    }
    public ArrayList<Articulo> getArticulos(){
        return this.listaArticulos;
    }
    public void agregarFuncionario(Funcionario f){
        listaFuncionarios.add(f);
        setChanged();
        notifyObservers();
    }
    public ArrayList<Funcionario> getFuncionarios(){
        return this.listaFuncionarios;
    }
    public void agregarDron(Dron d){
        listaDrones.add(d);
        setChanged();
        notifyObservers();
    }
    public ArrayList<Dron> getDrones(){
        return this.listaDrones;
    }
    public void agregarCarga(Carga[][] c){
        listaCargas.add(c);
    }
    public ArrayList<Carga[][]> getCargas(){
        return this.listaCargas;
    }
    public boolean numeroValido(String nro){
        return (nro != null && nro.matches("[0-9]+"));
    }
    public boolean camaraValida(int unaCamara){
        boolean devuelve = false;
        if(unaCamara>=1 && unaCamara<=6){
            devuelve = true;
        }
        return devuelve;
    }
    public void crearEspacios(){
        Carga[][] A = new Carga[12][10];
        agregarCarga(A);
        Carga[][] B = new Carga[12][10];
        agregarCarga(B);
        Carga[][] C = new Carga[12][10];
        agregarCarga(C);
        Carga[][] D = new Carga[12][10];
        agregarCarga(D);
        Carga[][] E = new Carga[12][10];
        agregarCarga(E);    
    }
    public boolean codigoUnico(String unCodigo){
        boolean devuelve = true;
        for (int i = 0; i < 4; i++) {
            Carga[][] unaCarga = getCargas().get(i);
            for (int j = 0; j < 12; j++) {
                for (int k = 0; k < 10; k++) {
                    if(unaCarga[j][k]!=null){
                        if(unaCarga[j][k].getCodigo().equals(unCodigo)){
                            devuelve = false;
                        }
                    }
                }               
            }           
        }
        return devuelve;
    }
    public void notificarVuelo(Dron d, Vuelo v){
        //entra aca para que cada vez que se crea un vuelo se actualize en el momento
        d.setVuelos(v);
        setChanged();
        notifyObservers();
    }
    public Dron buscarDron(String unDron){ // busca dron por identificacion que es unica
        Dron d = null;
        for (int i = 0; i < getDrones().size(); i++) {
            if(getDrones().get(i).getIdentificacion().equals(unDron)){
                d = getDrones().get(i);
            }
        }
        return d;
    }
}
