/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session8;

/**
 *
 * @author davi nicollas
 */
public class Triangulo {
   /* public double a;
    public double b;
    public double c;
    
    public double area(){
         double p = (a+b+c)/2.0;
         return Math.sqrt(p* (p-a)*(p-b)*(p-c));
    }
 */
    public String name;
    public double price;
    public int quantidade;
    
    public double valorTotal(){
        return price*quantidade;
    }
    public void addEstoque(int quantidade){
        this.quantidade += quantidade;
    }
    public void remEstoque(int quantidade){
        this.quantidade -= quantidade;
    }
    public String toString(){
        return name +
                ", $" 
                + String.format("%.2f", price) 
                + ", "
                +quantidade
                +" units, Total: $"
                + String.format("%.2f", valorTotal());
    }

}
