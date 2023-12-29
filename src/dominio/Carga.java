//Santiago Blanco(282654) y Federico de Alava(288858) - M2B
package dominio;
import java.io.*;

public class Carga implements Serializable{
    private Funcionario funcionario;
    private Articulo articulo;
    private int unidades;
    private String codigo; //unico
    public Funcionario getFuncionario(){
        return funcionario;
    }
    public void setFuncionario(Funcionario unFuncionario){
        funcionario = unFuncionario;
    }
    public Articulo getArticulo(){
        return articulo;
    }
    public void setArticulo(Articulo unArticulo){
        articulo = unArticulo;
    }
    public int getUnidades(){
        return unidades;
    }
    public void setUnidades(int unaUnidad){
        unidades = unaUnidad;
    }
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String unCodigo){
        codigo = unCodigo;
    }
    public Carga(Funcionario unFuncionario, Articulo unArticulo, int unaUnidad, String unCodigo){
        this.funcionario = unFuncionario;
        this.articulo = unArticulo;
        this.unidades = unaUnidad;
        this.codigo = unCodigo;
    }
}
