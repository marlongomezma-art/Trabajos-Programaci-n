import java.util.Scanner;

public class Ejercicio_80 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int cantidadEstados;
        int estado = 1;

        int mayorProfesionalesDesempleados = 0;
        int mayorTotalProfesionales = 0;
        String estadoMayorProfesionales = "";

        System.out.println("Ingrese la cantidad de Estados:");
        cantidadEstados = teclado.nextInt();

        do {

            System.out.println("\n========== ESTADO #" + estado + " ==========");

            int codigoEstado;
            int cantidadCiudades;

            System.out.println("Ingrese el código del Estado:");
            codigoEstado = teclado.nextInt();

            System.out.println("Ingrese la cantidad de ciudades:");
            cantidadCiudades = teclado.nextInt();
            int ciudad = 1;
            int profesionalesDesempleadosEstado = 0;
            int profesionalesEstado = 0;

            do {

                System.out.println("\n---------- CIUDAD #" + ciudad + " ----------");
                int codigoCiudad;
                int cantidadMunicipios;
                System.out.println("Ingrese el código de la ciudad:");
                codigoCiudad = teclado.nextInt();
                System.out.println("Ingrese la cantidad de municipios:");
                cantidadMunicipios = teclado.nextInt();
                int municipio = 1;
                int personasEspecialesCiudad = 0;
                int totalPersonasCiudad = 0;

                do {

                    System.out.println("\n------ MUNICIPIO #" + municipio + " ------");
                    int codigoMunicipio;
                    int cantidadPersonas;
                    System.out.println("Ingrese el código del municipio:");
                    codigoMunicipio = teclado.nextInt();
                    System.out.println("Ingrese la cantidad de personas del municipio:");
                    cantidadPersonas = teclado.nextInt();
                    int persona = 1;
                    int personasEspecialesMunicipio = 0;

                    do {

                        System.out.println("\nPersona #" + persona);
                        System.out.println("Ingrese la edad:");
                        int edad = teclado.nextInt();
                        System.out.println(
                                "Ingrese el nivel de educación:"
                                        + "\nN = Ninguna"
                                        + "\nB = Básica"
                                        + "\nS = Secundaria"
                                        + "\nP = Profesional"
                        );
                        String educacion = teclado.next();
                        System.out.println(
                                "Ingrese la situación actual:"
                                        + "\nD = Desempleado"
                                        + "\nE = Empleado"
                        );

                        String situacion = teclado.next();
                        if (edad > 25
                                && educacion.equalsIgnoreCase("N")
                                && situacion.equalsIgnoreCase("D")) {

                            personasEspecialesMunicipio++;
                            personasEspecialesCiudad++;
                        }

                        if (educacion.equalsIgnoreCase("P")) {
                            profesionalesEstado++;
                            if (situacion.equalsIgnoreCase("D")) {
                                profesionalesDesempleadosEstado++;
                            }
                        }
                        persona++;

                    } while (persona <= cantidadPersonas);

                    System.out.println(
                            "\nPersonas desempleadas, sin educación "
                                    + "y mayores de 25 años en el municipio "
                                    + codigoMunicipio + ": "
                                    + personasEspecialesMunicipio
                    );

                    totalPersonasCiudad += cantidadPersonas;
                    municipio++;

                } while (municipio <= cantidadMunicipios);

                double porcentajeCiudad = 0;

                if (totalPersonasCiudad > 0) {
                    porcentajeCiudad = (double) personasEspecialesCiudad / totalPersonasCiudad * 100;
                }

                if (porcentajeCiudad > 50) {
                    System.out.println("La ciudad " + codigoCiudad + " tiene más del 50% " + "de personas con la característica.");
                }
                ciudad++;

            } while (ciudad <= cantidadCiudades);

            double porcentajeProfesionalesDesempleados = 0;

            if (profesionalesEstado > 0) {
                porcentajeProfesionalesDesempleados = (double) profesionalesDesempleadosEstado / profesionalesEstado * 100;
            }

            System.out.println("\nPorcentaje de profesionales desempleados " + "del Estado " + codigoEstado + ": " + porcentajeProfesionalesDesempleados + "%");

            if (profesionalesDesempleadosEstado > mayorProfesionalesDesempleados) {
                mayorProfesionalesDesempleados = profesionalesDesempleadosEstado;
                mayorTotalProfesionales = profesionalesEstado;
                estadoMayorProfesionales = String.valueOf(codigoEstado);
            }
            estado++;

        } while (estado <= cantidadEstados);

        System.out.println("\n========== RESULTADO FINAL ==========");

        if (!estadoMayorProfesionales.isEmpty()) {
            double porcentajeMayor = (double) mayorProfesionalesDesempleados / mayorTotalProfesionales * 100;
            System.out.println("Estado con mayor porcentaje de profesionales " + "desempleados: " + estadoMayorProfesionales
            );
            System.out.println("Porcentaje: " + porcentajeMayor + "%");
        }
    }
}
