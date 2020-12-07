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
public abstract class Empregado implements Pagavel {
    protected String nome;
    protected String sobrenome;
    protected int numIdent;

    public Empregado(String nome, String sobrenome, int numdent) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numIdent = numIdent;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getNumIdent() {
        return numIdent;
    }

    public void setNumIdent(int numIdent) {
        this.numIdent = numIdent;
    }
    
    
}
