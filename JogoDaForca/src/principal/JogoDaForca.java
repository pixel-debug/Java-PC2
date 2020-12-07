/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.security.SecureRandom;
import java.util.ArrayList;

import Arquivo.ReadMe;

/**
 *
 * @author usuario
 */
public class JogoDaForca {
    private String[] palavras;
    private String palavra;
    private int numTentantivas;
    private boolean venceu;
    private boolean acerto;
    private ArrayList<Integer> aux ;
    private SecureRandom randomico = new SecureRandom();

    public JogoDaForca(int numTentantivas) {
        this.numTentantivas = numTentantivas;
        this.aux =  new ArrayList<>();
        lerPalavras();
        sorteiaPalavras();
    }
    private void lerPalavras(){
        ReadMe.openFile("palavras.txt");
        palavras = ReadMe.read();
    }
    private void sorteiaPalavras(){
        palavra = palavras[randomico.nextInt(palavras.length)];
        System.out.println(palavra);
    }
    public boolean resultado(){   
        if(acerto == true && numTentantivas > 0){
            venceu = true;
        }
        if(acerto == false || numTentantivas < 0){
            venceu = false;
        }
        return venceu;
    }
    
    public ArrayList<Integer> verificaLetra(String letra){
        ArrayList<Integer> posicao = new ArrayList<>();
        int sz = palavra.length();
        if(palavra.contains(letra)){
            for(int i = 0; i < sz; i++){
                if(letra.charAt(0) == palavra.charAt(i)){
                    posicao.add(i);
                    aux.add(1);
               }
            }
        }
        else{
               jogadas();
        }
        if(aux.size() == sz){
                acerto = true;
            } 
        return posicao;
        
    }
    public void jogadas(){
        numTentantivas --;
    }

    public String[] getPalavras() {
        return palavras;
    }

    public void setPalavras(String[] palavras) {
        this.palavras = palavras;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public int getNumTentantivas() {
        return numTentantivas;
    }

    public void setNumTentantivas(int numTentantivas) {
        this.numTentantivas = numTentantivas;
    }

    public boolean isVenceu() {
        return venceu;
    }

    public void setVenceu(boolean venceu) {
        this.venceu = venceu;
    }

    public boolean isAcerto() {
        return acerto;
    }

    public void setAcerto(boolean acerto) {
        this.acerto = acerto;
    }
    
}
