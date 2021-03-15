/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.departamento;

import java.util.Date;

/**
 *
 * @author davi nicollas
 */
public class Contrato {

    private Date data;
    private Double valorHora;
    private Integer horas;

      public Contrato() {
    }
    
    public Contrato(Date data, Double valorHora, Integer horas) {
        this.data = data;
        this.valorHora = valorHora;
        this.horas = horas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    
    public double totalValor(){
        return valorHora*horas;
    }

    

}
