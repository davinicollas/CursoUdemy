/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.OutsourcedEmployee;
import entities.employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author davi nicollas
 */
public class application {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<employee> list = new ArrayList<>();
        System.out.println("Enter the number of employees: ");
        int x = sc.nextInt();
        for (int i = 0; i <= x; i++) {
            System.out.println("Employee: " +i+ " data: ");
            System.out.println("Informe se o funcionairo e tercerizado: s/n");
            char cod = sc.next().charAt(0);
            sc.nextLine();
            if (cod == 's') {
                System.out.println("Informe o nome: ");
                String name = sc.nextLine();
                System.out.println("Informe a quantidade de horas: ");
                int horas = sc.nextInt();
                sc.nextLine();
                System.out.println("Informe o valor da hora: ");
                double valorHoras = sc.nextDouble();
                sc.nextLine();
                System.out.println("Adicional : ");
                double adicional = sc.nextDouble();
                list.add(new OutsourcedEmployee(name, horas, valorHoras, adicional));
            } else if (cod == 'n') {
                System.out.println("Informe o nome: ");
                String name = sc.nextLine();
                System.out.println("Informe a quantidade de horas: ");
                int horas = sc.nextInt();
                sc.nextLine();
                System.out.println("Informe o valor da hora: ");
                double valorHoras = sc.nextDouble();
                list.add(new employee(name, horas, valorHoras));

            }
        }
        System.out.println();
        System.out.println("Payments: ");
        for (employee emp : list) {
            System.out.println(emp.getName() + " -$ " + String.format("%.2f", emp.payment()));
        }
        sc.close();
    }
}
