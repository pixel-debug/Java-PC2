/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal_MarinaDiniz;

/**
 *
 * @author usuario
 */
public class Uber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // CLIENTES x3
        Cliente cliente1 = new Cliente("Antônio Amaral");
        Cliente cliente2 = new Cliente("Jaqueline Clossó");
        Cliente cliente3 = new Cliente("Kister the Kid");

        //VEÍCULOS x2       
        Veiculo veiculo1 = new Veiculo("luxo", "YET54");
        veiculo1.precos(veiculo1);
        Veiculo veiculo2 = new Veiculo("fiat", "YET54");
        veiculo2.precos(veiculo2);
        /*if(veiculo.verificaPlaca(veiculo2)){
            System.out.println("veiculos iguais");
            
        }
        else{
            System.out.println("veículo liberado para corrida");
        }
        
         */
        //CORRIDAS x3 para veiculo1
        Corrida[] corrida = new Corrida[6];
        corrida[0] = new Corrida(veiculo1, cliente1, 15);
        corrida[1] = new Corrida(veiculo1, cliente2, 10);
        corrida[2] = new Corrida(veiculo1, cliente3, 30);
        //CORRIDAS x3 para veiculo2
        corrida[3] = new Corrida(veiculo2, cliente1, 15);
        corrida[4] = new Corrida(veiculo2, cliente2, 10);
        corrida[5] = new Corrida(veiculo2, cliente3, 30);
        //Faturamento para veiculo1

        Faturamento fatura = new Faturamento();
        Double pre_veiculo1 = fatura.fatura(veiculo1, corrida);
        Double pre_veiculo2 = fatura.fatura(veiculo2, corrida);

        System.out.println("Faturamento para veículo 1: " + pre_veiculo1 + "\nFaturamento Motorista: "
                + pre_veiculo1 * 0.70 + "\nFaturamento Instituição: " + pre_veiculo1 * 0.30);
        System.out.println("");
        System.out.println("Faturamento para veículo 2: " + pre_veiculo2 + "\nFaturamento Motorista: "
                + pre_veiculo2 * 0.70 + "\nFaturamento Instituição: " + pre_veiculo2 * 0.30);
    }

}
