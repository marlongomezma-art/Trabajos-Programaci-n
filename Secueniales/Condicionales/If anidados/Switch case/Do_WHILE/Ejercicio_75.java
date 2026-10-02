package Ejercicio_59j;

import java.util.Scanner;

public class Ejercicio_75 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int persona = 1;

        do {

            System.out.println("\n========== PERSONA #" + persona + " ==========");
            System.out.println("Ingrese el peso de la última reunión:");
            double pesoAnterior = teclado.nextDouble();
            int bascula = 1;
            double sumaPesos = 0;

            do {

                System.out.println("Ingrese el peso de la báscula #" + bascula + ":");
                double pesoActual = teclado.nextDouble();
                sumaPesos += pesoActual;
                bascula++;

            } while (bascula <= 10);

            double promedioPeso = sumaPesos / 10;

            double diferencia = promedioPeso - pesoAnterior;

            System.out.println("\nPromedio de peso: " + promedioPeso);

            if (diferencia > 0) {
                System.out.println("SUBIÓ " + diferencia + " kg");

            } else if (diferencia < 0) {
                System.out.println("BAJÓ " + Math.abs(diferencia) + " kg");

            } else {
                System.out.println("MANTUVO EL MISMO PESO");
            }
            persona++;

        } while (persona <= 5);
    }
}
