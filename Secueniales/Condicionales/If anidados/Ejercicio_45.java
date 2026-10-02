import java.util.Scanner;

public class Ejercicio_45 {

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

        if (a != 0) {

            d = b * b - 4 * a * c;

            System.out.println("Discriminante (D) = " + d);

            if (d == 0) {
                x1 = -b / (2 * a);
                x2 = x1;

                System.out.println("Ecuacion con raiz doble:");
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);

            } else if (d > 0) {
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);

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

            } else {
                System.out.println("Discriminante negativo (D < 0)");
                System.out.println("La ecuacion no tiene solucion en los Reales.");
            }

        } else {
            System.out.println("Error: El valor de A no puede ser 0.");
            System.out.println("No es una ecuacion cuadratica.");
        }
    }
}
