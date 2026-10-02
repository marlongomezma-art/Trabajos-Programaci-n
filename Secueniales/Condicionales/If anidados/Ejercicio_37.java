import java.util.Scanner;

public class Ejercicio_37 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double a, b, c;
        double s, area;
        double mayor;
        double menor1, menor2;

        System.out.println("Digite el lado A:");
        a = teclado.nextDouble();

        System.out.println("Digite el lado B:");
        b = teclado.nextDouble();

        System.out.println("Digite el lado C:");
        c = teclado.nextDouble();

        if (a >= b && a >= c) {
            mayor = a;
            menor1 = b;
            menor2 = c;
        } else if (b >= a && b >= c) {
            mayor = b;
            menor1 = a;
            menor2 = c;
        } else {
            mayor = c;
            menor1 = a;
            menor2 = b;
        }

        if (menor1 + menor2 > mayor) {

            s = (a + b + c) / 2;
            area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("Los datos corresponden a un triangulo.");
            System.out.println("Area del triangulo: " + area);


            if (a == b && b == c) {
                System.out.println("El triangulo es Equilatero.");
            } else if (a == b || a == c || b == c) {
                System.out.println("El triangulo es Isosceles.");
            } else {
                System.out.println("El triangulo es Escaleno.");
            }

        } else {
            System.out.println("Los lados no forman un triangulo.");
        }

    }
}