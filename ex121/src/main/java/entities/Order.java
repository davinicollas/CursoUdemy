/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import entities.util.OrderStatus;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author davi nicollas
 */
public class Order {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;
    /*Chamado do cliente usar atributos da classe*/
    private Client cliente;
    /*Criação das ordems de itens
    */
    private List<OrderItem> orItem = new ArrayList<>();

    public Order() {

    }

    public Order(Date moment, OrderStatus status, Client cliente) {
        this.moment = moment;
        this.status = status;
        this.cliente = cliente;
    }

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrItem() {
        return orItem;
    }

    public void addItem(OrderItem item) {
        orItem.add(item);
    }

    public void removeItem(OrderItem item) {
        orItem.remove(item);
    }

    public double total() {
        /*Somando todos os valores dos pedidso*/
        Double realValor = 0.0;

        for (OrderItem item : orItem) {
            realValor += item.subTotal();

        }
        return realValor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(cliente + "\n");
        sb.append("Order items:\n");
        for (OrderItem item : orItem) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }

}
