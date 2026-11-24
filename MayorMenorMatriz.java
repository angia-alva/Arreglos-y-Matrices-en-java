
package mayormenormatriz;

import java.util.Scanner;

/**
 *
 * @author Angelica Alexandra Alvarado Pallaroso
 */
public class MayorMenorMatriz {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        int mayor, menor;

      
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.print("Ingrese un numero para fila "
                        + i + " columna " + j + ": ");

                matriz[i][j] = entrada.nextInt();

            }
        }

     
        mayor = matriz[0][0];
        menor = matriz[0][0];

        
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                if (matriz[i][j] > mayor) {

                    mayor = matriz[i][j];

                }

                if (matriz[i][j] < menor) {

                    menor = matriz[i][j];

                }

            }
        }

      
        System.out.println("\nMATRIZ INGRESADA:");

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.print(matriz[i][j] + "\t");

            }

            System.out.println();

        }

       
        System.out.println("\nEl mayor valor es: " + mayor);
        System.out.println("El menor valor es: " + menor);

    }
}
   