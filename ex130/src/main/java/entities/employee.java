/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author davi nicollas
 */
public class employee {

    private String name;
    private int hours;
    private double valuePerHours;

    public employee() {
    }

    public employee(String name, int hours, double valuePerHours) {
        this.name = name;
        this.hours = hours;
        this.valuePerHours = valuePerHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getValuePerHours() {
        return valuePerHours;
    }

    public void setValuePerHours(double valuePerHours) {
        this.valuePerHours = valuePerHours;
    }

    public double payment() {
        return hours * valuePerHours;
    }

}
