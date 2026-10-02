public class Ejercicio_47 {
    public static void main(String[] args) {
        int numero = 1;

        while (numero < 100) {
            if (numero % 7 != 0) {
                System.out.println(numero);
            }
            numero += 2;
        }
    }
}
