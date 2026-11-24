
package diagonalprincipal;

import java.util.Scanner;

/**
 *
 * @author Angelica Alexandra Alvarado Pallaroso
 */
public class DiagonalPrincipal {

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

            }
        }

        // Mostrar la matriz completa
        System.out.println("\nMATRIZ INGRESADA:");

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.print(matriz[i][j] + "\t");

            }

            System.out.println();

        }

        // Mostrar diagonal principal
        System.out.println("\nDIAGONAL PRINCIPAL:");

        for (int i = 0; i < 4; i++) {

            System.out.println(matriz[i][i]);

            suma = suma + matriz[i][i];

        }

        // Mostrar suma
        System.out.println("\nLa suma de la diagonal es: " + suma);

    }
}
