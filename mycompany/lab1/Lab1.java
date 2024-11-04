/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab1;

/**
 *
 * @author C0516327
 */
public class Lab1 {

    public static void main(String[] args) {
        
        //1. create 3 nurses in different shifts.
	
	Nurse nurse_1 = new Nurse("Emergency", "Ana", "Smith");
	Nurse nurse_2 = new Nurse("Radiology", "Maria ", "Brooks");
	Nurse nurse_3 = new Nurse("HR", "Diana", "Ramos");
	
	nurse_1.setShift(1);
	nurse_2.setShift(2);
	nurse_3.setShift(3);
        
        //2. create 3 doctors         
        Doctor doc_1 = new Doctor("Family", "Neurologist", "Jose", "Smith");
        Doctor doc_2 = new Doctor("Family", "General", "Juan", "Romo");
        Doctor doc_3 = new Doctor("Family", "Podologyst", "Jordan", "Brown");
        
        //3. Create 3 patient
        Patient patient_1 = new Patient(doc_1, "Emerson", "Martin");
        Patient patient_2 = new Patient(doc_2,  "Remi", "Lee");
        Patient patient_3 = new Patient(doc_3,  "Aly", "Tylor");
        
        
        //4. Create 20 patient from random generate names 
        
        String[] givenNames = {
            "Avery", "Riley", "Jordan", "Angel", "Peyton",
            "Quinn", "Hayden", "Taylor", "Alexis", "Rowan",
            "Charlie", "Emerson", "Finley", "River", "Emery",
            "Morgan", "Elliot", "London", "Eden", "Elliott",
            "Karter", "Dakota", "Reese", "Remington", "Payton",
            "Amari", "Phoenix", "Kendall", "Harley", "Rylan",
            "Marley", "Dallas", "Skyler", "Spencer", "Sage",
            "Kyrie", "Ellis", "Rory", "Remi", "Justice",
            "Ali", "Haven", "Tatum", "Arden", "Linden",
            "Devon", "Rebel", "Rio", "Ripley", "Frankie"
        };
        String[] surnames = {
            "Smith", "Brown", "Tremblay", "Martin", "Roy",
            "Wilson", "Macdonald", "Gagnon", "Johnson", "Taylor",
            "Cote", "Campbell", "Anderson", "Leblanc", "Lee",
            "Jones", "White", "Williams", "Miller", "Thompson",
            "Gauthier", "Young", "Van", "Morin", "Bouchard",
            "Scott", "Stewart", "Belanger", "Reid", "Pelletier",
            "Moore", "Lavoie", "King", "Robinson", "Levesque",
            "Murphy", "Fortin", "Gagne", "Wong", "Clark",
            "Johnston", "Clarke", "Ross", "Walker", "Thomas",
            "Boucher", "Landry", "Kelly", "Bergeron", "Davis"
        };
        
        for(int counter = 0; counter < 20 ; counter++ ){
            
        
        }
        //System.out.println(d1.toString());
        
        //Patient patient_1 = new Patient(d1, "Oscar", "Fernandez"); 
        //System.out.println(patient_1.toString());
        //System.out.println(patient_1.physician.givenName);
    }
}
