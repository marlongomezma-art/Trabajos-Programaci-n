package Ejercicio_59j;

import java.util.Scanner;

public class Ejercicio_62 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int tipo;
        int zona;
        int empleados;

        int empresas = 0;

        int agricolas = 0;
        int industriales = 0;
        int mineras = 0;
        int pesqueras = 0;

        int empleadosAgricolas = 0;
        int empleadosIndustriales = 0;
        int empleadosMineras = 0;
        int empleadosPesqueras = 0;

        int norte = 0;
        int sur = 0;
        int este = 0;
        int oeste = 0;

        int minerasSur = 0;

        String respuesta;

        do {

            empresas++;

            System.out.println("\n===== EMPRESA #" + empresas + " =====");

            System.out.println("Ingrese la actividad:");
            System.out.println("1 = Agricola");
            System.out.println("2 = Industria");
            System.out.println("3 = Minera");
            System.out.println("4 = Pesquera");
            tipo = teclado.nextInt();

            System.out.println("Ingrese la localización:");
            System.out.println("1 = Norte");
            System.out.println("2 = Sur");
            System.out.println("3 = Este");
            System.out.println("4 = Oeste");
            zona = teclado.nextInt();

            System.out.println("Ingrese el número de trabajadores:");
            empleados = teclado.nextInt();

            switch (tipo) {

                case 1:
                    agricolas++;
                    empleadosAgricolas += empleados;
                    break;

                case 2:
                    industriales++;
                    empleadosIndustriales += empleados;

                    switch (zona) {

                        case 1:
                            norte++;
                            break;

                        case 2:
                            sur++;
                            break;

                        case 3:
                            este++;
                            break;

                        case 4:
                            oeste++;
                            break;

                        default:
                            System.out.println("Localización inválida.");
                    }

                    break;

                case 3:
                    mineras++;
                    empleadosMineras += empleados;

                    if (zona == 2) {
                        minerasSur++;
                    }

                    break;

                case 4:
                    pesqueras++;
                    empleadosPesqueras += empleados;
                    break;

                default:
                    System.out.println("Actividad inválida.");
            }

            teclado.nextLine();

            System.out.println("¿Desea ingresar otra empresa? (si/no)");
            respuesta = teclado.nextLine();

        } while (respuesta.equalsIgnoreCase("si"));

        double porcentajeAgricolas = 0;
        double porcentajeMinerasSur = 0;

        if (empresas > 0) {
            porcentajeAgricolas = (double) agricolas / empresas * 100;
        }

        if (mineras > 0) {
            porcentajeMinerasSur = (double) minerasSur / mineras * 100;
        }

        double promedioAgricolas = 0;
        double promedioIndustriales = 0;
        double promedioMineras = 0;
        double promedioPesqueras = 0;

        if (agricolas > 0) {
            promedioAgricolas = (double) empleadosAgricolas / agricolas;
        }

        if (industriales > 0) {
            promedioIndustriales = (double) empleadosIndustriales / industriales;
        }

        if (mineras > 0) {
            promedioMineras = (double) empleadosMineras / mineras;
        }

        if (pesqueras > 0) {
            promedioPesqueras = (double) empleadosPesqueras / pesqueras;
        }

        String zonaMayor = "Norte";

        int mayor = norte;

        if (sur > mayor) {
            mayor = sur;
            zonaMayor = "Sur";
        }

        if (este > mayor) {
            mayor = este;
            zonaMayor = "Este";
        }

        if (oeste > mayor) {
            mayor = oeste;
            zonaMayor = "Oeste";
        }

        System.out.println("\n========== RESULTADOS ==========");

        System.out.println("Total de empresas: " + empresas);
        System.out.println("Empresas agrícolas: " + agricolas);
        System.out.println("Empresas industriales: " + industriales);
        System.out.println("Empresas mineras: " + mineras);
        System.out.println("Empresas pesqueras: " + pesqueras);

        System.out.println("\nPorcentaje de empresas agrícolas: "
                + porcentajeAgricolas + "%");

        System.out.println("Porcentaje de empresas mineras del sur: "
                + porcentajeMinerasSur + "%");

        System.out.println("\nPromedio de trabajadores de empresas agrícolas: "
                + promedioAgricolas);

        System.out.println("Promedio de trabajadores de empresas industriales: "
                + promedioIndustriales);

        System.out.println("Promedio de trabajadores de empresas mineras: "
                + promedioMineras);

        System.out.println("Promedio de trabajadores de empresas pesqueras: "
                + promedioPesqueras);

        System.out.println("\nLocalización con mayor número de empresas industriales: "
                + zonaMayor);
    }
}
