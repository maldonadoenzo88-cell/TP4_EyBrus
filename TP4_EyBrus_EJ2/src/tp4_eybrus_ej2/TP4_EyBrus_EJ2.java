
package tp4_eybrus_ej2;

import java.util.Scanner;

public class TP4_EyBrus_EJ2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        int sumaPositivos = 0;
        int sumaNegativos = 0;

        int cantPositivos = 0;
        int cantNegativos = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print("Ingrese un número: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] > 0) {

                sumaPositivos = sumaPositivos + numeros[i];
                cantPositivos++;

            } else if (numeros[i] < 0) {

                sumaNegativos = sumaNegativos + numeros[i];
                cantNegativos++;
            }
        }

        double promedioPositivos = 0;
        double promedioNegativos = 0;

        if (cantPositivos > 0) {
            promedioPositivos = (double) sumaPositivos / cantPositivos;
        }

        if (cantNegativos > 0) {
            promedioNegativos = (double) sumaNegativos / cantNegativos;
        }

        System.out.println("Promedio positivos: " + promedioPositivos);
        System.out.println("Promedio negativos: " + promedioNegativos);

    }
    
}
