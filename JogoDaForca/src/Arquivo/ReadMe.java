/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arquivo;

import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.IOException;
/**
 *
 * @author usuario
 */
public class ReadMe {

    private static Scanner input;

    public static void openFile(String filename) {
        try {
            input = new Scanner(Paths.get(filename));
            
        }catch (IOException io) {
            System.err.println("Algo de muito errado aconteceu, pena ...");
            System.exit(1);
        }
    }

    public static String[] read() {
        String line;
        String[] out = null;
        try {
            while (input.hasNext()) {
                line = input.nextLine();
                out = line.split(" ");
            }
        } catch (NoSuchElementException e) {
            System.err.println("ARQUIVO MAL CONSTRUIDO!!");
        } catch (IllegalStateException s) {
            System.err.println("Erro lendo o arquivo.");
        }
        return out;
    }
    public static void close(){
        input.close();
    }
}
