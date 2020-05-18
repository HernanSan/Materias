package ejercicio01;


import static ejercicio01.Suma.Matriz;
import static ejercicio01.Suma.col;
import static ejercicio01.Suma.filas;
import javax.swing.JOptionPane;

/*
EJERCICIO 1: CREAR UNA MATRIZ DE N X M , MOSTRAR LA SUMA DE CADA FILA Y DE CADA COLUMNA
 */

public class Ejecutor {

    public static void main(String[] args) {
            //Pedimos al usuario que ingrese el numero de filas 
        filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "
                + "de filas"));
        col = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de "
                + "Columnas"));

        //creamos la matriz con los datos que nos dió el usuario
        Matriz = new int[filas][col];
        //Pediremos al usuario que llene la matriz con los números que desee
        for (int i = 0; i < filas; i++) {
            for (int x = 0; x < col; x++) {
                Matriz[i][x] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese"
                        + " el numero de la posicion [" + i + "][" + x + "]"));
            }
        }
        Suma.suma();
    }
}
