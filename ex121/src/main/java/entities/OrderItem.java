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
public class OrderItem {

    private int quantity;
    private double price;
   /*cHAMADA DA CLASSE DO PRODUCT PARA ACESSAR OS VALORES DO PRODUTO*/
    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double subTotal() {
        return quantity * price;

    }

    @Override
    public String toString() {
        return /*Buscando o nome do produto*/
                product.getName()
                + ", $"
               /*Formatando valor*/ 
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity
                + ", Subtotal: $"
                /*Formatando valor*/
                + String.format("%.2f", subTotal());
    }

}
