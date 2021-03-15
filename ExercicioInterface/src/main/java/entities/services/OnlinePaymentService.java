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
public interface OnlinePaymentService {
    public double paymentFree(double amount);
    public double interest(double amount, int months);
}
