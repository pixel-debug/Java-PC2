package textFileApps;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.FormatterClosedException;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import principal.Contato;

public class CreateTextFile {

    public static void openFile() {
        try {
//constructor of file class having file as argument  
            File file = new File("agendaPessoal.txt");
            if (!Desktop.isDesktopSupported())//vê se o Desktop é suportado pela platforma ou naõ  
            {
                System.err.println("Não suportado");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if (file.exists()) //olha se ele existe ou não  
            {
                //desktop.open(file);
                System.out.println("Arquivo já existente, abrindo...");// ele abre o arquivo 
            }
            System.out.println("Arquivo criado com sucesso !");
        } catch (Exception e) {
            System.err.println("Algo deu errado.");
        }
    }

    public static void writeFile(ArrayList<Contato> contato) {
        FileWriter fw = null;
        PrintWriter output = null;
        try {
            fw = new FileWriter("agendaPessoal.txt");
            output = new PrintWriter(fw);

        } catch (Exception e) {
            System.out.println("Algo de ruim aconteceu ! ");
        }
        int sz = contato.size();
        for (int i = 0; i < sz; i++) {
            try {
                output.printf("%s; %s; %s; %s\n", contato.get(i).getNome(), contato.get(i).getTelefone(),
                         contato.get(i).getEmail(), contato.get(i).getEndereco());
            } catch (FormatterClosedException f) {
                System.err.println("Erro ao escrever no arquivo, encerrando a construção!");
                System.exit(1);
            }
            output.close();

        }
    }
}
