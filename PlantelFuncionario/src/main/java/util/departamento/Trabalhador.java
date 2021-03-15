/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.departamento;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import util.Enum.NivelServico;

/**
 *
 * @author davi nicollas
 */
public class Trabalhador {
    private String nome;
    private NivelServico nivel;
    private Double salario;
    
    private Departamento derp;
    private List<Contrato> contracts = new ArrayList<>();
    
    public Trabalhador(){    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelServico getNivel() {
        return nivel;
    }

    public void setNivel(NivelServico nivel) {
        this.nivel = nivel;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Departamento getDerp() {
        return derp;
    }

    public void setDerp(Departamento derp) {
        this.derp = derp;
    }

    public List<Contrato> getContracts() {
        return contracts;
    }

  
    public Trabalhador(String nome, NivelServico nivel, Double salario, Departamento derp) {
        this.nome = nome;
        this.nivel = nivel;
        this.salario = salario;
        this.derp = derp;
    }
    
    
    public void adicionarContrato(Contrato cont){
        contracts.add(cont);
    }
     public void removerContrato(Contrato cont){
        contracts.remove(cont);
    }
     public double income(int year, int month){
         double sum = salario;
         Calendar cal = Calendar.getInstance();
            for(Contrato c : contracts){
                cal.setTime(c.getData());
                int c_year = cal.get((Calendar.YEAR));
                int c_month =  1 + cal.get((Calendar.MONTH));
                if(year == c_year && month == c_month){
                    sum +=c.totalValor();
                }
            }
         return sum;
         
     }
    
}
