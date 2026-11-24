
package matrizmodificada;

import java.util.Scanner;

/**
 *
 * @author Angelica Alexandra Alvarado Pallaroso
 */
public class MatrizModificada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][5];

        int numero;

     
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.print("Ingrese un numero para fila "
                        + i + " columna " + j + ": ");

                numero = entrada.nextInt();

                matriz[i][j] = numero + (i * j);

            }
        }

        
        System.out.println("\nMATRIZ MODIFICADA:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.print(matriz[i][j] + "\t");

            }

            System.out.println();

        }

    }
}