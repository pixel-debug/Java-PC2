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
public class Concessionaria extends Conta {
    public Double valorAPagar;

    public Concessionaria(int dia, int mes, Double valor) {
        super(dia, mes, valor);
    }
    
    public Double getValorAPagar(){
        return valor;
    }
    public void setValorAPagar(Double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }
    
}
