package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String , Integer> lista = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o caminho do arquivo CSV");
        String path = sc.nextLine();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                int voto = Integer.parseInt(fields[1]);
                if(lista.containsKey(name)){
                    int som = lista.get(name);
                    lista.put(name, voto + som);
                }else{
                    lista.put(name,voto);
                }
                line = br.readLine();

            }
            for(String key: lista.keySet()){
                System.out.println(key + " : " + lista.get(key));
            }

        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
