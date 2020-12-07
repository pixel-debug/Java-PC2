
import java.util.Objects;
import java.util.Scanner;

/*:Miguel
aTIla;rua la;3224526;ajosnda
atila;rua si;1251636;ajosnda
ana;rua do;3221253;ajosnda
:Ana
aTIla;rua la;3224526;ajosnda
atila;rua si;1251636;ajosnda
miguel;rua re;1234645;ajosnda
:Atila
miguel;rua re;1234645;ajosnda
ana;rua do;3221253;ajosnda*/


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author italo
 */
public class Principal {
    public static Scanner sc = new Scanner(System.in);
    
    
    public static void interacaoAgenda(Agenda a, int acao){
        int aux;
        String auxStr,nome,endereco,telefone,email;
        switch(acao){
            case 1:
                System.out.println(a.getListaContatos());
                sc.nextLine();
                break;
            case 2:
                System.out.println("Digite o nome, o numero ou o inicio do numero do contato");
                sc.nextLine();
                auxStr = sc.nextLine();
                try{
                    aux = Integer.parseInt(auxStr);
                    auxStr = a.getContato(aux);
                    if(Objects.nonNull(auxStr)){
                        System.out.println(auxStr);
                    }
                    else
                        System.out.println("Contato inexistente");
                }
                catch(NumberFormatException ex){
                    auxStr = a.getContato(auxStr);    
                    if(Objects.nonNull(auxStr)){
                        System.out.println(auxStr);
                    }
                    else
                        System.out.println("Contato inexistente");
                }
                System.out.println();
                break;
            case 3:
                System.out.println("Digite o nome do contato novo");
                sc.nextLine();
                nome = sc.nextLine();
                System.out.println("Digite o endereço");
                endereco = sc.nextLine();
                System.out.println("Digite o telefone");
                telefone = sc.nextLine();
                System.out.println("Digite o email");
                email = sc.nextLine();
                
                a.getContatos().add(new Contato(nome,endereco,telefone,email));
                break;
            default:
                System.out.println("operação invalida");
                break;
        }
    }
    
    public static int mostrarAgendas(FileAgenda a){
        int tamanho = a.agendas.size();
        for(int i = 0;i< tamanho; i++){
            System.out.printf("[%d]%s ",i+1, a.agendas.get(i).getDono());
        }
        System.out.println();
        return sc.nextInt()-1;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here                
        FileAgenda a = new FileAgenda();        
        String aux;
        int agenda;                        
        
        while (true){                                    
            System.out.println("Escolha umas agenda");
            agenda = mostrarAgendas(a);
            
            System.out.println("Escolha uma ação");
            System.out.println("[1]Imprimir a lista de contatos\n[2]Buscar um contato\n[3]Add um contato");
            interacaoAgenda(a.agendas.get(agenda), sc.nextInt());
            
            System.out.println("Aperte Enter para acessar uma agenda ou digite 'Sair' para sair");
            
            aux = sc.nextLine();
            if(aux.equalsIgnoreCase("sair")){
                a.gravar();
                break;
            }
        }
    }
    
}
