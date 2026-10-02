package Ejercicio_59j;

import java.util.Scanner;

public class Ejercicio_67 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double deudaTotal = 12775;
        double pagoActual = 100;
        double incremento = 125;
        double saldoPendiente = deudaTotal;

        int contadorPagos = 0;

        System.out.println("========== TABLA DE PAGOS ==========");
        System.out.println("Pago\tMonto\tPendiente");

        do {

            contadorPagos++;

            if (pagoActual > saldoPendiente) {
                pagoActual = saldoPendiente;
            }

            saldoPendiente -= pagoActual;

            System.out.println(contadorPagos + "\t" + pagoActual + "\t" + saldoPendiente);

            pagoActual += incremento;

        } while (saldoPendiente > 0);

        System.out.println("\nNúmero de pagos: " + contadorPagos);
        System.out.println("Monto del último pago: " + (pagoActual - incremento));

    }
}
