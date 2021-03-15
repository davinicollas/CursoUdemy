/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject5;

/**
 *
 * @author davi nicollas
 */
/*public class product{
   public String name;
    public double price;
    public int quantidade;
    
    public product(String name , double price, int quantidade){
        this.name = name;
        this.price = price;
        this.quantidade = quantidade;
        
    }
    
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
*/
public class product{
   private String name;
    private double price;
    private int quantidade;
    
    public product(String name , double price, int quantidade){
        this.name = name;
        this.price = price;
        this.quantidade = quantidade;
        
    }
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
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