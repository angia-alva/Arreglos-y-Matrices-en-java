
package arreglodesumapromedio;

import java.util.Scanner;

/**
 *
 * @author Angelica Alexandra Alvarado Pallaroso
 */
public class ArregloDeSumaPromedio {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

        double[] numeros = new double[10];

        double suma = 0;
        double promedio;

        
        for (int i = 0; i < 10; i++) {

            System.out.print("Ingrese un numero: ");
            numeros[i] = entrada.nextDouble();

            suma = suma + numeros[i];

        }

        
        promedio = suma / 10;

        
        System.out.println("La suma total es: " + suma);
        System.out.println("El promedio es: " + promedio);

    }
}
