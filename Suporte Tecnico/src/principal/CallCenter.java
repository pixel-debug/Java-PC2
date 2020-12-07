/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author usuario
 */
public class CallCenter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Suporte Técnico");
        System.out.println("Fale o que aflinge seu coraçãozinho");
        System.out.println("digite <sair> para sair");
        boolean controle = true;
        boolean aux = true;
        while (controle) {
            Scanner ler = new Scanner(System.in);
            String problema = ler.nextLine();

            if (problema.equals("sair")) {
                controle = false;
                break;
            }

            Interpretadora inter = new Interpretadora();
            SuporteTecnico suporte = new SuporteTecnico();
            inter.interpretar(problema);

            Random random = new Random();

            if (!suporte.verificaResposta(inter)) {
                System.out.println(suporte.getRespostaPadrao().get(random.nextInt(9) + 0));

            }

        }
    }

}
