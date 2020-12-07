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
public class Titulo extends Conta{
    private int diaPgo;
    private int mesPgo;
    private Double valorAPagar;
    private int pgo;
    public Titulo(int dia, int mes, int diaPgo, int mesPgo, Double valor) {
        super(dia, mes, valor);
        this.diaPgo = diaPgo;
        this.mesPgo = mesPgo;
    }
    
    public int getDiaPgo() {
        return diaPgo;
    }

    public void setDiaPgo(int diaPgo) {
        this.diaPgo = diaPgo;
    }

    public int getMesPgo() {
        return mesPgo;
    }

    public void setMesPgo(int mesPgo) {
        this.mesPgo = mesPgo;
    }
    
    public Double getValorAPagar(){
        if(mesPgo == mes){
            pgo = diaPgo - dia;
        }
        else{
           pgo = (30 - diaPgo) + dia; 
        }
        valorAPagar = valor + 0.10 * pgo ;
        return valorAPagar;
    }

    public void setValorAPagar(Double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }
    
    
}
