import java.util.Scanner;

public class Ejercicio_59 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double notaMate;
        double notaProgra;
        double notaIngles;

        double menorProgra = 5;
        double sumaProgra = 0;

        int alumnos = 0;
        int noIngles = 0;
        int siIngles = 0;
        int todasAprobadas = 0;

        int siMate = 0;
        int noMate = 0;

        String respuesta;

        do {

            alumnos++;

            System.out.println("\n===== ALUMNO #" + alumnos + " =====");

            System.out.println("Ingrese la nota de Matemática:");
            notaMate = teclado.nextDouble();

            System.out.println("Ingrese la nota de Programación:");
            notaProgra = teclado.nextDouble();

            System.out.println("Ingrese la nota de Inglés:");
            notaIngles = teclado.nextDouble();

            if (notaProgra < menorProgra) {
                menorProgra = notaProgra;
            }

            sumaProgra += notaProgra;

            if (notaIngles == 0) {
                noIngles++;
            } else {
                siIngles++;
            }

            if (notaMate >= 3 && notaProgra >= 3 && notaIngles >= 3) {
                todasAprobadas++;
            }

            if (notaMate != 0) {

                siMate++;

                if (notaMate < 3) {
                    noMate++;
                }
            }

            teclado.nextLine();

            System.out.println("¿Desea ingresar otro alumno? (si/no)");
            respuesta = teclado.nextLine();

        } while (respuesta.equalsIgnoreCase("si"));

        double promedioProgra = sumaProgra / alumnos;
        double porcentajeIngles = (double) noIngles / siIngles * 100;
        double porcentajeMate = (double) noMate / siMate * 100;

        System.out.println("\n========== RESULTADOS ==========");

        System.out.println("a. Nota menor de Programación: " + menorProgra);

        System.out.println("b. Porcentaje de alumnos que no presentaron Inglés respecto a los que sí presentaron: "
                + porcentajeIngles + "%");

        System.out.println("c. Número de alumnos que aprobaron todas las materias: "
                + todasAprobadas);

        System.out.println("d. Promedio general en Programación: "
                + promedioProgra);

        System.out.println("e. Porcentaje de alumnos que reprobaron Matemática respecto a los que presentaron: "
                + porcentajeMate + "%");
    }
}