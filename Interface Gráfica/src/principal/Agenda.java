package principal;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import textFileApps.CreateTextFile;
import textFileApps.ReadTextFile;

public class Agenda {

    private ArrayList<Contato> agenda = new ArrayList<>();
    private ReadTextFile reader = new ReadTextFile();
    private CreateTextFile creator = new CreateTextFile();

    public Agenda() {
        this.agenda = agenda;
    }

    public ArrayList<Contato> getAgenda() {
        return agenda;
    }

    public void setAgenda(ArrayList<Contato> agenda) {
        this.agenda = agenda;
    }
    
    public boolean inserirContato(Contato contato) {
        agenda.add(contato);
       // System.out.println(agenda);
        return true;
    }

    public void gravar() {
        CreateTextFile.openFile();
        creator.writeFile(agenda);
    }

    public Contato pesquisar(String nome) {
        int sz = agenda.size();
        try {
            reader.read();
        } catch (NullPointerException e) {
            System.out.println("De alguma sua agenda está vazia");
        }
        Contato contato = new Contato();
        for (int i = 0; i < sz; i++) {
            Contato aux = agenda.get(i);
            if (aux.getNome().equals(nome)) {
                contato = aux;
            }
        }
        return contato;
    }

}
