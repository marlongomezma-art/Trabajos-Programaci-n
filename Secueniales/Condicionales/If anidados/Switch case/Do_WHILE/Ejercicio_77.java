package Ejercicio_59j;

import java.util.Scanner;

public class Ejercicio_77 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int estado = 1;
        int cantidadMunicipios;

        String estadoMayor = "";
        String estadoMenor = "";

        int mayorPoblacion = 0;
        int menorPoblacion = Integer.MAX_VALUE;

        int totalCincoEstados = 0;

        do {

            System.out.println("\n========== ESTADO #" + estado + " ==========");

            System.out.println("Ingrese el nombre del Estado:");
            String nombreEstado = teclado.nextLine();

            System.out.println("Ingrese la cantidad de municipios:");
            cantidadMunicipios = teclado.nextInt();

            int municipio = 1;
            int poblacionEstado = 0;

            do {

                System.out.println("Ingrese la cantidad de habitantes del municipio #" + municipio + ":");
                int habitantes = teclado.nextInt();
                poblacionEstado += habitantes;
                municipio++;

            } while (municipio <= cantidadMunicipios);

            System.out.println("Población del Estado " + nombreEstado + ": " + poblacionEstado);

            if (poblacionEstado > mayorPoblacion) {
                mayorPoblacion = poblacionEstado;
                estadoMayor = nombreEstado;
            }

            if (poblacionEstado < menorPoblacion) {
                menorPoblacion = poblacionEstado;
                estadoMenor = nombreEstado;
            }

            totalCincoEstados += poblacionEstado;

            estado++;
            teclado.nextLine();

        } while (estado <= 5);

        System.out.println("\nIngrese la población total del País:");
        int poblacionPais = teclado.nextInt();
        double porcentaje = (double) totalCincoEstados / poblacionPais * 100;
        double promedio = (double) totalCincoEstados / 5;
        System.out.println("\n========== RESULTADOS ==========");
        System.out.println("a. Estado con mayor población: " + estadoMayor + " - " + mayorPoblacion + " habitantes");
        System.out.println("b. Estado con menor población: " + estadoMenor + " - " + menorPoblacion + " habitantes");
        System.out.println("c. Porcentaje de habitantes de los 5 Estados respecto al País: " + porcentaje + "%");
        System.out.println("d. Promedio de habitantes por Estado: " + promedio);
    }
}