/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.list;

/**
 *
 * @author davi nicollas
 */
public class funcionario {
    private Integer id;
    private String name;
    private double salario;
    public funcionario(){

    }
    public funcionario(Integer id ,String name, Double salario) {
        this.id = id;
        this.name = name;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalario() {
        return salario;
    }
    
    public void aumentoSalario(double porcentagem){
        salario += salario * porcentagem/100;
    }
    @Override
    public String toString()
            
    {
        return id + ", "+name +", "+ String.format("%.2f", salario);
    }
    
}
