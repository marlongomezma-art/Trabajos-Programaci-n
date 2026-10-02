import java.util.Scanner;

public class Ejercicio_34 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int categoria;
        double sueldo;
        double porcentajeAumento;
        double aumento;
        double sueldoFinal;

        System.out.println("Digite la categoria del trabajador:");
        categoria = teclado.nextInt();

        System.out.println("Digite el sueldo del trabajador:");
        sueldo = teclado.nextDouble();

        if (categoria == 1) {
            porcentajeAumento = 15;
        } else if (categoria == 2) {
            porcentajeAumento = 10;
        } else if (categoria == 3) {
            porcentajeAumento = 8;
        } else if (categoria == 4) {
            porcentajeAumento = 7;
        } else {
            porcentajeAumento = 0;
            System.out.println("Categoria no valida");
        }

        aumento = sueldo * porcentajeAumento / 100;
        sueldoFinal = sueldo + aumento;

        System.out.println("Categoria del trabajador: " + categoria);
        System.out.println("Nuevo sueldo: " + sueldoFinal);

        teclado.close();
    }
}
