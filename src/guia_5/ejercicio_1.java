/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5;
/**
 *
 * @author User
 */
public class ejercicio_1 {
//Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        int[] vector = new int[100];
    
        for (int i = 0; i < 100 ; i++) {
            
           vector[i] = 100 - i;
            
            System.out.print("[" + vector[i] + "]");
            
            
        }
    
    }
 
}
