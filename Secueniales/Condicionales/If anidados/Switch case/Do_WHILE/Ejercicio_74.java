package Ejercicio_59j;

import java.util.Scanner;

public class Ejercicio_74 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int cantidadObreros;
        int limiteSemanal;

        int obrero = 1;

        int obrerosCumplieron = 0;

        int mayorProduccion = 0;
        String obreroMayor = "";

        int produccionTotalBloquera = 0;

        System.out.println("Ingrese la cantidad de obreros:");
        cantidadObreros = teclado.nextInt();

        System.out.println("Ingrese el límite de unidades a producir por semana:");
        limiteSemanal = teclado.nextInt();

        do {

            teclado.nextLine();

            System.out.println("\n========== OBRERO #" + obrero + " ==========");

            String nombre;

            System.out.println("Ingrese el nombre del obrero:");
            nombre = teclado.nextLine();

            int dia = 1;
            int produccionSemanal = 0;

            do {

                System.out.println("Ingrese las unidades producidas el día " + dia + ":");
                int produccionDia = teclado.nextInt();
                produccionSemanal += produccionDia;
                dia++;

            } while (dia <= 7);

            double porcentaje = (double) produccionSemanal / limiteSemanal * 100;
            System.out.println("\n----- RESULTADO DEL OBRERO -----");
            System.out.println("Nombre: " + nombre);
            System.out.println("Total producido en la semana: " + produccionSemanal);
            System.out.println("Porcentaje respecto al límite: " + porcentaje + "%");

            if (produccionSemanal >= limiteSemanal) {
                obrerosCumplieron++;
            }

            if (produccionSemanal > mayorProduccion) {

                mayorProduccion = produccionSemanal;
                obreroMayor = nombre;
            }

            produccionTotalBloquera += produccionSemanal;

            obrero++;

        } while (obrero <= cantidadObreros);

        double porcentajeCumplieron = (double) obrerosCumplieron / cantidadObreros * 100;
        double promedioProduccion = (double) produccionTotalBloquera / cantidadObreros;

        System.out.println("\n========== RESULTADOS GENERALES ==========");
        System.out.println("Porcentaje de obreros que alcanzaron o superaron el límite: " + porcentajeCumplieron + "%");
        System.out.println("Obrero que más produjo: " + obreroMayor);
        System.out.println("Cantidad producida por el obrero: " + mayorProduccion);
        System.out.println("Promedio de producción semanal de la bloquera: " + promedioProduccion);
    }
}
