import java.util.Scanner;

public class Ejercicio_36 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int cantidad;
        int b50000, b20000, b10000, b5000, b2000;
        int b1000, b500, b100, b50, b20, b10;

        System.out.println("Digite la cantidad de Bolivares:");
        cantidad = teclado.nextInt();


        if (cantidad > 0) {

            b50000 = cantidad / 50000;
            cantidad = cantidad % 50000;

            if (b50000 > 0) {
                System.out.println("Billetes de 50000: " + b50000);
            }

            b20000 = cantidad / 20000;
            cantidad = cantidad % 20000;

            if (b20000 > 0) {
                System.out.println("Billetes de 20000: " + b20000);
            }

            b10000 = cantidad / 10000;
            cantidad = cantidad % 10000;

            if (b10000 > 0) {
                System.out.println("Billetes de 10000: " + b10000);
            }

            b5000 = cantidad / 5000;
            cantidad = cantidad % 5000;

            if (b5000 > 0) {
                System.out.println("Billetes de 5000: " + b5000);
            }

            b2000 = cantidad / 2000;
            cantidad = cantidad % 2000;

            if (b2000 > 0) {
                System.out.println("Billetes de 2000: " + b2000);
            }

            b1000 = cantidad / 1000;
            cantidad = cantidad % 1000;

            if (b1000 > 0) {
                System.out.println("Billetes de 1000: " + b1000);
            }

            b500 = cantidad / 500;
            cantidad = cantidad % 500;

            if (b500 > 0) {
                System.out.println("Billetes de 500: " + b500);
            }

            b100 = cantidad / 100;
            cantidad = cantidad % 100;

            if (b100 > 0) {
                System.out.println("Billetes de 100: " + b100);
            }

            b50 = cantidad / 50;
            cantidad = cantidad % 50;

            if (b50 > 0) {
                System.out.println("Billetes de 50: " + b50);
            }

            b20 = cantidad / 20;
            cantidad = cantidad % 20;

            if (b20 > 0) {
                System.out.println("Billetes de 20: " + b20);
            }

            b10 = cantidad / 10;
            cantidad = cantidad % 10;

            if (b10 > 0) {
                System.out.println("Billetes de 10: " + b10);
            }

        } else {
            System.out.println("La cantidad debe ser mayor que 0");
        }

    }
}
