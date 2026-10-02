public class Ejercicio_40 {

    public static void main(String[] args) {

        double Lectura_Anterior;
        double Lectura_Actual;
        double Consumo;
        double Costo;
        double Pago;

        System.out.println("Digite la lectura anterior:");
        Lectura_Anterior = Double.parseDouble(System.console().readLine());

        System.out.println("Digite la lectura actual:");
        Lectura_Actual = Double.parseDouble(System.console().readLine());

        Consumo = Lectura_Actual - Lectura_Anterior;

        if (Consumo <= 100) {

            Costo = 2622.00;

        } else if (Consumo <= 300) {

            Costo = 79.78;

        } else if (Consumo <= 500) {

            Costo = 89.52;

        } else {

            Costo = 97.95;
        }

        Pago = Consumo * Costo;

        System.out.println("El consumo de Kwh es: " + Consumo);
        System.out.println("El costo por Kwh es: " + Costo);
        System.out.println("El monto a pagar es: " + Pago);
    }
}