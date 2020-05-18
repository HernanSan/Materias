package ejercicio02;

import java.util.Scanner;

public class Operaciones {
    public static int i, lim;
    public static int[] numeros = new int[lim];

    public static void operaciones() {
         Scanner sc = new Scanner(System.in);
        System.out.println("Lectura de los elementos del array: ");
        int[] numeros = new int[lim];
        for (i = 0; i < numeros.length; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = sc.nextInt();
        }   
        
        //se recorre el array para contar positivos, negativos y ceros
        int pos = 0, neg = 0, cero = 0; //contadores
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                pos++;
            } else if (numeros[i] < 0) {
                neg++;
            } else {
                cero++;
            }
        }    
         //mostrar resultados
        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + cero);

    }

}
