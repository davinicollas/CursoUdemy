/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entitties;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author davi nicollas
 */
public class Contrato {

    private Integer number;
    private Date data;
    private double totalValue;

    private List<Installment> list = new ArrayList<>();

    public Contrato() {

    }

    public Contrato(Integer number, Date data, double totalValue) {
        this.number = number;
        this.data = data;
        this.totalValue = totalValue;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getList() {
        return list;
    }

    public void setList(List<Installment> list) {
        this.list = list;
    }
    /*Adicionar add na list*/
    public void addInstallment(Installment installment) {
        list.add(installment);
    }

    public void removeInstallment(Installment installment) {
        list.remove(installment);
    }

}
