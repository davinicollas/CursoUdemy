/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitie.services;

import model.entities.CarRental;
import model.entities.Invoice;

/**
 *
 * @author davi nicollas
 */
public class RentalServices {

    private Double pricePerDay;
    private Double pricePerHour;

    private TaxServices taxService;

    public RentalServices() {
    }

    public RentalServices(Double pricePerDay, Double pricePerHour, TaxServices taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        long t1 = carRental.getStart().getTime();
        long t2 = carRental.getFinish().getTime();
        Double hours = (double) (t2 - t1) / 1000 / 60 / 60;
        Double basicPayment;
        if (hours <= 12) {
             basicPayment =  pricePerHour * Math.ceil(hours) ;
        } else {
             basicPayment = pricePerDay * Math.ceil(hours / 24) ;

        }
        Double tax = taxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment,tax));
        
    }
}
