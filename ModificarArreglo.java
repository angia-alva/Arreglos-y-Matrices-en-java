
package modificararreglo;

import java.util.Scanner;

/**
 *
 * @author Angelica Alexandra Alvarado Pallaroso
 */
public class ModificarArreglo {

    static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[12];

        int numero;

        
        for (int i = 0; i < 12; i++) {

            System.out.print("Ingrese un numero positivo: ");
            numero = entrada.nextInt();

            while (numero <= 0) {

                System.out.print("Ingrese un numero positivo: ");
                numero = entrada.nextInt();

            }

            numeros[i] = numero + i;

        }

        
        System.out.println("Arreglo modificado:");

        for (int i = 0; i < 12; i++) {

            System.out.println("Posicion " + i + ": " + numeros[i]);

        }

    }
}
