package Ejercicio_59j;

public class Ejercicio_68 {

    public static void main(String[] args) {

        int numero = 1;
        int encontrados = 0;

        do {

            int divisor = 1;
            int sumaDivisores = 0;

            do {

                if (numero % divisor == 0) {
                    sumaDivisores += divisor;
                }

                divisor++;

            } while (divisor < numero);

            if (sumaDivisores == numero) {
                System.out.println("Número perfecto: " + numero);
                encontrados++;
            }

            numero++;

        } while (encontrados < 3);
    }
}