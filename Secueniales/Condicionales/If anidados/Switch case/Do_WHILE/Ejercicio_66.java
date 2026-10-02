package Ejercicio_59j;

import java.util.Scanner;

public class Ejercicio_66 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int vueloNumero;
        int codigo;
        String pasajeroNombre;

        int vuelos;
        int pasajeros;
        int maletas;

        int contadorVuelo = 1;
        int contadorPasajero;
        int contadorMaleta;

        double kilos;
        double kilosTotales;
        double pago;
        double pagoTotal;

        double pesoMaletaMayor;
        String codigoMayor;

        double pesoPasajeroMayor;
        double pesoPasajeroMenor;

        int pasajerosGratis = 0;
        int pasajerosTotal = 0;

        System.out.println("Ingrese la cantidad de vuelos del día:");
        vuelos = teclado.nextInt();

        do {

            System.out.println("\n========== VUELO #" + contadorVuelo + " ==========");

            System.out.println("Ingrese el número del vuelo:");
            vueloNumero = teclado.nextInt();

            System.out.println("Ingrese la cantidad de pasajeros:");
            pasajeros = teclado.nextInt();

            contadorPasajero = 1;
            pagoTotal = 0;

            pesoPasajeroMayor = 0;
            pesoPasajeroMenor = Double.MAX_VALUE;

            do {

                System.out.println("\n----- PASAJERO #" + contadorPasajero + " -----");

                teclado.nextLine();

                System.out.println("Ingrese el código de abordo:");
                codigo = teclado.nextInt();

                teclado.nextLine();

                System.out.println("Ingrese el nombre:");
                pasajeroNombre = teclado.nextLine();

                System.out.println("Ingrese la cantidad de maletas:");
                maletas = teclado.nextInt();

                kilosTotales = 0;
                pesoMaletaMayor = 0;
                codigoMayor = "";
                contadorMaleta = 1;

                do {

                    teclado.nextLine();

                    System.out.println("Ingrese el código de la maleta:");
                    String identificadorMaleta = teclado.nextLine();

                    System.out.println("Ingrese el peso de la maleta en Kg:");
                    kilos = teclado.nextDouble();

                    kilosTotales += kilos;

                    if (kilos >= 1 && kilos <= 3) {
                        pago = 0;

                    } else if (kilos <= 6) {
                        pago = kilos * 600;

                    } else if (kilos <= 9) {
                        pago = kilos * 1200;

                    } else if (kilos <= 12) {
                        pago = kilos * 1500;

                    } else if (kilos <= 15) {
                        pago = kilos * 2000;

                    } else {
                        pago = kilos * 2500;
                    }

                    pagoTotal += pago;

                    if (kilos > pesoMaletaMayor) {
                        pesoMaletaMayor = kilos;
                        codigoMayor = identificadorMaleta;
                    }

                    contadorMaleta++;

                } while (contadorMaleta <= maletas);

                if (kilosTotales >= 1 && kilosTotales <= 3) {
                    pago = 0;

                } else if (kilosTotales <= 6) {
                    pago = kilosTotales * 600;

                } else if (kilosTotales <= 9) {
                    pago = kilosTotales * 1200;

                } else if (kilosTotales <= 12) {
                    pago = kilosTotales * 1500;

                } else if (kilosTotales <= 15) {
                    pago = kilosTotales * 2000;

                } else {
                    pago = kilosTotales * 2500;
                }

                System.out.println("\nNúmero de vuelo: " + vueloNumero);
                System.out.println("Código de abordo: " + codigo);
                System.out.println("Nombre: " + pasajeroNombre);
                System.out.println("Peso total del equipaje: " + kilosTotales + " Kg");
                System.out.println("Monto a pagar: $" + pago);

                if (kilosTotales > pesoPasajeroMayor) {
                    pesoPasajeroMayor = kilosTotales;
                }

                if (kilosTotales < pesoPasajeroMenor) {
                    pesoPasajeroMenor = kilosTotales;
                }

                if (pago == 0) {
                    pasajerosGratis++;
                }

                pasajerosTotal++;

                System.out.println("Maleta de mayor peso: "
                        + codigoMayor + " - " + pesoMaletaMayor + " Kg");

                contadorPasajero++;

            } while (contadorPasajero <= pasajeros);

            System.out.println("\n========== RESUMEN DEL VUELO ==========");

            System.out.println("Número de vuelo: " + vueloNumero);
            System.out.println("Monto total cancelado por equipaje: $" + pagoTotal);
            System.out.println("Mayor peso total de equipaje de un pasajero: "
                    + pesoPasajeroMayor + " Kg");
            System.out.println("Menor peso total de equipaje de un pasajero: "
                    + pesoPasajeroMenor + " Kg");

            contadorVuelo++;

        } while (contadorVuelo <= vuelos);

        double porcentajeGratis =
                (double) pasajerosGratis / pasajerosTotal * 100;

        System.out.println("\n========== RESULTADOS GENERALES ==========");

        System.out.println("Porcentaje de pasajeros que no pagaron por equipaje: "
                + porcentajeGratis + "%");
    }
}