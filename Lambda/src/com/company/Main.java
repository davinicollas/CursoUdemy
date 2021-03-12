package com.company;

import Entities.Product;
import util.ProductPredi;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product ("Tv", 900.00));
        list.add(new Product ("Mouse", 50.00));
        list.add(new Product ("Tablet", 350.00));
        list.add(new Product ("HD case", 80.90));
        double min = 100.00;
        list.removeIf( p -> p.getPrice() >= min);

        for(Product p : list){
            System.out.println(p);
        }


    }
}
