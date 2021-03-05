/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Fisica;
import entities.Juridica;
import entities.Pessoa;
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

        List<Pessoa> list = new ArrayList<>();

        System.out.println("Informe a quantidade de pessoa: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + "data: ");
            System.out.println("Fisico ou juridico: I/C");
            char q = sc.next().charAt(0);
            sc.nextLine();

            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Anual Income: ");
            double renda = sc.nextDouble();
            if (q == 'i') {
                System.out.println("gasto com saude:");
                double saude = sc.nextDouble();
                list.add(new Fisica(saude, name, renda));
            } else if (q == 'c') {
                System.out.println("Numeros de funcionarios:");
                int func = sc.nextInt();
                list.add(new Juridica(func, name, renda));
            }
        }
        System.out.println("TAXES PAID");
        double sum = 0.0;
        for (Pessoa a : list) {
            double tax = a.impostoRenda();
            System.out.println(a.getNome()+ ":  R$" +  String.format("%.2f",a.impostoRenda()));
            sum +=tax;
        }
        System.out.println("Total Taxes: $" + String.format("%.2f", sum));
    }
}
