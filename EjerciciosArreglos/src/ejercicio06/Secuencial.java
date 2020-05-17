package ejercicio06;

public class Secuencial {

    public int secuencial(int[] x, int elemento) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] == elemento) {
                return i;
            }

        }
        return -1;
    }

}
