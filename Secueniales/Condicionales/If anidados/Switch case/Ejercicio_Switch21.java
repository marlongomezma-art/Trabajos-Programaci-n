import java.util.Scanner;

public class Ejercicio_Switch21 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double hipoteca;
        double inversionTotal;
        double inversionPersona;
        double inversionSocio;
        double resto;

        System.out.println("Digite el monto de la hipoteca:");
        hipoteca = teclado.nextDouble();

        System.out.println("Digite el monto total de la inversion:");
        inversionTotal = teclado.nextDouble();

        int rango;

        if (hipoteca > 0 && inversionTotal > 0) {
            if (inversionTotal >= hipoteca) {
                if (hipoteca < 1000000) {
                    rango = 1;
                } else {
                    rango = 2;
                }
            } else {
                rango = 3;
            }
        } else {
            rango = 4;
        }

        switch (rango) {
            case 1:
                inversionPersona = inversionTotal * 50 / 100;
                inversionSocio = inversionTotal * 50 / 100;

                System.out.println("Hipoteca BAJA (menos de 1,000,000)");
                System.out.println("División 50% - 50%");
                System.out.println("La inversion de la persona es: " + inversionPersona);
                System.out.println("La inversion del socio es: " + inversionSocio);
                System.out.println("Ambos invierten la misma cantidad.");
                break;

            case 2:
                resto = inversionTotal - hipoteca;

                inversionPersona = hipoteca + resto / 2;
                inversionSocio = resto / 2;

                System.out.println("Hipoteca ALTA (1,000,000 o más)");
                System.out.println("División proporcional");

                if (resto > 0) {
                    System.out.println("Monto restante para dividir: " + resto);
                } else {
                    System.out.println("No hay resto para dividir.");
                }

                System.out.println("La inversion de la persona es: " + inversionPersona);
                System.out.println("La inversion del socio es: " + inversionSocio);

                if (inversionPersona > inversionSocio) {
                    System.out.println("La persona invierte más que el socio.");
                } else if (inversionPersona < inversionSocio) {
                    System.out.println("El socio invierte más que la persona.");
                } else {
                    System.out.println("Ambos invierten la misma cantidad.");
                }
                break;

            case 3:
                System.out.println("Error: La inversion total debe ser mayor o igual a la hipoteca.");
                break;

            case 4:
                System.out.println("Error: Los montos deben ser mayores que 0.");
                break;

            default:
                break;
        }
    }
}