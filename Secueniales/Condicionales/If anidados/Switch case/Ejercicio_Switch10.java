import java.util.Scanner;

public class Ejercicio_Switch10 {

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

        int rango;

        if (compra < 500) {
            rango = 1;
        } else if (compra <= 1000) {
            rango = 2;
        } else if (compra <= 7000) {
            rango = 3;
        } else if (compra <= 15000) {
            rango = 4;
        } else {
            rango = 5;
        }

        switch (rango) {
            case 1:
                porcentajeDescuento = 0;
                break;
            case 2:
                porcentajeDescuento = 5;
                break;
            case 3:
                porcentajeDescuento = 11;
                break;
            case 4:
                porcentajeDescuento = 18;
                break;
            case 5:
                porcentajeDescuento = 25;
                break;
            default:
                porcentajeDescuento = 0;
                break;
        }

        descuento = compra * porcentajeDescuento / 100;
        pago = compra - descuento;

        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Monto de la compra: " + compra);
        System.out.println("Descuento recibido: " + descuento);
        System.out.println("Monto a pagar: " + pago);


    }
}