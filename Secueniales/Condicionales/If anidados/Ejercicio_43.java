import java.util.Scanner;

public class Ejercicio_43 {

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

        if (capital < 0) {
            prestamo = 10000 - capital;
            nuevoSaldo = 10000;
        } else if (capital <= 20000) {
            prestamo = 20000 - capital;
            nuevoSaldo = 20000;
        } else {
            prestamo = 0;
            nuevoSaldo = capital;
        }

        resto = nuevoSaldo - 5000 - 2000;

        insumos = resto / 2;
        incentivos = resto / 2;

        System.out.println("El prestamo bancario es: " + prestamo);
        System.out.println("La cantidad para insumos es: " + insumos);
        System.out.println("La cantidad para incentivos es: " + incentivos);

    }
}
