/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author C0516327
 */
public class Employee extends Person {

   public String unit;
   protected int anualySalary;

    public Employee(String unit, String givenName, String surname) {
        super(givenName, surname);
        this.unit = unit;
    }
   
   	
    public int getanualySalary(){
	return 80000;
    }
   
   
}
