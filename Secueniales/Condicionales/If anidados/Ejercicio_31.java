import java.util.Scanner;

public class Ejercicio_31 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double Kilometros;
        double Pago;

        System.out.println("Digite la cantidad de kilometros recorridos:");
        Kilometros = teclado.nextDouble();

        if (Kilometros <= 300) {
            Pago = 5000;
        } else {
            if (Kilometros <= 1000) {
                Pago = 5000 + (Kilometros - 300) * 200;
            } else {
                Pago = 5000 + (700 * 200) + ((Kilometros - 1000) * 150);
            }
        }

        System.out.println("El valor a pagar es: " + Pago);
        teclado.close();
    }
}