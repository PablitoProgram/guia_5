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
public class ejercicio_6 {
    public static void main(String[] args){
    //Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.
   Scanner leer = new Scanner(System.in);
        int[][] cuadrado = new int[3][3];

        // Pedir al usuario que ingrese los números
        System.out.println("Ingrese los números del cuadrado mágico:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Verificar que el número ingresado es válido
                int num;
                do {
                    System.out.print("Fila " + (i+1) + ", columna " + (j+1) + ": ");
                    num = leer.nextInt();
                } while (num < 1 || num > 9);

                cuadrado[i][j] = num;
            }
        }

        // Calcular la suma de las filas, columnas y diagonales
        int suma = 0;
        boolean esMagico = true;

        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;
            int sumaColumna = 0;

            for (int j = 0; j < 3; j++) {
                sumaFila += cuadrado[i][j];
                sumaColumna += cuadrado[j][i];
            }

            // Verificar si las filas y columnas tienen la misma suma
            if (i == 0) {
                suma = sumaFila;
            } else {
                if (sumaFila != suma || sumaColumna != suma) {
                    esMagico = false;
                    break;
                }
            }
        }

        // Verificar si las diagonales tienen la misma suma
        int diagonal1 = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2];
        int diagonal2 = cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0];

        if (diagonal1 != suma || diagonal2 != suma) {
            esMagico = false;
        }

        // Mostrar el resultado
        if (esMagico) {
            System.out.println("El cuadrado es mágico.");
        } else {
            System.out.println("El cuadrado no es mágico.");
        }
    }

}
