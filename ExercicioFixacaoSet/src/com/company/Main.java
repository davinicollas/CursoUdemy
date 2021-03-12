package com.company;

import entities.Employe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o path");
        String path = sc.nextLine();
        System.out.println("Informe o salario: ");
        double salary = sc.nextDouble();
        List<Employe> list = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line != null){
                String[] folders = line.split(",");
                list.add();
                list.


            }



        }catch (IOException e){
            System.out.println("Error: " +e.getMessage());
        }


    }
}
