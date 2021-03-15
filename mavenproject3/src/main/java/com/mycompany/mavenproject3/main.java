/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author davi nicollas
 */
/*public class main {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();
        System.out.println("Informe a altura do triangulo: ");
        triangulo.altura = sc.nextDouble();
        System.out.println("Informe o largura do triangulo: ");
        triangulo.largura = sc.nextDouble();
        
        System.out.printf("Area: %.2f",triangulo.area());
        System.out.printf("Perimetro: %.2f",triangulo.perimetro());
        System.out.printf("Perimetro: %.2f",triangulo.Diagonal());
    }
}
*/

/*public class main {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double aumento;
        Triangulo triangulo = new Triangulo();
        System.out.println("Nome: ");
        triangulo.name = sc.nextLine();
        System.out.println("Salario: ");
        triangulo.salarioBruto = sc.nextDouble();
        System.out.println("Imposto: ");
        triangulo.imposto = sc.nextDouble();
        
        
        System.out.printf("Nome: ",triangulo.name);
        System.out.printf("Salario Bruto: ",triangulo.salarioBruto);
        System.out.printf("Imposto: ",triangulo.imposto);
        
        System.out.printf("Empregado:  " +triangulo);
        System.out.println();
        System.out.println("Qual o porcentagem de aumento do salario? ");
        aumento = sc.nextDouble();
        triangulo.Aumentosalario(aumento);
        
        System.out.println();
        System.out.println("Update data " + triangulo);
        s.close();
        
        
    }

}*/
public class main{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();
      
        System.out.println("Informe o nome");
        triangulo.nome = sc.nextLine();
        
         System.out.println("Informe a nota1: ");
         triangulo.nota1 = sc.nextDouble();
         System.out.println("Informe a nota2: ");
         triangulo.nota2 = sc.nextDouble();
         System.out.println("Informe a nota3:  ");
         triangulo.nota3 = sc.nextDouble();
         
         System.out.printf("Final Grade "+ triangulo.validarAprevacao());
         
         
         if(triangulo.validarAprevacao()<60){
             System.out.println("FAILED");
             System.out.printf("FALTOU %.2f POINTS %n" , triangulo.validarNota());
         }else{
             System.out.println("Passou");
         }
           
             
         
         
         
         
         
         
         
         
        
    }
}
