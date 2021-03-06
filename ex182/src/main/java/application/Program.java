/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author davi nicollas
 */
public class Program {

    public static void main(String[] args) {
        String[] line = new String[]{"Test", "Test"};
        String path = "c:\\temp\\out.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
            for (String lines : line) {
                bw.write(lines);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
