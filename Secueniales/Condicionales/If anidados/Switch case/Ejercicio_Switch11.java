import java.util.Scanner;

public class Ejercicio_Switch11 {

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

        int rango;

        if (categoria == 1) {
            rango = 1;
        } else if (categoria == 2) {
            rango = 2;
        } else if (categoria == 3) {
            rango = 3;
        } else if (categoria == 4) {
            rango = 4;
        } else {
            rango = 5;
        }

        switch (rango) {
            case 1:
                porcentajeAumento = 15;
                break;
            case 2:
                porcentajeAumento = 10;
                break;
            case 3:
                porcentajeAumento = 8;
                break;
            case 4:
                porcentajeAumento = 7;
                break;
            case 5:
                porcentajeAumento = 0;
                System.out.println("Categoria no valida");
                break;
            default:
                porcentajeAumento = 0;
                break;
        }

        aumento = sueldo * porcentajeAumento / 100;
        sueldoFinal = sueldo + aumento;

        System.out.println("Categoria del trabajador: " + categoria);
        System.out.println("Nuevo sueldo: " + sueldoFinal);

    }
}
