package Ejercicio_59j;

public class Ejercicio_64 {

    public static void main(String[] args) {

        double total = 0;
        double valor = 1;
        int contador = 0;

        do {

            if (total + valor <= 1.99) {
                total += valor;
                contador++;
            }

            valor /= 2;

        } while (total + valor <= 1.99);

        System.out.println("Número de términos: " + contador);
        System.out.println("Valor de la suma: " + total);
    }
}
