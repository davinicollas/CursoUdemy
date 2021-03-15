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
public class Rectangule  extends Shape{
    private double width;
    private double height;

    public Rectangule() {
      super();
    }

    public Rectangule(double width, double height, Color color) {
        super(color);
        this.width = width;
        this.height = height;
    }
    
    
    @Override
    public double area() {
        return height*width;

    }
    
}
