/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author C0516327
 */
public class Nurse extends Employee {

    /**
     * @param args the command line arguments
     */
    public final int SHIFT_A = 80000;
    public final int SHIFT_B = 85000;
    public final int SHIFT_C = 90000;
    private int shift;

    public Nurse(String _unit, String _givenName, String _surname) {
        super(_unit, _givenName, _surname);
        shift = SHIFT_A;
    }


    public void setShift(int shift) {
        this.shift = shift;
    }
    
    public int getShift() {
        if (shift == 1){
            return SHIFT_A;
	} 
	else if (shift == 2){
            return SHIFT_B;
        } 
	else if(shift == 3) {
            return SHIFT_C;
	}
        else 
            return SHIFT_A;
    }
    
    @Override
    public String toString() {
        return givenName + " " + surname + " " + "(ID# " +  ID + ") (" + unit + " unit shift " + getShift() + ")" ;
    }
    
}
