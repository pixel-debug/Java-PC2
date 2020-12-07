/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enquete;

import java.util.Random;
/**
 *
 * Marina Bernades Diniz
 */
public class teste {
    public static void main(String[] args){
        ENQUETE nota = new ENQUETE();
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            nota.setNota(random.nextInt(10)+1);
            ENQUETE.Soma(nota);
            ENQUETE.Frequencia(nota);
            ENQUETE.Clientes(nota);
        }
        ENQUETE.Media(nota);
        ENQUETE.Imprimir(nota);
    }
}
