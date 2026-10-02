import java.util.Scanner;

public class Ejercicio_42 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int edadMeses;
        double hemoglobina;
        char sexo;
        double minimo;

        System.out.println("Digite la edad en meses:");
        edadMeses = teclado.nextInt();

        System.out.println("Digite el nivel de hemoglobina:");
        hemoglobina = teclado.nextDouble();

        System.out.println("Digite el sexo (M = Mujer, H = Hombre):");
        sexo = teclado.next().charAt(0);

        if (edadMeses <= 1) {
            minimo = 13;
        } else if (edadMeses <= 6) {
            minimo = 10;
        } else if (edadMeses <= 12) {
            minimo = 11;
        } else if (edadMeses <= 60) {
            minimo = 11.5;
        } else if (edadMeses <= 120) {
            minimo = 12.6;
        } else if (edadMeses <= 180) {
            minimo = 13;
        } else if (sexo == 'M' || sexo == 'm') {
            minimo = 12;
        } else {
            minimo = 14;
        }

        if (hemoglobina < minimo) {
            System.out.println("La persona si tiene Anemia.");
        } else {
            System.out.println("La persona no tiene Anemia.");
        }

    }
}