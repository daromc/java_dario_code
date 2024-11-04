/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author C0516327
 */
public class Doctor extends Employee{
	
	//attributes
	
    public String specialty;

    public Doctor(String specialty, String unit, String givenName, String surname) {
        super(unit, givenName, surname);
        this.specialty = specialty;
    }

    /**
     * @param args the command line arguments
     */
   
    public int getanualySalary(){
	return 250000;
    }
    
     @Override
    public String toString() {
        return "Dr. "+givenName + " " + surname + " " + "(ID# " +  ID + ") (" + unit + ")  (" + specialty + ")" ;
    }
}
