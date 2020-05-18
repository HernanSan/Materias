package ejercicio02;

import static ejercicio02.Operaciones.i;
import static ejercicio02.Operaciones.numeros;
import static ejercicio02.Operaciones.lim;
import java.util.Scanner;

/**
 * Calcular  el  número  de  elementos  negativos,  cero  y  positivos  de  un  
 * vector  dado  de  n elementos. 
 */
public class Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        //Leemos los valores por teclado y los guardamos en el array
        System.out.println("¿Cuantos numeros decea ingresar?");
        lim = sc.nextInt();
        Operaciones.operaciones();
   
    }
}
