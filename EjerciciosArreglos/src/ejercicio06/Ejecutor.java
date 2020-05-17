package ejercicio06;


public class Ejecutor {
    
    public void recorreDerecha(int[] x, int elemento,int pos){
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i+1];
        }
    }
}
