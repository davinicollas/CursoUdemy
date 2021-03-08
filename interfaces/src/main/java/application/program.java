/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entitie.services.BrazilTaxServices;
import entitie.services.RentalServices;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import model.entities.CarRental;
import model.entities.Veiculo;

/**
 *
 * @author davi nicollas
 */
public class program {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
        System.out.println("Enter rental data: ");
        System.out.println("Car Model: ");
        String carModel = sc.nextLine();
        System.out.println("PickUp (dd/MM/yyyy HH:ss): ");
        Date start = sdf.parse(sc.nextLine());
        System.out.println("Return (dd/MM/yyyy HH:ss): ");
        Date finish = sdf.parse(sc.nextLine());

        CarRental cr = new CarRental(start, finish, new Veiculo(carModel));

        System.out.println("Enter price per hours: ");
        double pricePerHour = sc.nextDouble();
        System.out.println("Enter price per day: ");
        double pricePerDay = sc.nextDouble();

        RentalServices rentalService = new RentalServices(pricePerDay, pricePerHour, new BrazilTaxServices());

        rentalService.processInvoice(cr);

        System.out.println("Invoice: ");
        System.out.println("Basic Payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Total: " + String.format("%.2f", cr.getInvoice().getTotal()));

        sc.close();

    }
}
