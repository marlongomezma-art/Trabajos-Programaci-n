import java.util.Scanner;

public class Ejercicio_Switch19 {

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

        int rango;

        if (edadMeses <= 1) {
            rango = 1;
        } else if (edadMeses <= 6) {
            rango = 2;
        } else if (edadMeses <= 12) {
            rango = 3;
        } else if (edadMeses <= 60) {
            rango = 4;
        } else if (edadMeses <= 120) {
            rango = 5;
        } else if (edadMeses <= 180) {
            rango = 6;
        } else if (sexo == 'M' || sexo == 'm') {
            rango = 7;
        } else {
            rango = 8;
        }

        switch (rango) {
            case 1:
                minimo = 13;
                break;
            case 2:
                minimo = 10;
                break;
            case 3:
                minimo = 11;
                break;
            case 4:
                minimo = 11.5;
                break;
            case 5:
                minimo = 12.6;
                break;
            case 6:
                minimo = 13;
                break;
            case 7:
                minimo = 12;
                break;
            case 8:
                minimo = 14;
                break;
            default:
                minimo = 0;
                break;
        }

        if (hemoglobina < minimo) {
            System.out.println("La persona si tiene Anemia.");
        } else {
            System.out.println("La persona no tiene Anemia.");
        }

    }
}
