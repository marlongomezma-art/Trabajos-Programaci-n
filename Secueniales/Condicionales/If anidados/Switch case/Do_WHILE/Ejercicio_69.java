package Ejercicio_59j;

public class Ejercicio_69 {

    public static void main(String[] args) {

        int numero = 2;
        int encontrados = 0;

        do {

            int divisor = 1;
            int sumaA = 0;

            do {

                if (numero % divisor == 0) {
                    sumaA += divisor;
                }

                divisor++;

            } while (divisor < numero);

            int B = sumaA;
            if (B > numero) {
                int divisorB = 1;
                int sumaB = 0;

                do {
                    if (B % divisorB == 0) {
                        sumaB += divisorB;
                    }
                    divisorB++;
                } while (divisorB < B);

                if (sumaB == numero) {
                    System.out.println("Par de números amigos: " + numero + " y " + B);
                    encontrados++;
                }
            }
            numero++;
        } while (encontrados < 5);
    }
}
