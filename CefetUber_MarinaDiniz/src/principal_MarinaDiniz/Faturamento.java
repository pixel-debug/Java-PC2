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
public class Faturamento {

    private Double valor;
    private Corrida[] corrida;

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Corrida[] getCorrida() {
        return corrida;
    }

    public Faturamento() {
        this.valor = valor;
        this.corrida = new Corrida[6];
    }

    public void setCorrida(Corrida[] corrida) {
        this.corrida = corrida;
    }

    public Double fatura(Veiculo veiculo, Corrida[] corrida) {
        Double valore = 0.0;
        for (int i = 0; i < corrida.length; i++) {
            if (veiculo.getPlaca().equals(corrida[i].getVeiculo().getPlaca())) {
                valore = valore + corrida[i].preco(veiculo, corrida[i].getDistancia());
            }
        }
        return valore / 2;
    }
}
