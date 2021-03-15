/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import model.excecoes.DomainExcepition;

/**
 *
 * @author davi nicollas
 */
public class Account {

    private Integer number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(Integer number, String holder, double balance, double withdrawLimit){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount){
        
        /*Verifica se o saque vai ser maior que o balance */
        if (amount > balance) {
            throw new DomainExcepition("Not enough balance");
        }
        /*Verifica se o saque vai ser maior que o limite de saque */

        if (amount > withdrawLimit) {
            throw new DomainExcepition("The amount exceeds withdraw limit");
        }
        balance -= amount;
    }

}
