/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exmatriz;

import java.util.Scanner;

/**
 *
 * @author davi nicollas
 */
public class program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o tamanho da matriz linhas");
        int x = sc.nextInt();
        System.out.println("Informe o tamanho da matriz colunas");
        int y = sc.nextInt();
        int[][] mat = new int [x][y];
        for(int i = 0 ; i< mat.length ; i++){
            for(int j=0; j< mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        int number = sc.nextInt();
        for(int i = 0 ; i< mat.length ; i++){
            for(int j=0; j< mat[i].length; j++){
              if(mat[i][j] == number){
                  System.out.println("Position: " + i +","+ j+ ":");
                  if(j>0){
                      System.out.println("O numero esta a esquerda: "+ mat[i][j-1]);
                  }
                  if(j<mat[i].length-1){
                      System.out.println("O número acima está na posição: "+ mat[i][j+1]);
                  }
                   if(i>0){
                      System.out.println("O numero esta a deireita: "+ mat[i-1][j]);
                  }
                    if(i< mat.length -1){
                      System.out.println("O número abaixo está na posição: "+ mat[i+1][j]);
                  }
              }
            }
        }
        sc.close();
    }
}
