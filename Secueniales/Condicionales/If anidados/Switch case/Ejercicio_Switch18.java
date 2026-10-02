import java.util.Scanner;

public class Ejercicio_Switch18 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double hectareas;
        double metrosCuadrados;
        double pino;
        double oyamel;
        double cedro;
        double cantidadPinos;
        double cantidadOyameles;
        double cantidadCedros;

        System.out.println("Digite la cantidad de hectareas del bosque:");
        hectareas = teclado.nextDouble();

        int rango;

        if (hectareas > 0) {
            metrosCuadrados = hectareas * 10000;

            if (metrosCuadrados > 1000000) {
                rango = 1;
            } else {
                rango = 2;
            }
        } else {
            rango = 3;
        }

        switch (rango) {
            case 1:
                metrosCuadrados = hectareas * 10000;
                System.out.println("Metros cuadrados totales: " + metrosCuadrados);

                pino = metrosCuadrados * 70 / 100;
                oyamel = metrosCuadrados * 20 / 100;
                cedro = metrosCuadrados * 10 / 100;

                System.out.println("Bosque GRANDE (más de 1,000,000 m²)");

                if (pino > 0) {
                    cantidadPinos = pino * 8 / 10;
                    System.out.println("Cantidad de pinos: " + cantidadPinos);
                }

                if (oyamel > 0) {
                    cantidadOyameles = oyamel * 15 / 15;
                    System.out.println("Cantidad de oyameles: " + cantidadOyameles);
                }

                if (cedro > 0) {
                    cantidadCedros = cedro * 10 / 18;
                    System.out.println("Cantidad de cedros: " + cantidadCedros);
                }
                break;

            case 2:
                metrosCuadrados = hectareas * 10000;
                System.out.println("Metros cuadrados totales: " + metrosCuadrados);

                pino = metrosCuadrados * 50 / 100;
                oyamel = metrosCuadrados * 30 / 100;
                cedro = metrosCuadrados * 20 / 100;

                System.out.println("Bosque PEQUEÑO (1,000,000 m² o menos)");

                if (pino > 0) {
                    cantidadPinos = pino * 8 / 10;
                    System.out.println("Cantidad de pinos: " + cantidadPinos);
                }

                if (oyamel > 0) {
                    cantidadOyameles = oyamel * 15 / 15;
                    System.out.println("Cantidad de oyameles: " + cantidadOyameles);
                }

                if (cedro > 0) {
                    cantidadCedros = cedro * 10 / 18;
                    System.out.println("Cantidad de cedros: " + cantidadCedros);
                }
                break;

            case 3:
                System.out.println("Error: Las hectáreas deben ser mayor que 0.");
                break;

            default:
                break;
        }

    }
}

