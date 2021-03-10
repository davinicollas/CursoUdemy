package com.company;

import entities.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Map<Product, Double> estoque = new HashMap<>();
        Product p1 = new Product("tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("tv", 400.0);


        estoque.put(p1, 1.0000);
        estoque.put(p2, 2.000);
        estoque.put(p3, 3.000);

        Product ps = new Product("tv", 900.00);

        System.out.println("Constainer e:" + estoque.containsKey(ps));
    }
}
