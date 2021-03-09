package Application;

import interfaces.InterestServices;
import services.BrazilInterestService;
import services.USAInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();


        InterestServices is = new BrazilInterestService(1.0);
        double payment = is.payment(amount,months);

        System.out.println("Payment after " + months + "months: ");
        System.out.println(String.format("%.2f" , payment));
        sc.close();
    }
}
