
package tp4_eybrus_ej4;

import java.util.Scanner;

public class TP4_EyBrus_EJ4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de alumnos: ");
        int cantidad = sc.nextInt();

        double[] notas = new double[cantidad];

         
        for (int i = 0; i < cantidad; i++) {

            System.out.print("Nota del alumno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

         
        double suma = 0;

        for (int i = 0; i < cantidad; i++) {

            suma = suma + notas[i];
        }

        double promedio = suma / cantidad;

        System.out.println("Promedio: " + promedio);

         
        System.out.println("Notas mayores al promedio:");

        for (int i = 0; i < cantidad; i++) {

            if (notas[i] > promedio) {

                System.out.println(notas[i]);
            }
        }

    }
    
}
