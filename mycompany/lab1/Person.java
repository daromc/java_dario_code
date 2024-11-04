/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author C0516327
 */
public class Person {
    
    public int ID;  
    public String givenName;   
    public String surname;
    private static int counter = 0;
    
    public Person(String givenName, String surname) {
        this.givenName = givenName;
        this.surname = surname;
        counter = counter +1;
        this.ID += counter; 
    }

    @Override
    public String toString() {
        return givenName + " " + surname + " " + "(ID# " +  ID + ")";
    }
    
}
