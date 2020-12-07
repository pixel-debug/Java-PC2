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
public class Assalariado extends Empregado {
    private int horas;
    private Double valorAPagar;
    
    public Assalariado(String nome, String sobrenome, int numIdent, int horas){
       super(nome, sobrenome, numIdent);
       this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    public Double getValorAPagar(){
        if(horas <= 40){
            valorAPagar = ControlePagamento.SALARIO;
        }
        else{
            valorAPagar = ControlePagamento.SALARIO + ControlePagamento.HORA * horas;
        }
     return valorAPagar;  
    }

    public void setValorAPagar(Double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }
   
}
