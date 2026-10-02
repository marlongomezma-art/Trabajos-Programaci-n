import java.util.Scanner;
    public class Ejercicio_29  {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            double Ventas1, Ventas2, Ventas3;
            double VentasTotales;
            double Porcentaje1, Porcentaje2, Porcentaje3;
            double Sueldo;
            double Extra1, Extra2, Extra3;
            double Total1, Total2, Total3;

            System.out.println("Digite las ventas del departamento 1:");
            Ventas1 = Double.parseDouble(teclado.nextLine());

            System.out.println("Digite las ventas del departamento 2:");
            Ventas2 = Double.parseDouble(teclado.nextLine());

            System.out.println("Digite las ventas del departamento 3:");
            Ventas3 = Double.parseDouble(teclado.nextLine());

            System.out.println("Digite el salario mensual de los vendedores:");
            Sueldo = Double.parseDouble(teclado.nextLine());

            VentasTotales = Ventas1 + Ventas2 + Ventas3;

            Porcentaje1 = (Ventas1 * 100) / VentasTotales;
            Porcentaje2 = (Ventas2 * 100) / VentasTotales;
            Porcentaje3 = (Ventas3 * 100) / VentasTotales;

            Extra1 = 0;
            Extra2 = 0;
            Extra3 = 0;

            if (Porcentaje1 > 33) {
                Extra1 = Sueldo * 0.20;
            }

            if (Porcentaje2 > 33) {
                Extra2 = Sueldo * 0.20;
            }

            if (Porcentaje3 > 33) {
                Extra3 = Sueldo * 0.20;
            }

            Total1 = Sueldo + Extra1;
            Total2 = Sueldo + Extra2;
            Total3 = Sueldo + Extra3;

            System.out.println("Departamento 1 recibira: " + Total1);
            System.out.println("Departamento 2 recibira: " + Total2);
            System.out.println("Departamento 3 recibira: " + Total3);


        }
    }




