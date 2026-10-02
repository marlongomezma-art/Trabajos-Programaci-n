package Ejercicio_59j;

import java.util.Scanner;

public class Ejercicio_76 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int cantidadGrupos;
        int grupo = 1;

        double sumaPromediosGrupos = 0;

        System.out.println("Ingrese la cantidad de grupos:");
        cantidadGrupos = teclado.nextInt();

        do {

            System.out.println("\n========== GRUPO #" + grupo + " ==========");

            int cantidadAlumnos;
            int alumno = 1;

            double sumaPromediosAlumnos = 0;

            System.out.println("Ingrese la cantidad de alumnos del grupo:");
            cantidadAlumnos = teclado.nextInt();

            do {

                System.out.println("\n------ ALUMNO #" + alumno + " ------");

                int cantidadMaterias;
                int materia = 1;

                double sumaPromediosMaterias = 0;

                System.out.println("Ingrese la cantidad de materias del alumno:");
                cantidadMaterias = teclado.nextInt();

                do {

                    System.out.println("\nMateria #" + materia);

                    int calificacion = 1;
                    double sumaCalificaciones = 0;

                    do {

                        System.out.println("Ingrese la calificación #" + calificacion + ":");
                        double nota = teclado.nextDouble();
                        sumaCalificaciones += nota;
                        calificacion++;

                    } while (calificacion <= 3);

                    double promedioMateria = sumaCalificaciones / 3;
                    System.out.println("Promedio de la materia: " + promedioMateria);
                    sumaPromediosMaterias += promedioMateria;
                    materia++;

                } while (materia <= cantidadMaterias);

                double promedioAlumno = sumaPromediosMaterias / cantidadMaterias;
                System.out.println("Promedio del alumno #" + alumno + ": " + promedioAlumno);
                sumaPromediosAlumnos += promedioAlumno;
                alumno++;

            } while (alumno <= cantidadAlumnos);

            double promedioGrupo = sumaPromediosAlumnos / cantidadAlumnos;
            System.out.println("\nPromedio del grupo #" + grupo + ": " + promedioGrupo);
            sumaPromediosGrupos += promedioGrupo;
            grupo++;

        } while (grupo <= cantidadGrupos);

        double promedioGeneral = sumaPromediosGrupos / cantidadGrupos;
        System.out.println("\n========== RESULTADO GENERAL ==========");
        System.out.println("Promedio general de todos los grupos: " + promedioGeneral);
    }
}
