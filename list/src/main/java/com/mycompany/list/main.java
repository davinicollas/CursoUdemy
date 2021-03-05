/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.list;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author davi nicollas
 */
public class main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<funcionario> func = new ArrayList<>();

        System.out.println("Informe a quantidade de pessoas registrada:  ");
        int x = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i <= x; i++) {

            System.out.println("Emplyoee #" + i);
            System.out.println("Informe o id:  ");
            Integer id_conta = sc.nextInt();

            System.out.println("Informe o name:  ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Informe o salario:  ");
            Double salario = sc.nextDouble();
            func.add(new funcionario(id_conta, name, salario));
        }

        System.out.println();
        System.out.println("Enter the employee id that will have salary increase: ");
        Integer idPos = sc.nextInt();

        Integer pos = hasId(func, idPos);
        if (pos == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            func.get(pos).aumentoSalario(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");
            for(funcionario f : func){
                System.out.println(f);
            }

        sc.close();
    }

    public static Integer hasId(List<funcionario> func, int id) {
        for (int i = 0; i <= func.size(); i++) {
            if (func.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

}
