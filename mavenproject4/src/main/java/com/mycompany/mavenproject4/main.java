/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject4;

import com.mycompany.mavenproject4.util.triangulo;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author davi nicollas
 */

/* Exemplo na mesma classe
public class main {
    
    public static double PI= 3.14159;
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a area");
        double radius = sc. nextDouble();
        
        double c = circuferencia(radius);
        
        double d = volume(radius);
        
         System.out.printf("Circuferencia : %.2f%n", c);
          System.out.printf("Volume : %.2f%n", d);
          System.out.printf("PI : %.2f%n", PI);
    }
    
    public static double circuferencia (double radius){
        return 2.0*PI*radius;
    }
    public static double volume (double radius){
        return 4.0 * PI * radius * radius * radius/3;
    }
}
*/
/* Exemplo nao usando o estatico
public class main {
    
    public static double PI= 3.14159;
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a area");
        double radius = sc. nextDouble();
         triangulo tria = new triangulo();
        double c = tria.circuferencia(radius);
        
        double d = tria.volume(radius);
        
         System.out.printf("Circuferencia : %.2f%n", c);
          System.out.printf("Volume : %.2f%n", d);
          System.out.printf("PI : %.2f%n", PI);
    }
    
  
}
*/
/*public class main {
    
    public static double PI= 3.14159;
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a area");
        double radius = sc. nextDouble();
        double c = triangulo.circuferencia(radius);
        
        double d = triangulo.volume(radius);
        
         System.out.printf("Circuferencia : %.2f%n", c);
          System.out.printf("Volume : %.2f%n", d);
          System.out.printf("PI : %.2f%n", PI);
    }
    
  
}*/

public class main{
    public static void main (String[] args){
        double dol,real;
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);
        
        System.out.println("Qual o valor do dolar?");
        dol = sc.nextDouble();
        System.out.println("Quantos dolar querem comprar");
        real = sc.nextDouble();
        
        double d = triangulo.currencyConverter(dol, real);
        
        System.out.println("o valor pago em reais: %.2f "+d);
        
    }
}