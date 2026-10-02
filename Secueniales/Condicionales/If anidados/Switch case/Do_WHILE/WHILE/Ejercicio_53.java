import java.util.Scanner;

public class Ejercicio_53{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int Marlon;
        int Gomez = 0;

        String Carlos;
        String Pedro;

        int Juan;
        int Andres;
        int David;

        int totalMarlonTipo1 = 0;
        int totalMarlonTipo2 = 0;
        int totalMarlonTipo3 = 0;

        int extranjerosEdadImpar = 0;

        int sumaEdades = 0;
        double totalSueldos = 0;

        System.out.println("Ingrese el número de empleados:");
        Marlon = entrada.nextInt();
        entrada.nextLine();

        while (Gomez < Marlon) {

            Gomez++;

            System.out.println("Empleado #" + Gomez);

            System.out.println("Ingrese el nombre:");
            Carlos = entrada.nextLine();

            System.out.println("Ingrese la nacionalidad (V/E):");
            Pedro = entrada.nextLine();

            System.out.println("Ingrese la edad:");
            Juan = entrada.nextInt();

            System.out.println("Ingrese el tipo de empleado (1, 2 o 3):");
            Andres = entrada.nextInt();

            System.out.println("Ingrese las horas trabajadas:");
            David = entrada.nextInt();

            double sueldo = 0;
            double seguro = 0;

            switch (Andres) {

                case 1:
                    sueldo = 5000 * David;

                    if (Pedro.equalsIgnoreCase("V")) {
                        totalMarlonTipo1++;
                    }
                    break;

                case 2:
                    sueldo = 10000 * David;

                    if (Pedro.equalsIgnoreCase("V")) {
                        totalMarlonTipo2++;
                    }
                    break;

                case 3:
                    sueldo = 15000 * David;

                    if (Pedro.equalsIgnoreCase("V")) {
                        totalMarlonTipo3++;
                    }
                    break;
            }

            if (sueldo > 100000) {
                seguro = sueldo * 0.03;
            }

            if (Pedro.equalsIgnoreCase("E") && Juan % 2 != 0) {
                extranjerosEdadImpar++;
            }

            sumaEdades += Juan;
            totalSueldos += sueldo;

            System.out.println("Nombre: " + Carlos);
            System.out.println("Sueldo básico: " + sueldo);
            System.out.println("Seguro Social: " + seguro);

            entrada.nextLine();
        }

        double promedioEdad = (double) sumaEdades / Marlon;

        System.out.println("Venezolanos tipo 1: " + totalMarlonTipo1);
        System.out.println("Venezolanos tipo 2: " + totalMarlonTipo2);
        System.out.println("Venezolanos tipo 3: " + totalMarlonTipo3);

        System.out.println("Extranjeros con edad impar: " + extranjerosEdadImpar);

        System.out.println("Promedio de edad: " + promedioEdad);

        System.out.println("Total general a pagar en sueldos: " + totalSueldos);
    }
}