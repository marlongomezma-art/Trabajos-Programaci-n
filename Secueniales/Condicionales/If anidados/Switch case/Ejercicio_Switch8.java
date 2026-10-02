import java.util.Scanner;

public class Ejercicio_Switch8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite la cantidad de kilometros recorridos:");
        double Kilometros = teclado.nextDouble();

        double Pago;
        int rango;

        if (Kilometros <= 300) {
            rango = 1;
        } else if (Kilometros <= 1000) {
            rango = 2;
        } else {
            rango = 3;
        }

        switch (rango) {
            case 1:
                Pago = 5000;
                break;
            case 2:
                Pago = 5000 + (Kilometros - 300) * 200;
                break;
            case 3:
                Pago = 5000 + (700 * 200) + ((Kilometros - 1000) * 150);
                break;
            default:
                Pago = 0;
                break;
        }

        System.out.println("El valor a pagar es: " + Pago);
        teclado.close();
    }
}