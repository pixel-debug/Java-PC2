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
public class Corrida {

    private double valor;
    private Veiculo veiculo;
    private int distancia;
    private Cliente cliente;

    public Corrida(Veiculo veiculo, Cliente cliente, int distancia) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.distancia = distancia;

    }

    public Corrida() {
        

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double preco(Veiculo veiculo, int distancia) {
        if (veiculo.getPlaca().equals(getVeiculo().getPlaca())) {
            valor = veiculo.getPreco() * distancia;
            return valor;
        }
        valor = veiculo.getPreco() * distancia;
        return valor;
    }
}
