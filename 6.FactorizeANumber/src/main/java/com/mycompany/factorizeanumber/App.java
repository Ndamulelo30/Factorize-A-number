/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorizeanumber;

/**
 *
 * @author Sanele
 */
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        
        System.out.println("Prime factors of " + number + " are:");
        factorizeAndPrint(number);
        
        scanner.close();
    }
     public static void factorizeAndPrint(int n) {
        // Print the number of 2s that divide n
        while (n % 2 == 0) {
            System.out.print("2 ");
            n /= 2;
        }
        
        // n must be odd at this point. So we can skip one element (i = i + 2)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // While i divides n, print i and divide n
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        
        // If n is a prime number greater than 2
        if (n > 2) {
            System.out.print(n);
        }
    }
}
