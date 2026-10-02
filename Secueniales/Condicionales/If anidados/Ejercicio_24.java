import java.util.Scanner;
public class Ejercicio_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Capital_INC, Porcentaje_Interes, Interes, Capital_Fnl;

        System.out.println("Digite el valor del capital inicial : ");
        Capital_INC = Double.parseDouble(sc.nextLine());
        System.out.println("Digite el porcentaje de interes : ");
        Porcentaje_Interes = Double.parseDouble(sc.nextLine());
        Interes = (Capital_INC * Porcentaje_Interes) / 100;
        System.out.println("el valor del interes es: " + Interes);
        Capital_Fnl = Interes + Capital_INC;

        switch ((int) (Interes - 7000)) {
            case 1 -> {
                System.out.println("el valor del capital es mayor que 7000 se reinvierte: ");
                System.out.println("el valor del capital final es: " + Capital_Fnl);
            }
            case -1 -> {
                System.out.println("el valor del capital final es menor que 7000 se retiran");
                System.out.println("el capital final es " + Capital_Fnl);
            }
            case 0 -> {
                System.out.println("El valor es exactamente 7000");
                System.out.println("rectificar el valor del capital");
            }
        }
    }
}
