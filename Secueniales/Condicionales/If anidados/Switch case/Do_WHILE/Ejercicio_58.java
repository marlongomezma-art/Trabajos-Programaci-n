import java.util.Scanner;

public class Ejercicio_58 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double dinero;
        double porcentaje;
        double ganancia;
        int semanas;
        int contador = 0;

        System.out.println("Ingrese el capital: ");
        dinero = teclado.nextDouble();

        System.out.println("Ingrese el interes: ");
        porcentaje = teclado.nextDouble();

        System.out.println("Ingrese las semanas: ");
        semanas = teclado.nextInt();

        int dias = semanas * 7;
        double interesDecimal = porcentaje / 100;

        do {

            contador++;

            ganancia = (interesDecimal * dinero) / 365;

            dinero += ganancia;

        } while (contador <= dias);

        System.out.println("El capital tuvo una ganancia de: " + dinero);
    }
}