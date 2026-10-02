import java.util.Scanner;
public class Ejercicio_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Sueldo, Porcentaje_Aumento,Aumento, Sueldo_Final;
        System.out.println("Digite el valor del sueldo :");
        Sueldo = Double.parseDouble(sc.nextLine());
        if (Sueldo < 40000) {

            Porcentaje_Aumento = 15;
            Aumento = Sueldo * Porcentaje_Aumento / 100;
            System.out.println("El valor del aumento es de: " + Aumento);
            Sueldo_Final = Sueldo + Aumento;
            System.out.println("El valor del sueldo final del trabajador es: " + Sueldo_Final);

        } else {

            if (Sueldo > 40000) {
                Porcentaje_Aumento = 12;
                Aumento = Sueldo * Porcentaje_Aumento / 100;
                System.out.println("El valor del aumento es de: " + Aumento);
                Sueldo_Final = Sueldo + Aumento;
                System.out.println("El valor del sueldo final del trabajador es: " + Sueldo_Final);

            } else {
                System.out.println("El sueldo es exactamente 40000.");
            }
        }
    }
}