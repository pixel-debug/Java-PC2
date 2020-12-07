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
public class ControlePagamento {
    public Pagavel[] pagavel;
    public static Double SALARIO = 954.00;
    public static Double HORA = 8.0;

    public ControlePagamento(Pagavel[] pagavel) {
        this.pagavel = pagavel;
    }

    public Pagavel[] getPagavel() {
        return pagavel;
    }

    public void setPagavel(Pagavel[] pagavel) {
        this.pagavel = pagavel;
    }
   
  
    
    public void despesasTotais(Pagavel[] pagavel){
        Double despesas = 0.0;
        for(int i = 0; i < pagavel.length;i++){
            despesas = despesas + this.pagavel[i].getValorAPagar();
        }
       
        System.out.println("Despesas totais da empresa: " + String.format("%.2f",despesas));
    }

    
    
}
