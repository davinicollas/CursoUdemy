/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject5;


import java.util.Locale;
import java.util.Scanner;

/*public class main{
    
   public static void main (String[] args){
       Triangulo x ,y;
       x= new Triangulo();
       y= new Triangulo();
       
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       
       x.a = sc.nextDouble();
       x.b = sc.nextDouble();
       x.c = sc.nextDouble();
       y.a = sc.nextDouble();
       y.b = sc.nextDouble();
       y.c = sc.nextDouble();
       
      
       double areaX = x.area();
       double areaY = y.area();
       
       System.out.printf("O valor do triangulo x : %.4f%n ", areaX);
       System.out.printf("O valor do triangulo y : %.4f%n ", areaY);
       if(areaX > areaY){
           System.out.printf("O triangulo primeiro e maior X! ");
       }else
           System.out.printf("O triangulo primeiro e maior Y!");
       
       
   }
}
*/

public class main{
    public static void main(String[] args)
    {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product name: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        
        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();
        
        product triangulo = new product(name,price,quantidade);
        
        System.out.println();
        System.out.println("Product Data: "+triangulo);
        System.out.println();
        
        
        System.out.println("Entre com o numero de produto para ser adicionado no estoque: ");
        quantidade = sc.nextInt();
        triangulo.addEstoque(quantidade);
        System.out.println("Updade Data: "+triangulo);
        
        System.out.println("Entre com o numero de produto para ser removido no estoque: ");
        quantidade = sc.nextInt();
        triangulo.remEstoque(quantidade);
        System.out.println("Updade Data: "+triangulo);
        
        sc.close();
       
    }
}