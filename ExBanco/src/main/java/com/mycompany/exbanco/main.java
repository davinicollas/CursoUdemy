/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exbanco;

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
        conta c;

        System.out.println("Crie uma conta: ");
        int x = sc.nextInt();

        System.out.println("informe o Nome");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("Tem deposito inicial y/n");
        char q = sc.next().charAt(0);
        if (q == 'y') {
            System.out.println("informe o valor para deposito:");
            double valor = sc.nextDouble();
            c = new conta(x, name, valor);

        } else {
            c = new conta(x, name, 0.0);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(c);

        System.out.println();
        System.out.println("Enter a deposito value: ");
        double dep = sc.nextDouble();
        c.addSaldo(dep);
        System.out.println("uppdate cont: ");
        System.out.println(c);

        System.out.println();
        System.out.println("Enter o valor do saque: ");
        double dep1 = sc.nextDouble();
        c.removeSaldo(dep1);
        System.out.println("Updated conta: ");
        System.out.println(c);

        sc.close();
    }
}
