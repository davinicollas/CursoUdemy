package Application;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.printf("informe a quantidade de alunos para o Curso A:   ");
        int f = sc.nextInt();
        for(int i = 0;  i<f; i++){
            int id1 = sc.nextInt();
            a.add(id1);
        }
        System.out.printf("informe a quantidade de alunos para o Curso b:   ");
        int x = sc.nextInt();
        for(int i = 0;  i<x; i++){
            int id2 = sc.nextInt();
            b.add(id2);
        }

        System.out.printf("informe a quantidade de alunos para o Curso b:   ");
        int j = sc.nextInt();
        for(int i = 0;  i<j; i++){
            int id3 = sc.nextInt();
            c.add(id3);
        }
        Set<Integer> Total =  new HashSet<>(a);
        Total.addAll(b);
        Total.addAll(c);

        System.out.println("Total: "+ Total.size());
    }
}
