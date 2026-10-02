import java.util.Scanner;

public class Ejercicio_32 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int p, q;
        double resultado;

        System.out.println("Digite el valor de P:");
        p = teclado.nextInt();

        System.out.println("Digite el valor de Q:");
        q = teclado.nextInt();


        resultado = (p * p * p) + (q * q * q * q) - (2 * p * p);

        if (resultado > 680) {
            System.out.println("Los valores de P y Q son verdaderas.");
            System.out.println("P = " + p);
            System.out.println("Q = " + q);
        } else {
            System.out.println("Los valores de P y Q son falsas");
        }

    }
}
