import java.util.Scanner;

public class Ejercicio_57 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double numero;
        double aproximacion = 0.1;
        double raiz;
        double error;

        do {

            System.out.println("Ingrese un numero positivo:");
            numero = teclado.nextDouble();

        } while (numero <= 0);

        do {

            raiz = (aproximacion + numero / aproximacion) / 2;

            error = Math.abs(aproximacion - raiz);

            aproximacion = raiz;

        } while (error >= 0.000001);

        System.out.println("La raiz cuadrada de " + numero + " es: " + raiz);
    }
}
