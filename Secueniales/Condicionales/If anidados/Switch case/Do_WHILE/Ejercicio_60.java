package Ejercicio_59j;

import java.util.Scanner;

public class Ejercicio_60 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int factura;
        String cliente;
        double valorFactura;
        int diasPago;

        double mora;
        double rebaja;
        double totalPagar;

        String respuesta;

        do {

            System.out.println("\n===== DATOS DE LA FACTURA =====");

            System.out.println("Ingrese el número de factura:");
            factura = teclado.nextInt();
            teclado.nextLine();

            System.out.println("Ingrese el nombre del cliente:");
            cliente = teclado.nextLine();

            System.out.println("Ingrese el monto de la factura:");
            valorFactura = teclado.nextDouble();

            System.out.println("Ingrese los días transcurridos entre la compra y el pago:");
            diasPago = teclado.nextInt();

            mora = 0;
            rebaja = 0;

            if (diasPago >= 60) {

                mora = valorFactura * 0.08;

            } else if (diasPago >= 31 && diasPago <= 59) {

                mora = valorFactura * 0.06;

            } else if (diasPago < 15) {

                rebaja = valorFactura * 0.02;
            }

            totalPagar = valorFactura + mora - rebaja;

            System.out.println("\n===== RESULTADO =====");
            System.out.println("Número de factura: " + factura);
            System.out.println("Cliente: " + cliente);
            System.out.println("Monto de la factura: $" + valorFactura);
            System.out.println("Interés de mora: $" + mora);
            System.out.println("Descuento por pronto pago: $" + rebaja);
            System.out.println("Monto a cancelar: $" + totalPagar);

            teclado.nextLine();

            System.out.println("¿Desea ingresar otra factura? (si/no)");
            respuesta = teclado.nextLine();

        } while (respuesta.equalsIgnoreCase("si"));
    }
}
