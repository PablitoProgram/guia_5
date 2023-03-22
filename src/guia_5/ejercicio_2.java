/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5;
//Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector. El programa mostrará dónde se encuentra el numero y si se encuentra repetido

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ejercicio_2 {
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño que desea que tenga el vector");
       int n = leer.nextInt();
        
       int[] vector = new int[n];
       
        for (int i = 0; i < n; i++) {
            
           vector[i] = (int) (Math.random() * 10);
           
        }
        
        //Buscar el numero x en el vector
        System.out.println("Ingrese el numero que quiere buscar 0 al 10");
        int buscarNumero = leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (vector[i] == buscarNumero) {
                System.out.println("el numero " + buscarNumero + " se encuetra en el vector [" + i + "]");
            }
        }
    }
}
