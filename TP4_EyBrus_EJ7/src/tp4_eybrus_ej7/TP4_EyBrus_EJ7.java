
package tp4_eybrus_ej7;

public class TP4_EyBrus_EJ7 {

    public static void main(String[] args) {
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {

            numeros[i] = (int)(Math.random() * 100);
        }

        System.out.println("Números:");

        for (int i = 0; i < 10; i++) {

            System.out.println(numeros[i]);
        }

    }
    
}
