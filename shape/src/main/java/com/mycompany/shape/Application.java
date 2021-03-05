/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shape;

import entitites.Circle;
import entitites.Rectangule;
import entitites.Shape;
import entitites.enums.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author davi nicollas
 */
public class Application {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();
        System.out.println("Informe a quantidade de shapes: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + "data: ");
            sc.nextLine();
            System.out.println("Informe Retangulo ou Circulo R/C");
            char q = sc.next().charAt(0);
                    sc.nextLine();

            if (q == 'r') {
                System.out.println("Widht: ");
                double widht = sc.nextDouble();
                System.out.println("Height: ");
                double height = sc.nextDouble();
                System.out.println("Informe Se e BLUE, BLACK , RED ");
                Color color = Color.valueOf(sc.next());
                list.add(new Rectangule(widht, height, color));
            } else if (q == 'c') {
                System.out.println("Radius: ");
                double radius = sc.nextDouble();
                System.out.println("Informe Se e BLUE, BLACK , RED ");
                Color color = Color.valueOf(sc.next());
                list.add(new Circle(radius,color));
            }

        }
        System.out.println("");
        System.out.println("SHAPE AREAS");
        for(Shape shape: list){
            System.out.println(String.format("%.2f", shape.area()));
        }
    }
}
