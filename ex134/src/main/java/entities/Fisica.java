/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author davi nicollas
 */
public class Fisica extends Pessoa{
    private double gastoSaude;

    public Fisica() {
        super();
    }

    public Fisica(double gastoSaude, String nome, double rendaAnual) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }
    
    @Override
    public double impostoRenda() {
        double retorno;
        if(getRendaAnual()<20.000){
           retorno = (getRendaAnual()* 0.15) - (gastoSaude* 0.5);
        }else{
           retorno = (getRendaAnual()* 0.25) - (gastoSaude* 0.5);
        }
        return retorno;
    }
    
}
