public class Ejercicio_55 {

    public static void main(String[] args) {

        double numero = 1;
        double total = 0;
        double resultado = 0;

        do {

            if (total < 1000) {

                resultado = ((numero * numero) + 1) / numero;

                total += resultado;

                numero++;

                System.out.println("Numero: " + total);
            }

        } while (total + resultado <= 1000);
    }
}
