/* 
  Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
 
*/
package guia_5;

import java.util.Scanner;


public class extra_4 {

    public static void main(String[] args) {
        String[][] alumnos = {
            {"Alumno 1", "8", "7", "9", "10"},
            {"Alumno 2", "6", "5", "8", "7"},
            {"Alumno 3", "9", "8", "7", "9"},
            {"Alumno 4", "10", "10", "10", "10"},
            {"Alumno 5", "7", "6", "8", "9"},
            {"Alumno 6", "5", "6", "7", "8"},
            {"Alumno 7", "9", "9", "8", "7"},
            {"Alumno 8", "7", "8", "7", "9"},
            {"Alumno 9", "8", "7", "6", "5"},
            {"Alumno 10", "6", "7", "8", "9"}
        };
        
        imprimirMatriz(alumnos);
        calcularPromedios(alumnos);
    }
    
    public static void imprimirMatriz(String[][] matriz) {
        for (String[] matriz1 : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void calcularPromedios(String[][] matriz) {
        for (String[] matriz1 : matriz) {
            int nota1 = Integer.parseInt(matriz1[1]);
            int nota2 = Integer.parseInt(matriz1[2]);
            int nota3 = Integer.parseInt(matriz1[3]);
            int nota4 = Integer.parseInt(matriz1[4]);
            double promedio = (nota1 * 0.1) + (nota2 * 0.15) + (nota3 * 0.25) + (nota4 * 0.5);
            System.out.println(matriz1[0] + " - Promedio: " + promedio);
        }
    }
}
