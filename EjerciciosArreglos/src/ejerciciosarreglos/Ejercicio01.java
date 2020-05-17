package ejerciciosarreglos;

import java.util.Scanner;
import java.util.*;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        // Contar el número de elementos positivos, negativos y ceros de un array de 10 elementos.

        int[] numeros = new int[10];
        int positivos = 0, negativos = 0, cero = 0; //contadores
        int i;

        //Leemos los valores por teclado y los guardamos en el array
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = en.nextInt();
        }
        //se recorre el array para contar positivos, negativos y ceros
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                positivos++;
            } else if (numeros[i] < 0) {
                negativos++;
            } else {
                cero++;
            }
        }
        // Resultados
        System.out.printf("\nPositivos: %d\nNegativos: %d\nCeros: %d\n", 
                positivos, negativos, cero);

    }
}
