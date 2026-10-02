package Ejercicio_59j;

import java.util.Scanner;

public class Ejercicio_61 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero1;
        int numero2;
        int resultado = 0;

        System.out.println("Ingrese el primer número:");
        numero1 = teclado.nextInt();

        System.out.println("Ingrese el segundo número:");
        numero2 = teclado.nextInt();

        do {

            if (numero1 % 2 != 0) {
                resultado += numero2;
            }

            numero1 /= 2;
            numero2 *= 2;

        } while (numero1 >= 1);

        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}
