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
public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
        if(initialAge < 0){
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }else{
            age = initialAge;
        }
	}

	public void amIOld() {
        if(age < 13){
            System.out.println("You are young.");
        }else if(age >= 13 && age < 18){
            System.out.println("You are a teenager.");
        }else{
            // Write code determining if this person's age is old and print the correct statement:
            System.out.println("You are old.");
        }
  		
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
			Person p = new Person(age);
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


    

