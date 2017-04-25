/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30_days_of_code;

import java.util.Scanner;

/**
 *
 * @author CHARITHA
 */
public class ClassesInstances {
    private int age;	
  
	public ClassesInstances(int initialAge) {
  		// Add some more code to run some checks on initialAge
            
        if(initialAge > 0){
            age = initialAge;
        }else{
            age = 0;
            System.out.println("print Age is not valid");
        }
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
            
        if(age < 13){
            System.out.println("You are young.");
        }
        if(age >= 13 && age < 18){
            System.out.println("You are a teenager.");
        }
        if(age >= 18){
            System.out.println("You are old.");
        }
        //System.out.println(/*Insert correct print statement here*/);
        //System.out.println(age);

	}

	public void yearPasses() {
  		// Increment this person's age.
            age++;
	}
        
        public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			ClassesInstances p = new ClassesInstances(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}

    

