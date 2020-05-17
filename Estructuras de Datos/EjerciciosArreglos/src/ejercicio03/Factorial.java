package ejercicio03;

public class Factorial {

    public static void factorial() {
        double factorial = 1;
// El número elegido para el factorial es el 30
        double numero = 3;
        while (numero != 0) {
            factorial = factorial * numero;
            numero--;
        }

        System.out.println(factorial);
    }
}
