import java.util.Scanner;

public class Ejercicio_39 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double valor;
        double porcentajeDepreciacion;
        double porcentajeIncremento;
        double depreciacion;
        double incremento;

        System.out.println("Digite el valor del automovil y del terreno:");
        valor = teclado.nextDouble();

        System.out.println("Digite el porcentaje de depreciacion del automovil:");
        porcentajeDepreciacion = teclado.nextDouble();

        System.out.println("Digite el porcentaje de incremento del terreno:");
        porcentajeIncremento = teclado.nextDouble();

        if (valor > 0 && porcentajeDepreciacion > 0 && porcentajeIncremento > 0) {

            depreciacion = valor * porcentajeDepreciacion / 100;
            incremento = valor * porcentajeIncremento / 100;

            System.out.println("La depreciacion del automovil es: " + depreciacion);
            System.out.println("El incremento del terreno es: " + incremento);


            if (depreciacion <= incremento / 2) {

                System.out.println("Debe comprar el automovil.");


                if (depreciacion > valor * 0.50) {
                    System.out.println("ADVERTENCIA: La depreciacion es muy alta.");
                }

            } else {

                System.out.println("No debe comprar el automovil.");

                // Validar si el incremento es bajo
                if (incremento < valor * 0.10) {
                    System.out.println("ADVERTENCIA: El incremento del terreno es muy bajo.");
                }
            }

        } else {
            System.out.println("Error: Los valores deben ser positivos.");
        }

    }
}
