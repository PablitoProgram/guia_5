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
public class extra_1 {
    public static void main(String[] args){
    //Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario.
    Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamaño que quiere que tenga el vector");
    int n = leer.nextInt();
    int[] vector = new int [n];
    int suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese un numero a sumar");
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        System.out.println("la esultado de la suma es: " + suma);
    
    }
}
