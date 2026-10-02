import java.util.Scanner;

public class Ejercicio_Switch12 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double temperatura;

        System.out.println("Digite la temperatura en grados Fahrenheit:");
        temperatura = teclado.nextDouble();

        int rango;

        if (temperatura > 85) {
            rango = 1;
        } else if (temperatura > 70) {
            rango = 2;
        } else if (temperatura > 32) {
            rango = 3;
        } else if (temperatura > 10) {
            rango = 4;
        } else {
            rango = 5;
        }

        switch (rango) {
            case 1:
                System.out.println("El deporte apropiado es: Natacion");
                break;
            case 2:
                System.out.println("El deporte apropiado es: Tenis");
                break;
            case 3:
                System.out.println("El deporte apropiado es: Golf");
                break;
            case 4:
                System.out.println("El deporte apropiado es: Esqui");
                break;
            case 5:
                System.out.println("El deporte apropiado es: Marcha");
                break;
            default:
                break;
        }

    }
}