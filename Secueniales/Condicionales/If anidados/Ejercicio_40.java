import java.util.Scanner;

public class Ejercicio_40 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double lecturaAnterior;
        double lecturaActual;
        double consumo;
        double costo;
        double pago;

        System.out.println("Digite la lectura anterior:");
        lecturaAnterior = teclado.nextDouble();

        System.out.println("Digite la lectura actual:");
        lecturaActual = teclado.nextDouble();

        if (lecturaActual >= lecturaAnterior) {

            consumo = lecturaActual - lecturaAnterior;

            if (consumo > 0) {

                if (consumo <= 100) {
                    costo = 2622.00;
                } else if (consumo <= 300) {
                    costo = 79.78;
                } else if (consumo <= 500) {
                    costo = 89.52;
                } else {
                    costo = 97.95;
                }

                pago = consumo * costo;

                System.out.println("El consumo de Kwh es: " + consumo);
                System.out.println("El costo por Kwh es: " + costo);
                System.out.println("El monto a pagar es: " + pago);

                if (pago > 5000) {
                    System.out.println("ADVERTENCIA: El consumo es muy alto.");
                } else if (pago > 2000) {
                    System.out.println("NOTA: El consumo es moderado.");
                }

            } else {
                System.out.println("Error: El consumo debe ser mayor que 0.");
            }

        } else {
            System.out.println("Error: La lectura actual debe ser mayor o igual a la anterior.");
        }
    }
}
