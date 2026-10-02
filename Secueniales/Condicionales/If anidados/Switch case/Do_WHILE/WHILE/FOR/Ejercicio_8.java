import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num_empleados;

        String nombre;
        String nacionalidad;

        int edad;
        int tipo;
        int horas;

        int totalVenezolanosTipo1 = 0;
        int totalVenezolanosTipo2 = 0;
        int totalVenezolanosTipo3 = 0;

        int extranjerosEdadImpar = 0;

        int sumaEdades = 0;
        double totalSueldos = 0;

        System.out.println("Ingrese el número de empleados:");
        num_empleados = teclado.nextInt();
        teclado.nextLine();

        for (int contador = 0; contador < num_empleados; contador++) {
            System.out.println("Empleado #" + contador);

            System.out.println("Ingrese el nombre:");
            nombre = teclado.nextLine();

            System.out.println("Ingrese la nacionalidad (V/E):");
            nacionalidad = teclado.nextLine();

            System.out.println("Ingrese la edad:");
            edad = teclado.nextInt();

            System.out.println("Ingrese el tipo de empleado (1, 2 o 3):");
            tipo = teclado.nextInt();

            System.out.println("Ingrese las horas trabajadas:");
            horas = teclado.nextInt();

            double sueldo = 0;
            double seguro = 0;

            if (tipo == 1) {
                sueldo = 5000 * horas;
                if (nacionalidad.equalsIgnoreCase("V")) {
                    totalVenezolanosTipo1++;
                }
            } else {
                if (tipo == 2) {
                    sueldo = 10000 * horas;
                    if (nacionalidad.equalsIgnoreCase("V")) {
                        totalVenezolanosTipo2++;
                    }
                } else {
                    if (tipo == 3) {
                        sueldo = 15000 * horas;
                        if (nacionalidad.equalsIgnoreCase("V")) {
                            totalVenezolanosTipo3++;
                        }
                    }
                }
            }

            if (sueldo > 100000) {
                seguro = sueldo * 0.03;
            }

            if (nacionalidad.equalsIgnoreCase("E") && edad % 2 != 0) {
                extranjerosEdadImpar++;
            }

            sumaEdades += edad;
            totalSueldos += sueldo;

            System.out.println("Nombre: " + nombre);
            System.out.println("Sueldo básico: " + sueldo);
            System.out.println("Seguro Social: " + seguro);

            teclado.nextLine();
        }
    }
}
