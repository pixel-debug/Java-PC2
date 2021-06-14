
import java.io.File;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class FileAgenda {
    public ArrayList<Agenda> agendas;
    private Scanner sc;
    
    
    public FileAgenda(){
        agendas = new ArrayList<>();
        abrirArquivo();
        lerArquivo();
    }
    
    
    private void abrirArquivo(){
        try{
            File dir1 = new File (".");
            sc = new Scanner(Paths.get(dir1.getCanonicalPath()+"/src/data.txt"));
        }
        catch(IOException ex){
            System.err.println("erro ao abrir o arquivo, processo terminado");
            System.exit(1);
        }
    }
    
    private void lerArquivo(){
        String linha;
        String[] itens; 
        int i = -1;
        try{
            while(sc.hasNext()){
                linha = sc.nextLine();
                if(linha.startsWith(":")){
                    agendas.add(new Agenda(linha.replace(":", "")));
                    i++;
                }
                else{
                    itens = linha.split(";");
                    agendas.get(i).setContato(new Contato(itens[0],itens[1],itens[2],itens[3]));
                }
            }
        }
        catch(NullPointerException es){
            System.err.println("pq??????");
        }
        catch(NoSuchElementException ex){
            System.err.println("Arquivo corrompido");
        }
        catch(IllegalStateException ex){
            System.err.println("erro");
        }
    }
    
    public void gravar(){
        Formatter output = null;
        try{ 
            File dir1 = new File (".");
            output = new Formatter(dir1.getCanonicalPath()+"/src/data.txt");
        }
        catch(SecurityException ex){
            System.err.println("Acesso negado");
            System.exit(1);
        }
        catch(IOException ex){
            System.err.println("Erro ao abrir o arquivo");
            System.exit(1);
        }
        
        for(Agenda aux: agendas){
            try{
                output.format(":%s\n",aux.getDono());
                for(Contato contato: aux.getContatos()){
                    output.format("%s;%s;%s;%s\n",contato.getNome(),contato.getEndereco(), contato.getTelefone(),contato.getEmail());
                }
                
            }
            catch(FormatterClosedException ex){
                System.err.println("erro ao escrever");
                break;
            }
            catch(NullPointerException ex){
                System.err.println("erro ao escrever");
                
            }
        }
        output.close();
    }
}
