import java.util.Scanner;

public class Ejercicio_56 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int valor = 0;
        int resultado = 0;

        System.out.println("Ingrese el numero a dividir: ");
        valor = teclado.nextInt();

        do {

            resultado++;
            valor -= 2;

            System.out.println("Numero en division: " + valor);

        } while (valor - 2 >= 0);

        System.out.println("La division es: " + resultado);
    }
}