/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
import java.util.Locale;
import java.util.Scanner;
import model.entities.Account;
import model.excecoes.DomainExcepition;

/**
 *
 * @author davi nicollas
 */
public class program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter account data");
            System.out.println("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.println("Holder: ");
            String holder = sc.nextLine();
            System.out.println("Initial balance: ");
            double initBalance = sc.nextDouble();
            System.out.println("Whithdraw limit: ");
            double whithDraw = sc.nextDouble();
            Account acount = new Account(number, holder, initBalance, whithDraw);

            System.out.println();
            System.out.println("Enter Amount for Winthdraw");
            double amountDraw = sc.nextDouble();
            /*Caso o saque vai gerar um novo balanço*/
            try{
                acount.withdraw(amountDraw);
                System.out.println("New balance : " + String.format("%.2f", acount.getBalance()));
            }
            /*Caso Aconteça o erro sera printado na tela a mesagem determinada*/
            catch (DomainExcepition e) {
                System.out.println("WithDraw error: " + e.getMessage());
            }
        
    }

}
