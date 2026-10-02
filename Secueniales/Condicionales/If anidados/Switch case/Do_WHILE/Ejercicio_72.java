package Ejercicio_59j;

import java.util.Scanner;

public class Ejercicio_72 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        final double G = 6.67259e-11;
        final double MASA_TERRESTRE = 5.97e24;

        int totalSatelites;
        int numSat = 0;

        String nombreSat;
        String paisOrigen;

        double masaSat;
        double alt;
        double fuerzaGrav;

        double acumFuerzas = 0;
        double acumMasas = 0;

        double maxFuerza = 0;
        double minFuerza = 0;

        double maxMasa = 0;

        double maxAltura = 0;
        double minAltura = 0;

        System.out.println("Ingrese la cantidad de satélites:");
        totalSatelites = teclado.nextInt();

        do {

            numSat++;
            teclado.nextLine();
            System.out.println("\n========== SATÉLITE #" + numSat + " ==========");
            System.out.println("Ingrese el nombre del satélite:");
            nombreSat = teclado.nextLine();
            System.out.println("Ingrese el país:");
            paisOrigen = teclado.nextLine();
            System.out.println("Ingrese la masa del satélite en Kg:");
            masaSat = teclado.nextDouble();
            System.out.println("Ingrese la altura del satélite en metros:");
            alt = teclado.nextDouble();
            fuerzaGrav = (G * masaSat * MASA_TERRESTRE) / (alt * alt);

            System.out.println("Fuerza de atracción: " + fuerzaGrav + " N");

            acumFuerzas += fuerzaGrav;
            acumMasas += masaSat;

            if (numSat == 1) {

                maxFuerza = fuerzaGrav;
                minFuerza = fuerzaGrav;

                maxAltura = alt;
                minAltura = alt;

            } else {

                if (fuerzaGrav > maxFuerza) {
                    maxFuerza = fuerzaGrav;
                }

                if (fuerzaGrav < minFuerza) {
                    minFuerza = fuerzaGrav;
                }

                if (alt > maxAltura) {
                    maxAltura = alt;
                }

                if (alt < minAltura) {
                    minAltura = alt;
                }
            }

            if (masaSat > maxMasa) {
                maxMasa = masaSat;
            }

        } while (numSat < totalSatelites);

        double promFuerza = acumFuerzas / totalSatelites;
        double promMasa = acumMasas / totalSatelites;
        System.out.println("\n========== RESULTADOS ==========");
        System.out.println("a) Mayor fuerza de atracción: " + maxFuerza + " N");
        System.out.println("   Menor fuerza de atracción: " + minFuerza + " N");
        System.out.println("b) Fuerza de atracción promedio: " + promFuerza + " N");
        System.out.println("c) Mayor masa de los satélites: " + maxMasa + " Kg");
        System.out.println("d) Masa promedio de los satélites: " + promMasa + " Kg");
        System.out.println("e) Mayor altura: " + maxAltura + " metros");
        System.out.println("   Menor altura: " + minAltura + " metros");
    }
}
