package session8;

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
       
       Triangulo triangulo = new Triangulo();
        System.out.println("Enter Product name: ");
        System.out.print("Name: ");
        triangulo.name = sc.nextLine();
        System.out.print("Price: ");
        triangulo.price = sc.nextDouble();
        
        System.out.print("Quantidade: ");
        triangulo.quantidade = sc.nextInt();
        
        System.out.println();
        System.out.println("Product Data: "+triangulo);
        System.out.println();
        
        
        System.out.println("Entre com o numero de produto para ser adicionado no estoque: ");
        int quantidade = sc.nextInt();
        triangulo.addEstoque(quantidade);
        System.out.println("Updade Data: "+triangulo);
        
        System.out.println("Entre com o numero de produto para ser removido no estoque: ");
        quantidade = sc.nextInt();
        triangulo.remEstoque(quantidade);
        System.out.println("Updade Data: "+triangulo);
        
        sc.close();
       
    }
}