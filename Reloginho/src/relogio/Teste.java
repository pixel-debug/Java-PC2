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
public class Teste {
     public static void main(String[] args){
         Relogio R = new Relogio();
         if(R.getFormato()==true){
            for(int i = 0; i < 86400; i++){
                 Relogio.TicTac(R);
                 Relogio.MostrarHora(R, 0);
            }
         }
         else{
             for(int i = 0; i < 86400; i++){
                 Relogio.TicTac(R);
                 Relogio.MostrarHora(R, i);
             }
         }
     }
}
