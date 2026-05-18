
package tp4_eybrus_ej9;

import java.util.Scanner;

public class TP4_Eybrus_EJ9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] pagos = new boolean[10];

        int pagosRealizados = 0;
        int deudores = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print("¿Pagó el alumno? (true/false): ");
            pagos[i] = sc.nextBoolean();

            if (pagos[i] == true) {

                pagosRealizados++;

            } else {

                deudores++;
            }
        }

        double porcentaje = (pagosRealizados * 100) / 10.0;

        System.out.println("Cantidad de pagos: " + pagosRealizados);
        System.out.println("Cantidad de deudores: " + deudores);
        System.out.println("Porcentaje de cobranza: " + porcentaje + "%");

    }
    
}
