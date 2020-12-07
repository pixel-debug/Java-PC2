/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author usuario
 */
public class Comissionado extends Empregado {
    public Double valorAPagar;
    public int numVendas;

    public Comissionado(int numVendas, String nome, String sobrenome, int numIdent) {
        super(nome, sobrenome, numIdent);
        this.numVendas = numVendas;
    }
    

    public int getNumVendas() {
        return numVendas;
    }

    public void setNumVendas(int numVendas) {
        this.numVendas = numVendas;
    }
    
    public Double getValorAPagar(){
        valorAPagar = numVendas * 0.6 ;
        return valorAPagar;
    }
    public void setValorAPagar(Double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }
    
}
