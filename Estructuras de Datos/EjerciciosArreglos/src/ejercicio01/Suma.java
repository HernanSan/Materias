package ejercicio01;

import javax.swing.JOptionPane;

public class Suma {

    public static void suma() {

        //Declaramos las variables
        int filas, col;
        int Matriz[][];
        int sumaFilas = 0; 
        int sumaCol = 0;

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

//Sumaremos los numeros de las filas
       
        String cadena1 = "", cadena2 = "";

        for (int i = 0; i < filas; i++) {
            for (int x = 0; x < col; x++) {
                if (x < col) {
                     sumaFilas += Matriz[i][x]; 
                }
            }
            int[] sumaF = new int[sumaFilas];
            cadena1 += " La suma Fila " + (i + 1) + " = " + sumaFilas + "\n ";
            sumaFilas = 0;
        }

//Ahora sumamos los números de las columnas
        for (int i = 0; i < col; i++) {
            for (int x = 0; x < filas; x++) {
                if (x < filas) {
                    sumaCol += Matriz[x][i];
                    
                     int[] sumaC = new int[sumaCol];
                }
            }

            cadena2 += "Columna " + (i + 1) + " = " + sumaCol + "\n";
            sumaCol = 0;
        }
        JOptionPane.showMessageDialog(null, "La suma es: \n " + cadena1 + cadena2);
    }
}
