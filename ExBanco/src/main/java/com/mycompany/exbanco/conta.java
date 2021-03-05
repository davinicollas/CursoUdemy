/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exbanco;

/**
 *
 * @author davi nicollas
 */
public class conta {

    private int conta;
    private String nome;
    private double desposito;

    public conta(int conta, String nome) {
        this.conta = conta;
        this.nome = nome;
    }

    public conta(int conta, String nome, double initdesposito /*double desposito*/) {
        this.conta = conta;
        this.nome = nome;
        /*this.desposito = desposito;*/ addSaldo(initdesposito);
    }

    public int getConta() {
        return conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDesposito() {
        return desposito;
    }

    public void addSaldo(double valor) {

        desposito += valor;

    }

    public void removeSaldo(double valor) {

        desposito -= valor + 5.0;

    }

    public String toString() {
        return " Conta:"
                + conta
                + ", Name: "
                + nome
                + ", Depositado: "
                + String.format("%.2f", desposito);

    }

}
