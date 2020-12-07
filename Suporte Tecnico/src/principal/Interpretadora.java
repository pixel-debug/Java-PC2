/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.HashSet;
import java.util.StringTokenizer;

/**
 *
 * @author usuario
 */
public class Interpretadora {

    private HashSet<String> palavraChave;

    public Interpretadora() {
        this.palavraChave = new HashSet<>();
    }

    public HashSet<String> getPalavraChave() {
        return palavraChave;
    }

    public void setPalavraChave(HashSet<String> palavraChave) {
        this.palavraChave = palavraChave;
    }

    public void interpretar(String problema) {
        StringTokenizer token = new StringTokenizer(problema.toLowerCase(), " ");
        //HashSet lista = new HashSet<>();
        while(token.hasMoreElements()){
            palavraChave.add(token.nextToken(" ,.;:!? "));
        }

    }
}
