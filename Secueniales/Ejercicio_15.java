public class Ejercicio_15 {
    public static void main(String[] args) {

        double lecturaAnterior, lecturaActual;
        double costoKilovatio, consumo, total;

        System.out.println("Digite la lectura anterior:");
        lecturaAnterior = Double.parseDouble(System.console().readLine());

        System.out.println("Digite la lectura actual:");
        lecturaActual = Double.parseDouble(System.console().readLine());

        System.out.println("Digite el costo por kilovatio:");
        costoKilovatio = Double.parseDouble(System.console().readLine());

        consumo = lecturaActual - lecturaAnterior;

        total = consumo * costoKilovatio;

        System.out.println("El consumo es: " + consumo);
        System.out.println("El monto total a pagar es: " + total);
    }
}