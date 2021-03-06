/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;


import java.io.File;
import java.util.Scanner;

/**
 *
 * @author davi nicollas
 */
public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a path");
        String strPath = sc.nextLine();
        
        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders");
        for(File folder: folders){
            System.out.println(folder);
        }
        File [] files = path.listFiles(File::isFile);
        System.out.println("FILES:");
        for(File file: files){
            System.out.println(file);
        }
        boolean sucess = new File(strPath + "\\Sbdir").mkdir();
        System.out.println("sucesso" + sucess);
        sc.close();
               
        }
}