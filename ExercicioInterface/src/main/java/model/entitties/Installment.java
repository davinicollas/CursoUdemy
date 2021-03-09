/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entitties;

import java.text.SimpleDateFormat;
import java.util.Date;
import model.entitties.Contrato;

/**
 *
 * @author davi nicollas
 */
public class Installment extends Contrato {

    private Date dueDate;
    private Double amount;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Installment() {
    }

    public Installment(Date dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
    @Override
	public String toString() {
		return sdf.format(dueDate) + " - " + String.format("%.2f", amount);
 	}

}
