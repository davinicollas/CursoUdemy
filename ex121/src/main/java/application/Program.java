/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.util.OrderStatus;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author davi nicollas
 */
public class Program {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cliente data: ");
        System.out.println("Informe o nome: ");
        String name = sc.nextLine();
        System.out.println("Informe o email: ");
        String email = sc.nextLine();
        System.out.println("Date (DD/MM/YYYY): ");
        String dataRecebida = sc.next();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dt = df.parse(dataRecebida);

        Client cliente = new Client(name, email, dt);

        System.out.println("Enter order data: ");
        System.out.println("Status : ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, cliente);

        System.out.println("Informe a quantidade de order: ");
        int qnd = sc.nextInt();
        for (int i = 0; i <= qnd; i++) {
            sc.nextLine();
            System.out.println("Enter #" + i + 1 + "item data");
            System.out.println("Informe o product");
            String nameProduct = sc.nextLine();
            System.out.println("Product Price");
            double priceProduct = sc.nextDouble();
            Product product = new Product(nameProduct, priceProduct);

            System.out.println("Quantidade");
            int quantidade = sc.nextInt();

            OrderItem ordemItem = new OrderItem(quantidade, priceProduct, product);
            order.addItem(ordemItem);

        }

        System.out.println();
        System.out.println("ORDER SUMMARY");
        System.out.println(order);
        sc.close();

    }
}
