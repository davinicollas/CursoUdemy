/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Comments;
import entities.Post;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author davi nicollas
 */
public class application {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Scanner sc = new Scanner(System.in);
        Comments c1 = new Comments("Have a nice trip!");
        Comments c2 = new Comments("Wow that's awesome!");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!", 12);

        p1.addComment(c1);
        p1.addComment(c2);

        Comments c3 = new Comments("Good night");
        Comments c4 = new Comments("May the Force be with you");
        Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "see you tomorrow", 5);

        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}
