package com.company;

import entities.userLog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o caminho ");
        String path = sc.nextLine();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
          Set <userLog> set = new HashSet<>();
          String line = br.readLine();
            while(line!=null){
                String [] fields = line.split(" ");
                String name = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));
                set.add(new userLog(name,moment));
                line = br.readLine();
            }
            System.out.println("Total user: "+set.size());
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());

        }
}
}

