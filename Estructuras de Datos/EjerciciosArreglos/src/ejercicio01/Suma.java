package ejercicio01;

import javax.swing.JOptionPane;

public class Suma {

    //Declaramos las variables
    public static int filas, col;
    public static int Matriz[][];
    public static int sumaFilas = 0;
    public static int sumaCol = 0;

    public static void suma() {    //Declaramos las variables

        //Sumaremos los numeros de las filas
        String cadena1 = "", cadena2 = "";

        for (int i = 0; i < filas; i++) {
            for (int x = 0; x < col; x++) {
                if (x < col) {
                    sumaFilas += Matriz[i][x];
                }
            }

            cadena1 += " La suma Fila " + (i + 1) + " = " + sumaFilas + "\n ";
            sumaFilas = 0;
        }

        System.out.println("");
        //Ahora sumamos los números de las columnas
        for (int i = 0; i < col; i++) {
            for (int x = 0; x < filas; x++) {
                if (x < filas) {
                    sumaCol += Matriz[x][i];
                }
            }

            cadena2 += "Columna " + (i + 1) + " = " + sumaCol + "\n";
            sumaCol = 0;
        }
        JOptionPane.showMessageDialog(null, "La suma es: \n " + cadena1 + cadena2);
    }
}
