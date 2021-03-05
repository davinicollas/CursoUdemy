/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author davi nicollas
 */
public class OutsourcedEmployee  extends employee{
    private double adicional;
    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, int hours, double valuePerHours, double adicional) {
        super(name, hours, valuePerHours);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    
    @Override
    public double payment() {
        return super.payment() + adicional*1.1;
    }
}
