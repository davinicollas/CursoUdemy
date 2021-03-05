/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Locale;
import java.util.Scanner;

/*
public class main {
    public static void main(String [] args){
        int x , i ;
        Scanner sc = new Scanner(System.in);
        
        x = sc.nextInt();
        
        for(i = 0 ; i<x; i++)
        {
            if(i % 2 == 1){
                
                System.out.println(i);
            }
        }
        System.out.println(x);
    }
}

 */
 /*
public class main {
    public static void main(String [] args){
        int x , i ,in=0, out=0 ;
        Scanner sc = new Scanner(System.in);
        
        x = sc.nextInt();
        
        for(i = 0 ; i<x; i++)
        {
            if(i >= 10 && i <= 20){
                in ++;
               
            }else
                out ++;
                
        }
         System.out.printf(in + " " + "in %n");
         System.out.printf(out + " " +"out %n");
    }
}
 */
 /*
public class main {
    public static void main(String [] args){
        double x ,y, div,i;
        int n;
        Scanner sc = new Scanner(System.in);
        
        n = sc. nextInt();
        for(i = 0 ; i<n; i++)
        {
            x = sc.nextDouble();
            y = sc.nextDouble();
            if(y == 0){
                System.out.printf("impossivel");
            }    else{
                div = x / y;
                System.out.printf("%.1f%n", div);
            }
        }
    }
}
 */
 /*
public class main {

    public static void main(String[] args) {
        int n, i, fat = 1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            fat = fat * i;

        }
        System.out.println(fat);
        sc.close();

    }
}
 */
 /*
public class main {

    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i =1; i <= n; i++) {
          if(n % i == 0){
              System.out.println(i);
          }
        }
        sc.close();

    }
}
 */
 /*
public class main {

    public static void main(String[] args) {
        int n,i, primeiro=0 , segundo=0, terceiro=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i =1; i <= n; i++) {
            primeiro = i;
            segundo = i*i;
            terceiro = i*i*i;
            System.out.printf("%d %d %d %n", primeiro, segundo, terceiro);
        }
        
        sc.close();

    }
}*/
/*
public class main{

    public static void main(String[] args){
        
        int i, x, z;
        Scanner sc = new Scanner (System.in);
        
        i = sc.nextInt();
        x = sc.nextInt();
        z = sc.nextInt();
        int resultado = max(i,x,z);
        
        showrider(resultado);
        
    }
    
    public static int max (int x,int y, int z){
        int aux;
        if(x>y && x>z){
            aux = x;
        }
        else if (y>z){
            aux = y;
        }
        else{
            aux = z;
        }
        return aux;
    }
    
    public static void showrider (int showrider){
        System.out.printf("height : %s", showrider);
    }
}
*/

public class main{
    
   public static void main (String[] args){
       double x1,x2,x3 ,y1,y2,y3,soma1,soma2;
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       
       x1 = sc.nextDouble();
       x2 = sc.nextDouble();
       x3 = sc.nextDouble();
       y1 = sc.nextDouble();
       y2 = sc.nextDouble();
       y3 = sc.nextDouble();
       
       double p = (x1+x2+x3)/2.0;
       soma1 = Math.sqrt(p* (p-x1)*(p-x2)*(p-x3));
       p = (y1+y2+y3)/2;
       soma2 = Math.sqrt(p* (p-y1)*(p-y2)*(p-y3));
       
       System.out.printf("O valor do triangulo x : %.4f%n ", soma1);
       System.out.printf("O valor do triangulo y : %.4f%n ", soma2);
       if(soma1 > soma2){
           System.out.printf("O triangulo primeiro e maior X! ");
       }else
           System.out.printf("O triangulo primeiro e maior Y!");
       
       
   }
}



        