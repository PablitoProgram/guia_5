/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class extra_2 {
    public static void main(String[] args){
    //Escriba un programa que averigüe si dos vectores de N enteros son iguales (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
    Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamaño");
        
    int n = leer.nextInt();
    
    int[] vector1 = new int[n];
    int[] vector2 = new int[n];
    boolean comp = true;
        for (int i = 0; i < n; i++) {
            vector1[i] = i;
         
            vector2[i] = i;  
            
            if (vector1[i] != vector2[i] ) {
                comp = false;
                break;
            }else
                System.out.println("vector 1 " + i + " vector 2 " + i);
        }
    }
}
