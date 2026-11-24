
package arreglomayormenor;

import java.util.Scanner;

/**
 *
 * @author Angelica Alexandra Alvarado Pallaroso
 */
public class ArregloMayorMenor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[15];

        int mayor, menor;
        int posicionMayor = 0;
        int posicionMenor = 0;

        
        for (int i = 0; i < 15; i++) {

            System.out.print("Ingrese un numero: ");
            numeros[i] = entrada.nextInt();

        }

       
        mayor = numeros[0];
        menor = numeros[0];

        
        for (int i = 0; i < 15; i++) {

            if (numeros[i] > mayor) {

                mayor = numeros[i];
                posicionMayor = i;

            }

            if (numeros[i] < menor) {

                menor = numeros[i];
                posicionMenor = i;

            }

        }

        
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Posicion del mayor: " + posicionMayor);

        System.out.println("Numero menor: " + menor);
        System.out.println("Posicion del menor: " + posicionMenor);

    }
}
    