import java.util.Scanner;

public class Ejercicio_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Sueldo, Porcentaje_Aumento, Aumento, Sueldo_Final;

        System.out.println("Inserte el valor del sueldo :");
        Sueldo = Double.parseDouble(sc.nextLine());

        int categoria;
        if (Sueldo < 40000) {
            categoria = 1;
        } else if (Sueldo >= 40000 && Sueldo <= 100000) {
            categoria = 2;
        } else {
            categoria = 3;
        }
        switch (categoria) {
            case 1:
                Porcentaje_Aumento = 15;
                Aumento = Sueldo * Porcentaje_Aumento / 100;
                System.out.println("El aumento es igual: " + Aumento);
                Sueldo_Final = Sueldo + Aumento;
                System.out.println("El valor del Sueldo final es igual: " + Sueldo_Final);
                break;

            case 2:
                Porcentaje_Aumento = 12;
                Aumento = Sueldo * Porcentaje_Aumento / 100;
                System.out.println("El aumento es igual: " + Aumento);
                Sueldo_Final = Sueldo + Aumento;
                System.out.println("El valor del Sueldo final es igual: " + Sueldo_Final);
                System.out.println("El Sueldo final es : " + Sueldo_Final);
                break;

            case 3:
                System.out.println("Sueldo demasiado alto, no se aplica aumento.");
                System.out.println("El Sueldo final es: " + Sueldo);
                break;

            default:
                System.out.println("Valor no válido");
                break;
        }
    }
}