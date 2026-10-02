import java.util.Scanner;

public class Ejercicio_Switch6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double Ventas1, Ventas2, Ventas3;
        double VentasTotales;
        double Porcentaje1, Porcentaje2, Porcentaje3;
        double Sueldo;
        double Extra = 0;
        double Total = 0;

        System.out.println("Digite las ventas del departamento 1:");
        Ventas1 = Double.parseDouble(teclado.nextLine());

        System.out.println("Digite las ventas del departamento 2:");
        Ventas2 = Double.parseDouble(teclado.nextLine());

        System.out.println("Digite las ventas del departamento 3:");
        Ventas3 = Double.parseDouble(teclado.nextLine());

        System.out.println("Digite el salario mensual de los vendedores:");
        Sueldo = Double.parseDouble(teclado.nextLine());

        VentasTotales = Ventas1 + Ventas2 + Ventas3;

        if (VentasTotales == 0) {
            System.out.println("No se puede calcular porque las ventas totales son 0.");
            return;
        }

        Porcentaje1 = (Ventas1 * 100) / VentasTotales;
        Porcentaje2 = (Ventas2 * 100) / VentasTotales;
        Porcentaje3 = (Ventas3 * 100) / VentasTotales;

        int departamento;

        System.out.println("Digite el departamento a consultar (1, 2 o 3):");
        departamento = Integer.parseInt(teclado.nextLine());

        switch (departamento) {
            case 1:
                if (Porcentaje1 > 33) {
                    Extra = Sueldo * 0.20;
                }
                Total = Sueldo + Extra;
                System.out.println("Departamento 1 recibira: " + Total);
                break;

            case 2:
                if (Porcentaje2 > 33) {
                    Extra = Sueldo * 0.20;
                }
                Total = Sueldo + Extra;
                System.out.println("Departamento 2 recibira: " + Total);
                break;

            case 3:
                if (Porcentaje3 > 33) {
                    Extra = Sueldo * 0.20;
                }
                Total = Sueldo + Extra;
                System.out.println("Departamento 3 recibira: " + Total);
                break;

            default:
                System.out.println("Departamento no válido");
                break;
        }
    }
}