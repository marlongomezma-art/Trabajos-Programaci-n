import java.util.Scanner;

public class Ejercicio_33 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nombre;
        double compra;
        double porcentajeDescuento;
        double descuento;
        double pago;

        System.out.println("Digite el nombre del cliente:");
        nombre = teclado.nextLine();

        System.out.println("Digite el monto de la compra:");
        compra = teclado.nextDouble();

        if (compra < 500) {
            porcentajeDescuento = 0;
        } else if (compra <= 1000) {
            porcentajeDescuento = 5;
        } else if (compra <= 7000) {
            porcentajeDescuento = 11;
        } else if (compra <= 15000) {
            porcentajeDescuento = 18;
        } else {
            porcentajeDescuento = 25;
        }

        descuento = compra * porcentajeDescuento / 100;
        pago = compra - descuento;

        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Monto de la compra: " + compra);
        System.out.println("Descuento recibido: " + descuento);
        System.out.println("Monto a pagar: " + pago);

    }
}
