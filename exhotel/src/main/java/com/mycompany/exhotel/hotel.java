/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exhotel;

/**
 *
 * @author davi nicollas
 */
public class hotel {
    private String name;
    private String email;

    public hotel(String name, String email) {
        this.name = name;
        this.email = email;
       
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String toString(){
        return name  + " , " + email;
    }
    
    
}
