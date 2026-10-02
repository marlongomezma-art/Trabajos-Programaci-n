public class Ejercicio10 {

    public static void main(String[] args) {

        double numero = 1;
        double total = 0;
        double resultado = 0;

        while (total < 1000) {

            resultado = ((numero * numero) + 1) / numero;

            if (total + resultado <= 1000) {
                total += resultado;
                numero++;

                System.out.println("Numero: " + total);
            }
        }
    }
}
