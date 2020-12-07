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
public class AssalariadoComissionado extends Empregado {
    public int numVendas;
    public Double valorAPagar;

    public AssalariadoComissionado(int numVendas, String nome, String sobrenome, int numIdent) {
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
        valorAPagar = ControlePagamento.SALARIO + numVendas * 0.6;
        return valorAPagar + valorAPagar*0.1;
    }
    public void setValorAPagar(Double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }
   
}
