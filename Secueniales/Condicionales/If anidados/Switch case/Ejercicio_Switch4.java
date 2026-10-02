import java.util.Scanner;

public class Ejercicio_Switch4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double Valor1, Valor2, Valor3;
        double Areatriangulo, Areacirculo, Arearectangulo;
        double Pi = 3.14;

        System.out.println("Digite el valor 1:");
        Valor1 = Double.parseDouble(teclado.nextLine());

        System.out.println("Digite el valor 2:");
        Valor2 = Double.parseDouble(teclado.nextLine());

        System.out.println("Digite el valor 3:");
        Valor3 = Double.parseDouble(teclado.nextLine());

        Areatriangulo = (Valor1 * Valor2) / 2;
        Areacirculo = Valor2 * (Valor1 * Valor1);
        Arearectangulo = Valor1 * Valor2;

        int categoria;
        if (Areatriangulo == Valor3) {
            categoria = 1;
        } else if (Areacirculo == Valor3) {
            categoria = 2;
        } else if (Arearectangulo == Valor3) {
            categoria = 3;
        } else {
            categoria = 4;
        }

        switch (categoria) {
            case 1:
                System.out.println("La figura es un Triángulo");
                break;

            case 2:
                System.out.println("La figura es un Círculo");
                break;

            case 3:
                System.out.println("La figura es un Rectángulo");
                break;

            case 4:
                System.out.println("No coincide con ninguna de las figuras");
                break;

            default:
                System.out.println("Valor no válido");
                break;
        }
    }
}