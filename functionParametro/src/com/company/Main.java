package com.company;

import entities.Product;
import util.ProductServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD case", 80.90));
        ProductServices ps = new ProductServices();

        double sum = ps.filteredum(list,product -> product.getPrice()< 100.00);

        System.out.println("Sum = " + String.format("%.2f", sum));
    }
}