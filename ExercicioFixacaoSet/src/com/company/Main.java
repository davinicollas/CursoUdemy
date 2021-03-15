package com.company;

import entities.Employe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o path");
        String path = sc.nextLine();
        List<Employe> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employe(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();

            }
            System.out.println("Informe o salario: ");
            double salary = sc.nextDouble();

            List<String>emails = list.stream()
                    .filter(x -> x.getPrice() > salary)
                    .map(x -> x.getEmail())
                    .sorted()
                    .collect(Collectors.toList());
            System.out.println("Emails com salario acima do informado : " + String.format("%.2f", salary )+ ": ");
            emails.forEach(System.out::println);

            double sum = list.stream()
                    .filter(x -> x.getName().charAt(0) == 'M')
                    .map(x -> x.getPrice())
                    .reduce(0.0,(x,y)->x+y);

            System.out.println("Soma dos salarios  'M ': " +String.format("%.2f",sum));


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
