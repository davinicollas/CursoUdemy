/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject4.util;


/**
 *
 * @author davi nicollas
 */
/*public class triangulo {
    
    public static final double PI = 3.14159;
      public static double circuferencia (double radius){
        return 2.0*PI*radius;
    }
    public static double volume (double radius){
        return 4.0 * PI * radius * radius * radius/3;
    }
}
*/
public class triangulo {
    public static  final double IOF = 0.06;
    public static double currencyConverter(double dol, double real){
       double soma = dol * real;
       return soma + soma * IOF;
    }

}