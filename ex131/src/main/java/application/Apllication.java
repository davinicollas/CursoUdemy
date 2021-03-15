/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author davi nicollas
 */
public class Apllication {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();
        System.out.println("Enter the number of products: ");
        int qnd = sc.nextInt();

        for (int i = 1; i <= qnd; i++) {
            System.out.println("Product #" + i + "data : ");
            System.out.println("Informe se o produto é: Comum, usado ou importado (c/u/i");
            char x = sc.next().charAt(0);
            sc.nextLine();
            if (x == 'c') {
                System.out.println("Informe o nome: ");
                String name = sc.nextLine();
                System.out.println("Informe o preço: ");
                double preco = sc.nextDouble();
                list.add(new Product(name, preco));
            } else if (x == 'i') {
                System.out.println("Informe o nome: ");
                String name = sc.nextLine();
                System.out.println("Informe o preço: ");
                double preco = sc.nextDouble();
                System.out.println("Informe o frete");
                double valorAcresentar = sc.nextDouble();
                list.add(new ImportedProduct(name, preco, valorAcresentar));
            } else if (x == 'u') {
                System.out.println("Informe o nome: ");
                String name = sc.nextLine();
                System.out.println("Informe o preço: ");
                double preco = sc.nextDouble();
                System.out.println("Date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                list.add(new UsedProduct(name, preco, date));

            }
        }

        System.out.println("PRICE TAGS: ");
        for (Product a : list) {
            System.out.println(a.priceTag());
        }
        sc.close();
    }
}
