package com.company;

import entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD case", 80.90));
        double factor = 1.1;
        Consumer<Product> cons = product -> {
            product.setPrice(product.getPrice()*factor);
        };
        list.forEach(cons);
        list.forEach(System.out::println);
    }
}
