import java.util.Scanner;

public class Ejercicio_switch22 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double a;
        double b;
        double c;
        double d;
        double x1;
        double x2;

        System.out.println("Digite el valor de A:");
        a = teclado.nextDouble();

        System.out.println("Digite el valor de B:");
        b = teclado.nextDouble();

        System.out.println("Digite el valor de C:");
        c = teclado.nextDouble();

        int rango;

        if (a != 0) {
            d = b * b - 4 * a * c;

            if (d == 0) {
                rango = 1;
            } else if (d > 0) {
                rango = 2;
            } else {
                rango = 3;
            }
        } else {
            rango = 4;
        }

        switch (rango) {
            case 1:
                d = b * b - 4 * a * c;
                x1 = -b / (2 * a);
                x2 = x1;

                System.out.println("Discriminante (D) = " + d);
                System.out.println("Ecuacion con raiz doble:");
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
                break;

            case 2:
                d = b * b - 4 * a * c;
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);

                System.out.println("Discriminante (D) = " + d);
                System.out.println("Ecuacion con dos soluciones reales:");
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);

                if (x1 > 0 && x2 > 0) {
                    System.out.println("Ambas raices son positivas.");
                } else if (x1 < 0 && x2 < 0) {
                    System.out.println("Ambas raices son negativas.");
                } else if (x1 > 0 || x2 > 0) {
                    System.out.println("Una raiz es positiva y otra negativa.");
                }
                break;

            case 3:
                d = b * b - 4 * a * c;
                System.out.println("Discriminante (D) = " + d);
                System.out.println("Discriminante negativo (D < 0)");
                System.out.println("La ecuacion no tiene solucion en los Reales.");
                break;

            case 4:
                System.out.println("Error: El valor de A no puede ser 0.");
                System.out.println("No es una ecuacion cuadratica.");
                break;

            default:
                break;
        }
    }
}
