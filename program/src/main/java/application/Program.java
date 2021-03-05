/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import Entitis.Ordem;
import ententues.enums.OrdemService;
import java.util.Date;

/**
 *
 * @author davi nicollas
 */
public class Program {

    public static void main(String[] args) {

        Ordem ord = new Ordem(1080, new Date(), OrdemService.PENDING_PAYMENT);

        System.out.println(ord);

        OrdemService os1 = OrdemService.DELIVERED;
        OrdemService os2 = OrdemService.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
