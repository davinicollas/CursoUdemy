/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.services;

/**
 *
 * @author davi nicollas
 */
public class PaypalService implements OnlinePaymentService{
    
    private static final double FREE_PERCENTAGEM = 0.02;
    private static final double MONTHL_INTEREST = 0.01;

    @Override
    public double paymentFree(double amount) {
        return amount * FREE_PERCENTAGEM;
    }

    @Override
    public double interest(double amount, int months) {
        
        return amount * MONTHL_INTEREST * months;
    }

    
    
}
