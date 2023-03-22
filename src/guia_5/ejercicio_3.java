/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5;

/**
 *Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 * @author User
 */
public class ejercicio_3 {
   public static void main(String[] args){
   
   int[] vector = new int[10000];
   int unDigito = 0;
   int dosDigito = 0;
   int tresDigito = 0;
   int cuatroDigito = 0;
   int cincoDigito = 0;
       for (int i = 0; i < 100000; i++) {
       if (i<10) {
               unDigito ++;
           }
       if ((i >= 10) && (i <100) ) {
               dosDigito ++;
           }
       if ((i >= 100) && (i <1000) ) {
               tresDigito ++;
           }
       if ((i >= 1000) && (i <10000) ) {
               cuatroDigito ++;
           }
       if ((i >= 10000) && (i <100000) ) {
               cincoDigito ++;
           }
       }
       System.out.println("numeros de un digito hay: " + unDigito + " de dos digitos hay: "  + dosDigito + " de tres digitos hay: "  + tresDigito + " de cuatro digitos hay: " + cuatroDigito +" y de cinco hay: " + cincoDigito );
      
   }
}
