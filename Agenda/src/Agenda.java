
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Agenda {
    private String dono;
    private ArrayList<Contato> contatos;

    public Agenda(String nome) {
        this.dono = nome;
        contatos = new ArrayList<>();
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
    
    
    public void setContato(Contato contato){
        contatos.add(contato);
    }
    
    private String getDados(Contato cont){
        return "Nome: "+cont.getNome()+"\nTelefone :"+cont.getTelefone()+"\nEndereço: "+cont.getEndereco()+"\nEmail: "+cont.getEmail()+"\n\n";
    }
    
    public String getContato(int numero){
        String num = Integer.toString(numero);
        String retorno = "";
        
        for(Contato aux: contatos){
            if(aux.getTelefone().startsWith(num)){
                retorno+= getDados(aux);
            }
        }
        if(retorno.equals("")){
            return null;
        }
        return retorno;
    }
    
    public ArrayList<Contato> getContatos(){
        return contatos;
    }
    
    public String getListaContatos(){
        String retorno = "";
        for(Contato aux: contatos){
            retorno += getDados(aux);
        }
        return retorno;
    }
    
    public String getContato(String nome){
        String retorno = "";
        
        for (Contato aux: contatos){
            if(aux.getNome().equalsIgnoreCase(nome)){
                retorno+= getDados(aux);
            }
        }
        if(retorno.equals("")){
            return null;
        }
        return retorno;
    }
    
}
