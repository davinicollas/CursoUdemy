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
public class ImportedProduct extends Product{
    private double customsFree;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, double price, double customsFree) {
        super(name, price);
        this.customsFree = customsFree;
    }

    public double getCustomsFree() {
        return customsFree;
    }

    public void setCustomsFree(double customsFree) {
        this.customsFree = customsFree;
    }


    public double totalPrice(){
        return super.getPrice() + customsFree;
    }
    
    @Override
    public String priceTag(){
        return getName()+
                "$" 
                +String.format("%.2f",totalPrice())
                +"(custom free: $ "
                +String.format("%.2f",customsFree) +" )";
    }

    
}
