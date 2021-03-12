package com.company;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o caminho: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            List<Product> list = new ArrayList<>();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            double avg = list.stream()
                    .map(product -> product.getPrice())
                    .reduce(0.0, (x, y) -> x + y / list.size());

            System.out.println("Average Price: " + String.format("%.2f", avg));

            Comparator<String> com = (s1,s2) ->s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream()
                    .filter(product -> product.getPrice() < avg)
                    .map(product -> product.getName())
                    .sorted(com.reversed())
                    .collect(Collectors.toList());
            names.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();

    }
}
