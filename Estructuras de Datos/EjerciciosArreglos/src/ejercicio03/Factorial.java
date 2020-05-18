package ejercicio03;

public class Factorial {

    public static void factorial() {
        int[] numeros = {5, 3, 1, 2};  //Array de 4 elementos
        int[] factorial = new int[4];
        int fac = 1;

        // El número elegidos para el factorial 
        for (int i = 0; i < numeros.length; i++) {
            while (numeros[i] != 0) {
                fac = fac * numeros[i];
                numeros[i]--;
                factorial[i] = fac;
            }
            fac = 1;
        }
        System.out.println(factorial[0]);
        System.out.println(factorial[1]);
        System.out.println(factorial[2]);
        System.out.println(factorial[3]);
    }
}
