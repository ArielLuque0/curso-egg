/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author imaginario
 */
public class Ejercicio2 {

    /**
     * 2 Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
    El programa deberá después mostrar el resultado de la suma
     * @param args the command line arguments
     */
    
 
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1,numero2,suma;
         Scanner leer = new Scanner(System.in);
       
        System.out.println("ingrese numero 1");
        numero1 =  leer.nextInt () ;
        
         
        System.out.println("ingrese numero 2");
        numero2 = leer.nextInt () ;
        
        suma=numero1+numero2;
        System.out.println("el resultado de la suma es: "+suma);
        
    }
    
}
