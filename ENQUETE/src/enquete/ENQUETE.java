/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enquete;

/**
 *
 * Marina Bernardes Diniz
 */
public class ENQUETE {
    private int nota;
    private int soma;
    private int media;
    private int clientes;
    private int valores[] = new int[10];

    public ENQUETE(int nota){
        this.nota = nota;
    }
    public ENQUETE(){
        this.nota = 0;
        this.soma = 0;
        this.clientes = 0;
}
    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }
    public int getSoma() {
        return soma;
    }
    public void setSoma(int soma) {
        this.soma = soma;
    }
    public int getMedia() {
        return media;
    }
    public void setMedia(int media) {
        this.media = media;
    }
    public int getClientes() {
        return clientes;
    }
    public void setClientes(int clientes) {
        this.clientes = clientes;
    }
     public int[] getValores() {
        return valores;
    }
    public void setValores(int[] valores) {
        this.valores = valores;
    }
    
    public static void Soma(ENQUETE nota){
        int soma = nota.getNota() + nota.getSoma();
        nota.setSoma(soma);
        
    }
    public static void Media(ENQUETE nota){
        int media = nota.getSoma()/nota.getClientes();
        nota.setMedia(media);
        
    }
    public static void Clientes(ENQUETE nota){
        int clientes = nota.getClientes() + 1;
        nota.setClientes(clientes);
        
    }
    public static void Frequencia(ENQUETE nota){
        int[] freq;
        freq = nota.getValores();
        for(int i = 0; i < 10; i++){
            int j = i + 1;
             if(nota.getNota() == j){
                  freq[i] = freq[i]+1;
                     nota.setValores(freq);
             }
            
        }
        
        nota.setValores(freq);
        
    }
    public static void Imprimir(ENQUETE nota){
        for(int i = 0; i < 10; i++){
            int[] aux;
            aux = nota.getValores();
            System.out.println("Frequencia ["+(i+1)+"]: "+nota.getValores()[i]);
        }
        System.out.println("Média = "+nota.getMedia());
        System.out.println("Número de Clientes = "+nota.getClientes());
    }
    
}
