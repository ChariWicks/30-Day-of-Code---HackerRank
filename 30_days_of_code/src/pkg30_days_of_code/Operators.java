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
public class Operators {
    
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;
        double total = tip + tax + mealCost;
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(total);
      
        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
    
}
