/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Scanner;

/**
 *
 * @author davi nicollas
 */
public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tamanho da Matriz");
        int x = sc.nextInt();
        int[][] mat = new int[x][x];
        for (int i = 0; i < mat.length ; i++) {
            for (int j = 0; j <mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Main diagonal");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();
        
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j <mat.length; j++) {
                
                if(mat[i][j]<0){
                    count ++;
                }
            }
            
        }
        System.out.println("Number negation: " + count);
        sc.close();

    }
}
