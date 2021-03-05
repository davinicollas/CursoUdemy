/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import model.entities.Reservation;

/**
 *
 * @author davi nicollas
 */
public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Room number");
        int number = sc.nextInt();
        System.out.println("Check-in data(dd/mm/yyyy)");
        Date checkIn = sdf.parse(sc.next());
        System.out.println("Check-out data(dd/mm/yyyy)");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)) {
            System.out.println(" Check-out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
            System.out.println("Enter data to update the reservation");
            System.out.println("Check-in data(dd/mm/yyyy)");
            checkIn = sdf.parse(sc.next());
            System.out.println("Check-out data(dd/mm/yyyy)");
            checkOut = sdf.parse(sc.next());
            /*Melhorando o tratamento de excessão*/
            String error = reservation.updateDates(checkIn, checkOut);
            if(error != null){
                System.out.println("Error in reservation" +error);
            }else{
                System.out.println("Reservation: "+reservation);
            }
        }

        sc.close();
    }

}
