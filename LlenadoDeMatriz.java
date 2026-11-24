
package llenadodematriz;

import java.util.Scanner;
/**
 *
 * @author Angelica Alexandra Alvarado Pallaroso
 */

public class LlenadoDeMatriz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][4];

        // Ingresar los datos
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.print("Ingrese el numero de la fila "
                        + i + " columna " + j + ": ");

                matriz[i][j] = entrada.nextInt();

            }
        }

        // Mostrar la matriz
        System.out.println("\nMATRIZ INGRESADA:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.print(matriz[i][j] + "\t");

            }

            System.out.println();

        }

    }
}