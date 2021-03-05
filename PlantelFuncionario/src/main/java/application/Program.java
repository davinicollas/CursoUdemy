/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import util.Enum.NivelServico;
import util.departamento.Contrato;
import util.departamento.Departamento;
import util.departamento.Trabalhador;
/**
 *
 * @author davi nicollas
 */
public class Program {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o departamento");
        String dep = sc.nextLine();
        System.out.println("Enter Worker data: ");
        System.out.println("Informe o nome: ");
        String name = sc.nextLine();
        System.out.println("Informe o nivel: ");
        String nivel = sc.nextLine();
        System.out.println("Informe o salario: ");
        double salary = sc.nextDouble();
        sc.nextLine();
        
        Trabalhador trabalhador = new Trabalhador(name, NivelServico.valueOf(nivel), salary , new Departamento(dep));
        
        System.out.println("Informe a quantidade de contrato? ");
        int qntd = sc.nextInt();
        
        for(int i = 0 ; i<qntd; i++){
            sc.nextLine();
            System.out.println("Enter Contact: "+  i+1 + "data:");
            System.out.println("Date (DD/MM/YYYY): ");
            String dataRecebida = sc.next();
            DateFormat df =  new SimpleDateFormat("dd/MM/yyyy");
            Date dt = df.parse(dataRecebida);
            System.out.println("Informe o valor da hora trabalhada: ");
            double valor = sc.nextDouble();
            System.out.println("Informe a quantidade de hora trabalhada: ");
            int duration = sc.nextInt();
            Contrato contrato =  new Contrato(dt, valor, duration);
            trabalhador.adicionarContrato(contrato);
        }
        System.out.println("Enter com o mes e ano: MM/YYYY ");
        String dataSolicitada = sc.next();
        int month = Integer.parseInt(dataSolicitada.substring(0, 2));
        int year = Integer.parseInt(dataSolicitada.substring(3));
        System.out.println("Name: "+trabalhador.getNome());
        System.out.println("Departamento: "+trabalhador.getDerp().getNome());
        System.out.println("Salario para: "+ dataSolicitada + ": " + String.format("%.2f",trabalhador.income(year, month)));
        
        
        
        
        
sc.close();
    }
}
