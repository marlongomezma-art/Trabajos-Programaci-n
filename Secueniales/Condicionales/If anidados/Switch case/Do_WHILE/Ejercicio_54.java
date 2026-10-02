import java.util.Scanner;

public class Ejercicio_54 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int bajos = 0;
        int contadorPregunta = 1;
        int contadorCuestionario = 1;
        int altos = 0;

        int sumaTotal = 0;
        double mayorPromedio = 0;
        double menorPromedio = 0;
        double promedioAlto = 0;
        double promedioBajo = 0;

        int cuestionarioMayor = 0;
        int cuestionarioMenor = 0;

        do {

            System.out.println("Cuestionario numero " + contadorCuestionario);

            contadorPregunta = 1;

            do {

                System.out.println("Pregunta numero " + contadorPregunta);

                System.out.println("Cuanto puntaje tuvo en la pregunta 1:");
                int nota1 = teclado.nextInt();

                System.out.println("Cuanto puntaje tuvo en la pregunta 2:");
                int nota2 = teclado.nextInt();

                System.out.println("Cuanto puntaje tuvo en la pregunta 3:");
                int nota3 = teclado.nextInt();

                System.out.println("Cuanto puntaje tuvo en la pregunta 4:");
                int nota4 = teclado.nextInt();

                System.out.println("Cuanto puntaje tuvo en la pregunta 5:");
                int nota5 = teclado.nextInt();

                int suma = nota1 + nota2 + nota3 + nota4 + nota5;

                sumaTotal += suma;

                contadorPregunta++;

            } while (contadorPregunta <= 5);

            double promedio = (double) sumaTotal / contadorPregunta;

            if (promedio > mayorPromedio) {
                mayorPromedio = promedio;
                cuestionarioMayor = contadorCuestionario;
            }

            if (promedio < menorPromedio) {
                menorPromedio = promedio;
                cuestionarioMenor = contadorCuestionario;
            }

            if (promedio < 3) {
                bajos++;
            }

            if (promedio > 4) {
                altos++;
            }

            contadorCuestionario++;

        } while (contadorCuestionario <= 3);

        System.out.println("El promedio de todos los cuestionarios es de: " + sumaTotal);
        System.out.println("El promedio mas alto obtenido es de: " + mayorPromedio
                + " y su ubicacion es " + cuestionarioMayor);

        System.out.println("El promedio mas bajo obtenido es de: " + menorPromedio
                + " y su ubicacion es " + cuestionarioMenor);

        double porcentajeBajos = ((double) bajos / 3) * 100;

        System.out.println("El porcentaje de cuestionarios que tuvieron menor que 3 es: "
                + porcentajeBajos + "%");

        double porcentajeAltos = ((double) altos / 3) * 100;

        System.out.println("El porcentaje de cuestionarios que tuvieron mayor de 4 es: "
                + porcentajeAltos + "%");
    }
}