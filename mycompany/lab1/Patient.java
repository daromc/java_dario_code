/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author C0516327
 */
public class Patient extends Person{
    
    public Doctor physician;

    public Patient(Doctor physician, String givenName, String surname) {
        super(givenName, surname);
        this.physician = physician;
    }
    
    
    /**
     * @param args the command line arguments
     */
    
    
}
