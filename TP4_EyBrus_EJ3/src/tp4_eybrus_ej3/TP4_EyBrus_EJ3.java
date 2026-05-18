
package tp4_eybrus_ej3;

import java.util.Scanner;

public class TP4_EyBrus_EJ3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {

            System.out.print("Ingrese un número: ");
            numeros[i] = sc.nextInt();
        }

        int suma = 0;
        int cantidad = 0;

        for (int i = 0; i < 10; i = i + 2) {

            suma = suma + numeros[i];
            cantidad++;
        }

        double promedio = (double) suma / cantidad;

        System.out.println("Promedio: " + promedio);

    }
    
}
