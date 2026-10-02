import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {

        double F, C, R, K;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en Fahrenheit: ");
        F = teclado.nextDouble();
        C = 5 * (F - 32) / 9;
        R = F + 459.67;
        K = C + 273.15;

        for (int fin = 1; fin > 0; fin--) {
            System.out.println("La temperatura en Celsius: " + C);
            System.out.println("La temperatura en Rankine: " + R);
            System.out.println("La temperatura en Kelvin: " + K);
        }
    }
}
