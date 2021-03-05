/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitites;

import entitites.enums.Color;

/**
 *
 * @author davi nicollas
 */
public class Circle extends Shape{
    
    private double radius;

    public Circle() {
    }

    public Circle(double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double area() {
        return Math.PI * radius *radius;
    }
    
    
}
