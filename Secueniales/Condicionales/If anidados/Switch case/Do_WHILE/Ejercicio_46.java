import java.util.Scanner;

public class Ejercicio_46 {
    public static void main(String[] args) {

        int M, K;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el valor de K: ");
        K = teclado.nextInt();
        System.out.print("Ingrese el valor de M: ");
        M = teclado.nextInt();

        do {
            int M1 = M--;
            int M2 = M -= 2;
            K++;

            System.out.println("valor de M1: " + M1);
            System.out.println("valor de M2: " + M2);
            System.out.println("valor de K: " + K);
        } while (K < M);
    }
}