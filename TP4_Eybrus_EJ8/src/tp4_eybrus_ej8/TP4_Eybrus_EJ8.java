package tp4_eybrus_ej8;

import java.util.Scanner;

public class TP4_Eybrus_EJ8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nombres = new String[20];
        double[] sueldos = new double[20];

        for (int i = 0; i < 20; i++) {

            System.out.print("Nombre: ");
            nombres[i] = sc.next();

            System.out.print("Sueldo: ");
            sueldos[i] = sc.nextDouble();
        }

        double mayorSueldo = sueldos[0];
        String nombreMayor = nombres[0];

        for (int i = 1; i < 20; i++) {

            if (sueldos[i] > mayorSueldo) {

                mayorSueldo = sueldos[i];
                nombreMayor = nombres[i];
            }
        }

        System.out.println("Empleado que más gana: " + nombreMayor);
        System.out.println("Sueldo: " + mayorSueldo);

    }
    
}
