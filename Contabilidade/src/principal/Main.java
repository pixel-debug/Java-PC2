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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pagavel[] pagavel = new Pagavel[6];
        ControlePagamento controlePagamento = new ControlePagamento(pagavel);

        Titulo titulo = new Titulo(3, 4, 7, 5, 50.0);
        Concessionaria concessionaria = new Concessionaria(17, 8, 90.0);
        Assalariado assalariado = new Assalariado("Keiser", "Kid", 9432, 5);
        AssalariadoComissionado assalariadoComissionado = new AssalariadoComissionado(17, "Douglas", "Silva", 4321);
        Comissionado comissionado = new Comissionado(12, "Maria", "Rosa", 6532);
        Terceirizados terceirizados = new Terceirizados(3, "Paula", "Ricarda", 2312);

        controlePagamento.pagavel[0] = titulo;
        controlePagamento.pagavel[1] = concessionaria;
        controlePagamento.pagavel[2] = assalariado;
        controlePagamento.pagavel[3] = assalariadoComissionado;
        controlePagamento.pagavel[4] = comissionado;
        controlePagamento.pagavel[5] = terceirizados;

        System.out.println("Pagamentos realizados\n");

        for (Pagavel pagamentoAtual : pagavel) {

            System.out.println(" " + pagamentoAtual.getClass().getSimpleName()
                    + ": " + String.format("%.2f", pagamentoAtual.getValorAPagar()));
        }
        controlePagamento.despesasTotais(pagavel);

    }

}
