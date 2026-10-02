import java.util.Scanner;

public class Ejercicio_35 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double temperatura;

        System.out.println("Digite la temperatura en grados Fahrenheit:");
        temperatura = teclado.nextDouble();

        if (temperatura > 85) {
            System.out.println("El deporte apropiado es: Natacion");
        } else if (temperatura > 70) {
            System.out.println("El deporte apropiado es: Tenis");
        } else if (temperatura > 32) {
            System.out.println("El deporte apropiado es: Golf");
        } else if (temperatura > 10) {
            System.out.println("El deporte apropiado es: Esqui");
        } else {
            System.out.println("El deporte apropiado es: Marcha");
        }

        teclado.close();
    }
}