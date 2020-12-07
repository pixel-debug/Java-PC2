/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relogio;

/**
 *
 * Marina Bernardes Diniz
 */
public class Relogio {
       private Contador minutos;
       private Contador horas;
       private Contador segundos;
       private boolean formato;
   
   public Relogio(){
       minutos = new Contador(0, 60);
       horas = new Contador(0, 24);
       segundos = new Contador(0, 60);
   }
   public Relogio(boolean formato){
       if(formato == true){
           this.horas.setValor(0);
           this.horas.setLimite(24);
           
           this.minutos.setValor(0);
           this.minutos.setLimite(60);
       }
    }
    public Contador getHoras() {
        return horas;
    }
    public void setHoras(Contador horas){
        this.horas = horas;
    }
    public Contador getMinutos() {
        return minutos;
    }
    public void setMinutos(Contador minutos){
        this.minutos = minutos;
    }
    public Contador getSegundos() {
        return segundos;
    }
    public void setSegundos(Contador segundos){
        this.segundos = segundos;
    }
    public boolean getFormato() {
        return formato;
    }
    public void setFormato(boolean horas){
        this.formato = formato;
    }
    
    
    
   public static void TicTac(Relogio relogio){
       relogio.segundos.Contar();
       if(relogio.segundos.getValor() == 0){
           relogio.minutos.Contar();
            if(relogio.minutos.getValor() == 0){
                relogio.horas.Contar();
       }
       }
   }
   public static String FormatarHora(int valor){
       if(valor >= 0 && valor <= 9){
           String novovalor = "0" + String.valueOf(valor);
           return novovalor;
       }
       return String.valueOf(valor);
   }
   public static void MostrarHora(Relogio relogio, int i){
       String hh = FormatarHora(relogio.horas.getValor());
       String mm = FormatarHora(relogio.minutos.getValor());
       String ss = FormatarHora(relogio.segundos.getValor());
       
       if(relogio.formato == true){
           System.out.println(hh+":"+mm+":"+ss);
       }
       else{
           if(i < 39600){
               System.out.println(hh+":"+mm+":"+ss+" a.m");
           }
           else{
               System.out.println(hh+":"+mm+":"+ss+" p.m");
           }
       }
   }
}
