/*
 Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().

 */
package guia_5;


/**
 *
 * @author User
 */
import java.util.Scanner;
import java.util.Random;

public class extra_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        // Array para almacenar las palabras ingresadas por el usuario
        String[] palabras = new String[5];

        // Leer las palabras ingresadas por el usuario
       for (int i = 0; i < palabras.length; i++) {
            System.out.print("Ingrese la palabra " + (i+1) + " (entre 3 y 5 caracteres): ");
            palabras[i] = sc.next();
            // Verificar que la palabra tenga entre 3 y 5 caracteres
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.print("Palabra inválida. Ingrese la palabra " + (i+1) + " (entre 3 y 5 caracteres): ");
                palabras[i] = sc.next();
            }
        }

        // Elegir una fila aleatoria para ubicar las palabras
        int fila = rnd.nextInt(20);

        // Crear una matriz de caracteres para la sopa de letras
        char[][] sopa = new char[20][20];

        // Inicializar la sopa de letras con números aleatorios del 0 al 9
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j] = (char) (rnd.nextInt(10) + '0');
            }
        }

       
        // Ubicar las palabras en la fila elegida de manera horizontal
        
        int columna = rnd.nextInt(16); // La palabra más larga tiene 5 caracteres, por lo que se ubica en la columna 16 como máximo
        for (int i = 0; i < 5; i++) {
            String palabra = palabras[i];
            for (int j = 0; j < palabra.length(); j++) {
                sopa[fila][columna + j] = palabra.charAt(j);
            }
            columna += palabra.length() + 1; // Dejar un espacio entre las palabras
        }

        // Imprimir la sopa de letras por pantalla
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
}
   
