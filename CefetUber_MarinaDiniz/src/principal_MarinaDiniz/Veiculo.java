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
public class Veiculo {
    private String tipo;
    private String placa;
    private Double preco;
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Veiculo(String tipo, String placa) {
        this.tipo = tipo;
        this.placa = placa;
    }
    public boolean verificaPlaca(Veiculo veiculo){
        if(this.getTipo().equals(veiculo.getTipo())){
            if(this.getPlaca().equals(veiculo.getPlaca())){
                return true;
            }
        }
        return false;
    }
    public void precos(Veiculo veiculo){
        if(veiculo.getTipo().equals("luxo")){
            veiculo.setPreco(15.0);
        }
        else{
            veiculo.setPreco(7.0);
        }
    }
}
