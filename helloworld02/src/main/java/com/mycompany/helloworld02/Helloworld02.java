/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.helloworld02;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Helloworld02 {

    public static void main(String[] args) {
        System.out.println("INTRODUSCA EL PRIMER NUMERO: ");
        Scanner valor1 = new Scanner(System.in);
        int numero1=valor1.nextInt();
        System.out.println("INTRODUSCA EL SEGUNDO NUMERO: ");
        Scanner valor2 = new Scanner(System.in);
        int numero2=valor2.nextInt();
        
        int suma= numero1 + numero2;
        int resta= (numero1 - numero2);
        int multiplicacion= numero1 * numero2;
        double num1double = numero1;
        double num2double = numero2;
        double divicion= num1double / num2double;
        
        System.out.println("SUMA: " + suma);
        System.out.println("RESTA: " + resta);
        System.out.println("MULTIPLICACION: " + multiplicacion);
        System.out.println("DIVICION: " + divicion);
     
    }
    
}
