
package ingresovisualizacion;

import java.util.Scanner;

/**
 *
 * @author Angelica Alexandra Alvarado Pallaroso
 */
public class IngresoVisualizacion {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {

            System.out.print("Ingrese un numero: ");
            numeros[i] = entrada.nextInt();

        }
        System.out.println("Numeros almacenados:");

        for (int i = 0; i < 10; i++) {

            System.out.println("Posicion " + i + ": " + numeros[i]);

        }

    }
}
