/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author davi nicollas
 */
public class Program {
    public static void main(String[] args){
        File file = new  File("C:\\temp\\ArquivoTest.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println((sc.nextLine()));
            }
       
        }
         catch(IOException e){
           System.out.println("ERRO: " + e.getMessage());     
           }
        finally{
            if(sc !=null){
                sc.close();
            }
        }
    }
}
