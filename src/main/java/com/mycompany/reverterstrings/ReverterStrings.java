/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reverterstrings;

import java.util.Scanner;

/**
 *
 * @author 55619
 */
public class ReverterStrings {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite uma palavra para inverter: ");
        String palavra = sc.nextLine();
        
        String reversedString = "";
        
        for (int i = palavra.length() - 1; i >= 0; i--) {
            reversedString += palavra.charAt(i);
        }
        
        System.out.println("Palavra invertida: " + reversedString);
        
        sc.close();
    }
}
