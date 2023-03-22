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
public class ejercicio_4 {
    public static void main(String[] args){
     int [] [] matrizA = new int [4][4];
        
     for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 4; j++) {
            matrizA[i][j] = (int) (Math.random() * 100);
            
         }
    
        }
        System.out.println("Matriz original");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("matriz inversa");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizA[j][i] + " ");
            }
            System.out.println(" ");
        }
    }

    }

