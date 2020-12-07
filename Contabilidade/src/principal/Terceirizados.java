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
public class Terceirizados extends Empregado {
    private int hora;
    private Double valorAPagar;

    public Terceirizados(int hora, String nome, String sobrenome, int numIdent) {
        super(nome, sobrenome, numIdent);
        this.hora = hora;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    public Double getValorAPagar(){
        valorAPagar = ControlePagamento.HORA * hora;
        return valorAPagar;
    }
    public void setValorAPagar(Double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }
   
}
