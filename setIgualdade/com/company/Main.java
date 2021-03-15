package com.company;

import entities.Product;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Set<Product> set =  new HashSet<>();

        set.add(new Product("tv" , 900.00));
        set.add(new Product("Notebook" , 1.200));
        set.add(new Product("Tablet" , 400.00));

        Product prod = new Product("Notebook", 1.200);

        System.out.println(set.contains(prod));

        ;
    }
}
