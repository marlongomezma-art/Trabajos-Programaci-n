public class Ejercicio_18 {
    public static void main(String[] args) {

        double galones, litros, total;

        System.out.println("Digite la cantidad de galones:");
        galones = Double.parseDouble(System.console().readLine());

        litros = galones * 3.785;

        total = litros * 100;

        System.out.println("Cantidad de litros: " + litros);
        System.out.println("Total a cobrar: " + total + " Bolivares");
    }
}