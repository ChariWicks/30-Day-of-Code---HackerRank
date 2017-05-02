/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30_days_of_code;

import java.io.Console;
import java.util.Scanner;

/**
 *
 * @author CHARITHA
 */
//System;
//System.Collections.Generic;
//System.IO;
//System.Linq;
public class Loops {
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i = 1; i < 11; i++){
            System.out.println(n + " x " + i + "=" + (n*i));
        }
    }
    
}
