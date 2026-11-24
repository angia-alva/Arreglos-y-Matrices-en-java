
package sumaelementosmatriz;

import java.util.Scanner;

/**
 *
 * @author Angelica Alexandra Alvarado Pallaroso
 */
public class SumaElementosMatriz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        int suma = 0;

        // Ingresar los datos
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.print("Ingrese un numero para fila "
                        + i + " columna " + j + ": ");

                matriz[i][j] = entrada.nextInt();

                suma = suma + matriz[i][j];

            }
        }

        // Mostrar la matriz
        System.out.println("\nMATRIZ INGRESADA:");

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.print(matriz[i][j] + "\t");

            }

            System.out.println();

        }

        // Mostrar la suma
        System.out.println("\nLa suma total es: " + suma);

    }
}