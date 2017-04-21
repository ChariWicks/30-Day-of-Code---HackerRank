/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30_days_of_code;

/**
 *
 * @author CHARITHA
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Conditional_statements {
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
      String ans="";
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(n%2==1){
         ans = "Weird";
      }
      else{
         // Complete the code 
          if(n >=2 && n <=5 ){
              ans = "Not Weired";
          }
          if(n >= 6 &&  n<=20 ){
              ans = "Weired";
          }
          if(n > 20){
              ans = "Not Weired";
          }
      }
      System.out.println(ans);
   }
}
