import java.util.Scanner;

public class Ejercicio_Switch20 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double capital;
        double prestamo;
        double nuevoSaldo;
        double resto;
        double insumos;
        double incentivos;

        System.out.println("Digite el capital actual:");
        capital = teclado.nextDouble();

        int rango;

        if (capital < 0) {
            rango = 1;
        } else if (capital <= 20000) {
            rango = 2;
        } else {
            rango = 3;
        }

        switch (rango) {
            case 1:
                prestamo = 10000 - capital;
                nuevoSaldo = 10000;
                break;
            case 2:
                prestamo = 20000 - capital;
                nuevoSaldo = 20000;
                break;
            case 3:
                prestamo = 0;
                nuevoSaldo = capital;
                break;
            default:
                prestamo = 0;
                nuevoSaldo = 0;
                break;
        }

        resto = nuevoSaldo - 5000 - 2000;

        insumos = resto / 2;
        incentivos = resto / 2;

        System.out.println("El prestamo bancario es: " + prestamo);
        System.out.println("La cantidad para insumos es: " + insumos);
        System.out.println("La cantidad para incentivos es: " + incentivos);

    }
}
