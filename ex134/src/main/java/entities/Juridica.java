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
public class Juridica extends Pessoa{
    private int numberFunctionary;
    
    public Juridica(){
        super();
    }

    public Juridica(int numberFunctionary, String nome, double rendaAnual) {
        super(nome, rendaAnual);
        this.numberFunctionary = numberFunctionary;
    }

    public int getNumberFunctionary() {
        return numberFunctionary;
    }

    public void setNumberFunctionary(int numberFunctionary) {
        this.numberFunctionary = numberFunctionary;
    }
    

    @Override
    public double impostoRenda() {
        double retorno;
        if(numberFunctionary > 10){
            retorno = getRendaAnual()*0.14;
        }
        else{
             retorno = getRendaAnual()*0.16;
        }
        return retorno;
    }
    
}
