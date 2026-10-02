import java.util.Scanner;

public class Ejercicio_Switch17 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double lecturaAnterior=0;
        double lecturaActual=0;
        double consumo = 0;
        double costo=0;
        double pago=0;

        System.out.println("Digite la lectura anterior:");
        lecturaAnterior = teclado.nextDouble();

        System.out.println("Digite la lectura actual:");
        lecturaActual = teclado.nextDouble();

        int rango;

        if (lecturaActual >= lecturaAnterior) {
            consumo = lecturaActual - lecturaAnterior;

            if (consumo > 0) {
                if (consumo <= 100) {
                    rango = 1;
                } else if (consumo <= 300) {
                    rango = 2;
                } else if (consumo <= 500) {
                    rango = 3;
                } else {
                    rango = 4;
                }
            } else {
                rango = 5;
            }
        } else {
            rango = 6;
        }

        switch (rango) {
            case 1:
                costo = 2622.00;
                pago = consumo * costo;
                System.out.println("El consumo de Kwh es: " + consumo);
                System.out.println("El costo por Kwh es: " + costo);
                System.out.println("El monto a pagar es: " + pago);
                break;

            case 2:
                costo = 79.78;
                pago = consumo * costo;
                System.out.println("El consumo de Kwh es: " + consumo);
                System.out.println("El costo por Kwh es: " + costo);
                System.out.println("El monto a pagar es: " + pago);
                break;

            case 3:
                costo = 89.52;
                pago = consumo * costo;
                System.out.println("El consumo de Kwh es: " + consumo);
                System.out.println("El costo por Kwh es: " + costo);
                System.out.println("El monto a pagar es: " + pago);
                break;

            case 4:
                costo = 97.95;
                pago = consumo * costo;
                System.out.println("El consumo de Kwh es: " + consumo);
                System.out.println("El costo por Kwh es: " + costo);
                System.out.println("El monto a pagar es: " + pago);

                if (pago > 5000) {
                    System.out.println("ADVERTENCIA: El consumo es muy alto.");
                } else if (pago > 2000) {
                    System.out.println("NOTA: El consumo es moderado.");
                }
                break;

            case 5:
                System.out.println("Error: El consumo debe ser mayor que 0.");
                break;

            case 6:
                System.out.println("Error: La lectura actual debe ser mayor o igual a la anterior.");
                break;

            default:
                break;
        }

    }
}