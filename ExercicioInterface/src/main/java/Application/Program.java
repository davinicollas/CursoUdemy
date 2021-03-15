/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import entities.services.ContractService;
import entities.services.PaypalService;
import model.entitties.Installment;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import model.entitties.Contrato;

/**
 *
 * @author davi nicollas
 */
public class Program {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Contrato cont = new Contrato();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Contract Data: ");
        System.out.println("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Date dd/MM/yyyy: ");
        Date data = sdf.parse(sc.nextLine());
        System.out.println("Contrato value: ");
        double valor = sc.nextDouble();
        cont = new Contrato(number, data, valor);
        System.out.println("Enter number of installments: ");
        int parcelas = sc.nextInt();
        ContractService contractService = new ContractService(new PaypalService());
        contractService.ProcessContract(cont, parcelas);
        
        System.out.println("INSTALLMENTS");
        for(Installment x : cont.getList()){
            System.out.println(x);
        }
        

        

    }

}
