import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String pre_1, pre_2, pre_3;
        int A = 0, B = 0, C = 0, D = 0, E = 0, F = 0, G = 0, H = 0;

        for (int respuesta = 0; respuesta <= 100; respuesta++) {
            System.out.println("¿La persona respondió la pregunta 1 bien?: ");
            pre_1 = teclado.nextLine();
            System.out.println("¿La persona respondió la pregunta 2 bien?: ");
            pre_2 = teclado.nextLine();
            System.out.println("¿La persona respondió la pregunta 3 bien?: ");
            pre_3 = teclado.nextLine();

            if ((pre_1.equalsIgnoreCase("si")) && (pre_2.equalsIgnoreCase("si")) && (pre_3.equalsIgnoreCase("si"))) {
                A += 1;
            } else if (pre_1.equalsIgnoreCase("si") && pre_2.equalsIgnoreCase("si")) {
                B += 1;
            } else if (pre_1.equalsIgnoreCase("si") && pre_3.equalsIgnoreCase("si")) {
                C += 1;
            } else if (pre_2.equalsIgnoreCase("si") && pre_3.equalsIgnoreCase("si")) {
                D += 1;
            } else if (pre_1.equalsIgnoreCase("si")) {
                E += 1;
            } else if (pre_2.equalsIgnoreCase("si")) {
                F += 1;
            } else if (pre_3.equalsIgnoreCase("si")) {
                G += 1;
            } else {
                H += 1;
            }

            System.out.println("La cantidad de personas que respondieron : " + respuesta);
        }
        System.out.println("El porcentaje de personas que respondieron correctamente las tres preguntas: " + A + "%");
        System.out.println("El porcentaje de personas que respondieron correctamente solamente la primera y la segunda pregunta: " + B + "%");
        System.out.println("El porcentaje de personas que respondieron correctamente solamente la primera y la tercera pregunta: " + C + "%");
        System.out.println("El porcentaje de personas que respondieron correctamente solamente la segunda y la tercera pregunta: " + D + "%");
        System.out.println("El porcentaje de personas que respondieron correctamente la primera pregunta por lo menos: " + E + "%");
        System.out.println("El porcentaje de personas que respondieron correctamente la segunda pregunta por lo menos: " + F + "%");
        System.out.println("El porcentaje de personas que respondieron correctamente la tercera pregunta por lo menos: " + G + "%");
        System.out.println("El porcentaje de personas que además no respondieron correctamente ninguna pregunta: " + H + "%");
    }
}
