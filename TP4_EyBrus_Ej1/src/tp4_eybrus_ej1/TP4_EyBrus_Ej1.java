package tp4_eybrus_ej1;

import java.util.Scanner;

public class TP4_EyBrus_Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[7];

        
        for (int i = 0; i < 7; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = sc.nextInt();
        }

        
        int i = 0;

        while (i < 7) {
            System.out.println(numeros[i]);
            i++;
        }

    }
}

    
    
