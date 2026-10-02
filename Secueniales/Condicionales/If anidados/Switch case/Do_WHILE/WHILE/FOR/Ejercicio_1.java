import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {

        int N, K;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el valor de K: ");
        K = teclado.nextInt();

        System.out.println("Ingrese el valor de N: ");
        N = teclado.nextInt();

        for (K = 0; K < N; K++) {
            int N1 = N--;
            int N2 = N -= 2;
            System.out.println("valor de N1: " + N1);
            System.out.println("valor de N2: " + N2);
        }
    }
}
