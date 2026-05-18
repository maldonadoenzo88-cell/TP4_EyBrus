package tp4_eybrus_ej10;

import java.util.Random;

public class TP4_EyBrus_EJ10 {

    public static void main(String[] args) {
         int[] numeros = rellenarArray(1, 20, 10);

        for (int i = 0; i < 10; i++) {

            System.out.println(numeros[i]);
        }
    }

    public static int[] rellenarArray(int desde, int hasta, int tamanio) {

        Random random = new Random();

        int[] array = new int[tamanio];

        for (int i = 0; i < tamanio; i++) {

            int numero;

            do {

                numero = random.nextInt(desde, hasta + 1);
            } while (comprobarSiContiene(array, i, numero));

            array[i] = numero;
        }

        return array;
    }

    public static boolean comprobarSiContiene(int[] array, int posicion, int numero) {

        for (int i = 0; i < posicion; i++) {

            if (array[i] == numero) {

                return true;
            }
        }

        return false;

    }
    
}
