package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Map<String, String>cookies = new TreeMap<>();
        cookies.put("userName","Maria");
        cookies.put("email","maria@gmail.com");
        cookies.put("phone", "99711122");

        cookies.remove("email");
        cookies.put("phone", "25252525");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number " + cookies.get("phone"));
        System.out.println("email: " + cookies.get("email"));
        System.out.println("Size" +cookies.size() );
        System.out.println("All Cookies: ");
        for (String key : cookies.keySet()){
            System.out.println(key + " : " + cookies.get(key));
        }
    }
}
