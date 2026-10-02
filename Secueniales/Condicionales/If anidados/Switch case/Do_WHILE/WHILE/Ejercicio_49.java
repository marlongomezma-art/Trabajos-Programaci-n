
import java.util.Scanner;

public class Ejercicio_49 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int persona = 0;

        String pregunta1, pregunta2, pregunta3;

        int tresPreguntas = 0;
        int primeraSegunda = 0;
        int primeraTercera = 0;
        int segundaTercera = 0;
        int primera = 0;
        int segunda = 0;
        int tercera = 0;
        int ninguna = 0;

        while (persona < 100) {

            persona++;

            System.out.println("¿La persona respondió correctamente la pregunta 1?");
            pregunta1 = teclado.nextLine();

            System.out.println("¿La persona respondió correctamente la pregunta 2?");
            pregunta2 = teclado.nextLine();

            System.out.println("¿La persona respondió correctamente la pregunta 3?");
            pregunta3 = teclado.nextLine();

            if (pregunta1.equalsIgnoreCase("si") &&
                    pregunta2.equalsIgnoreCase("si") &&
                    pregunta3.equalsIgnoreCase("si")) {

                tresPreguntas++;

            } else if (pregunta1.equalsIgnoreCase("si") &&
                    pregunta2.equalsIgnoreCase("si")) {

                primeraSegunda++;

            } else if (pregunta1.equalsIgnoreCase("si") &&
                    pregunta3.equalsIgnoreCase("si")) {

                primeraTercera++;

            } else if (pregunta2.equalsIgnoreCase("si") &&
                    pregunta3.equalsIgnoreCase("si")) {

                segundaTercera++;

            } else if (pregunta1.equalsIgnoreCase("si")) {

                primera++;

            } else if (pregunta2.equalsIgnoreCase("si")) {

                segunda++;

            } else if (pregunta3.equalsIgnoreCase("si")) {

                tercera++;

            } else {

                ninguna++;
            }
        }

        System.out.println("Personas que respondieron correctamente las tres preguntas: " + tresPreguntas);
        System.out.println("Personas que respondieron correctamente solamente la primera y segunda: " + primeraSegunda);
        System.out.println("Personas que respondieron correctamente solamente la primera y tercera: " + primeraTercera);
        System.out.println("Personas que respondieron correctamente solamente la segunda y tercera: " + segundaTercera);
        System.out.println("Personas que respondieron correctamente solamente la primera: " + primera);
        System.out.println("Personas que respondieron correctamente solamente la segunda: " + segunda);
        System.out.println("Personas que respondieron correctamente solamente la tercera: " + tercera);
        System.out.println("Personas que no respondieron correctamente ninguna pregunta: " + ninguna);
    }
}


