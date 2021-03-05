/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exhotel;

import java.util.Scanner;
/**
 *
 * @author davi nicollas
 */
public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x=0, quarto;
        String name;
        String email;

        hotel[] vect = new hotel[10];

        for (int i = 0; i < vect.length; i++) {

            name = " ";
            email = " ";
            quarto = 0;
            vect[i] = new hotel(name, email);

        }
        System.out.println("Informe a quantidade de quarto");
        x=sc.nextInt();      
        for (int i = 0; i < x ; i++) {
            sc.nextLine();
            System.out.println("Informe o nome");
            name = sc.nextLine();
            System.out.println("Informe o email");
            email = sc.nextLine();
            System.out.println("Informe o quarto");
            quarto = sc.nextInt();
            vect[quarto] = new hotel(name, email);
        }
         for (int i = 0; i < 10; i++) {
           if(vect[i] != null){
             System.out.print(i + " : "+vect[i]);
             }
         } 
    }
}
