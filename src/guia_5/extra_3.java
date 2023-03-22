/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5;

import java.util.Random;

/**
 *
 * @author User
 */
public class extra_3 {

    //Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. Después haremos otra función o procedimiento que imprima el vector.



    public static void main(String[] args) {
        int[] vector = new int[10]; // Creamos un vector de tamaño 10
        llenarVectorAleatorio(vector); // Llamamos a la función para rellenar el vector
        imprimirVector(vector); // Llamamos a la función para imprimir el vector
    }

    public static void llenarVectorAleatorio(int[] vector) {
        Random random = new Random(); // Creamos un objeto de tipo Random para generar números aleatorios
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100); // Generamos un número aleatorio entre 0 y 99 y lo asignamos en la posición i del vector
        }
    }

    public static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " "); // Imprimimos el valor en la posición i del vector seguido de un espacio en blanco
        }
    }
}


 


