/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author davi nicollas
 */
public class Triangulo {

    /*   public double largura;
    public double altura;
    
    public double area(){
        return largura*altura ;
    }
    
    public double perimetro(){
        return 2*(largura + altura);
    }
    
      public double Diagonal(){
        return Math.sqrt(largura*largura +  altura*altura);
    }
     */

 /*  public String name;
    public double salarioBruto;
    public double imposto;
    
    
    public double salarioLiquido(){
         return salarioBruto-imposto;
    }
     public void Aumentosalario(double percentual){
         salarioBruto += salarioBruto* percentual/100.0;
    }
     public String toString(){
         return name + ", $ " + String.format("%.2f", salarioLiquido());
     }
     */
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double validarAprevacao() {
        return nota1 + nota2 + nota3;
    }

    public double validarNota() {
        if (validarAprevacao() < 60) {
            return 60.0 - validarAprevacao();
        } else {
            return 0.0;
        }

    }
}
