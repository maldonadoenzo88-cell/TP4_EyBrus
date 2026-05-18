
package tp4_eybrus_ej5;

public class TP4_Eybrus_EJ5 {

    public static void main(String[] args) {
        int[] pares = new int[20];

        int numero = 2;

        for (int i = 0; i < 20; i++) {

            pares[i] = numero;
            numero = numero + 2;
        }

        for (int i = 0; i < 20; i++) {

            System.out.println(pares[i]);
        }

    }
    
}
