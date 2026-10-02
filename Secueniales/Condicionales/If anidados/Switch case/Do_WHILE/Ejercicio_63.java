package Ejercicio_59j;

import java.util.Scanner;

public class Ejercicio_63 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int edad;
        String genero;
        int civil;
        String carrera;

        int alumnos = 0;

        int hombres = 0;
        int mujeres = 0;

        int edadHombres = 0;
        int edadMujeres = 0;

        int solteros = 0;
        int casados = 0;
        int divorciados = 0;
        int viudos = 0;

        int progra = 0;
        int sistemas = 0;
        int admin = 0;

        int mujeresMayores = 0;
        int hombresJovenes = 0;

        int solterosHombres = 0;
        int solterasMujeres = 0;

        String respuesta;

        do {

            alumnos++;

            System.out.println("\n===== ALUMNO #" + alumnos + " =====");

            System.out.println("Ingrese la edad:");
            edad = teclado.nextInt();

            teclado.nextLine();

            System.out.println("Ingrese el sexo (H/M):");
            genero = teclado.nextLine();

            System.out.println("Ingrese el estado civil:");
            System.out.println("1 = Soltero");
            System.out.println("2 = Casado");
            System.out.println("3 = Divorciado");
            System.out.println("4 = Viudo");
            civil = teclado.nextInt();

            teclado.nextLine();

            System.out.println("Ingrese la especialidad:");
            System.out.println("Programacion");
            System.out.println("Sistemas");
            System.out.println("Administracion");
            carrera = teclado.nextLine();

            if (genero.equalsIgnoreCase("H")) {

                hombres++;

                edadHombres += edad;

                if (edad > 17 && edad < 21) {
                    hombresJovenes++;
                }

                if (civil == 1) {
                    solterosHombres++;
                }
            }

            if (genero.equalsIgnoreCase("M")) {

                mujeres++;

                edadMujeres += edad;

                if (edad > 21) {
                    mujeresMayores++;
                }

                if (civil == 1) {
                    solterasMujeres++;
                }
            }

            switch (civil) {

                case 1:
                    solteros++;
                    break;

                case 2:
                    casados++;
                    break;

                case 3:
                    divorciados++;
                    break;

                case 4:
                    viudos++;
                    break;
            }

            if (carrera.equalsIgnoreCase("Programacion")) {

                progra++;

            } else if (carrera.equalsIgnoreCase("Sistemas")) {

                sistemas++;

            } else if (carrera.equalsIgnoreCase("Administracion")) {

                admin++;
            }

            teclado.nextLine();

            System.out.println("\n¿Desea ingresar otro alumno? (si/no)");
            respuesta = teclado.nextLine();

        } while (respuesta.equalsIgnoreCase("si"));

        double promedioMujeres = (double) edadMujeres / mujeres;
        double promedioHombres = (double) edadHombres / hombres;

        double porcentajeSolteros = (double) solteros / alumnos * 100;
        double porcentajeCasados = (double) casados / alumnos * 100;
        double porcentajeDivorciados = (double) divorciados / alumnos * 100;
        double porcentajeViudos = (double) viudos / alumnos * 100;

        double porcentajeProgra = (double) progra / alumnos * 100;
        double porcentajeSistemas = (double) sistemas / alumnos * 100;
        double porcentajeAdmin = (double) admin / alumnos * 100;

        double porcentajeMujeresMayores = (double) mujeresMayores / mujeres * 100;
        double porcentajeHombresJovenes = (double) hombresJovenes / hombres * 100;

        System.out.println("\n========== RESULTADOS ==========");

        System.out.println("a. Promedio de edad de las mujeres: " + promedioMujeres);
        System.out.println("b. Promedio de edad de los hombres: " + promedioHombres);

        System.out.println("c. Cantidad de hombres: " + hombres);
        System.out.println("   Cantidad de mujeres: " + mujeres);

        System.out.println("d. Porcentaje de solteros: " + porcentajeSolteros + "%");
        System.out.println("   Porcentaje de casados: " + porcentajeCasados + "%");
        System.out.println("   Porcentaje de divorciados: " + porcentajeDivorciados + "%");
        System.out.println("   Porcentaje de viudos: " + porcentajeViudos + "%");

        System.out.println("e. Programacion: " + progra + " alumnos - " + porcentajeProgra + "%");
        System.out.println("   Sistemas: " + sistemas + " alumnos - " + porcentajeSistemas + "%");
        System.out.println("   Administracion: " + admin + " alumnos - " + porcentajeAdmin + "%");

        System.out.println("f. Porcentaje de mujeres adultas: "
                + porcentajeMujeresMayores + "%");

        System.out.println("g. Porcentaje de hombres jóvenes: "
                + porcentajeHombresJovenes + "%");

        System.out.println("h. Hombres solteros: " + solterosHombres);
        System.out.println("   Mujeres solteras: " + solterasMujeres);
    }
}
