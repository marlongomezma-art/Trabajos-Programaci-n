import java.util.Scanner;

public class Ejercicio_54 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int bajos = 0;
        int altos = 0;
        int contadorCuestionario = 1;
        int sumaTotal = 0;

        double mayorPromedio = 0;
        double menorPromedio = 999;
        int cuestionarioMayor = 0;
        int cuestionarioMenor = 0;

        while (contadorCuestionario <= 3) {

            System.out.println("Cuestionario numero " + contadorCuestionario);

            int contadorPregunta = 1;
            int suma = 0;

            while (contadorPregunta <= 5) {

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

                suma = nota1 + nota2 + nota3 + nota4 + nota5;

                contadorPregunta++;
            }

            double promedio = (double) suma / 5;

            sumaTotal += suma;

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
        }

        double promedioGeneral = (double) sumaTotal / 15;
        double porcentajeBajos = (double) bajos / 3 * 100;
        double porcentajeAltos = (double) altos / 3 * 100;

        System.out.println("El promedio de todos los cuestionarios es: " + promedioGeneral);
        System.out.println("El promedio mas alto es: " + mayorPromedio);
        System.out.println("Su ubicacion es: " + cuestionarioMayor);
        System.out.println("El promedio mas bajo es: " + menorPromedio);
        System.out.println("Su ubicacion es: " + cuestionarioMenor);
        System.out.println("Porcentaje de cuestionarios menores que 3: " + porcentajeBajos + "%");
        System.out.println("Porcentaje de cuestionarios mayores que 4: " + porcentajeAltos + "%");
    }
}
