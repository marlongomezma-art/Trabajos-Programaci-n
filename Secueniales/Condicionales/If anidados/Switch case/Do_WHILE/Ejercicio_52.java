import java.util.Scanner;

public class Ejercicio_52 {
    public static void main(String[] args) {

        int Marlon, Gomez, Carlos, Pedro;
        int contador = 0;
        int cantidad = 100;

        double peso_M, peso_G, peso_C, peso_P;
        double promedio_M, promedio_G, promedio_C, promedio_P;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de Niños que viven en el lugar");
        Marlon = entrada.nextInt();

        System.out.println("Ingrese la cantidad de Jovenes que viven en el lugar");
        Gomez = entrada.nextInt();

        System.out.println("Ingrese la cantidad de Adultos que viven en el lugar");
        Carlos = entrada.nextInt();

        System.out.println("Ingrese la cantidad de Viejos que viven en el lugar");
        Pedro = entrada.nextInt();

        do {

            System.out.println("Ingrese el peso de los Niños:");
            peso_M = entrada.nextDouble();

            System.out.println("Ingrese el peso de los Jovenes:");
            peso_G = entrada.nextDouble();

            System.out.println("Ingrese el peso de los Adultos:");
            peso_C = entrada.nextDouble();

            System.out.println("Ingrese el peso de los Viejos:");
            peso_P = entrada.nextDouble();

            contador++;

            peso_M = Marlon * peso_M;
            peso_G = Gomez * peso_G;
            peso_C = Carlos * peso_C;
            peso_P = Pedro * peso_P;

            promedio_M = peso_M / Marlon;
            promedio_G = peso_G / Gomez;
            promedio_C = peso_C / Carlos;
            promedio_P = peso_P / Pedro;

            System.out.println("La cantidad de Niños es: " + Marlon);
            System.out.println("La cantidad de Jovenes es: " + Gomez);
            System.out.println("La cantidad de Adultos es: " + Carlos);
            System.out.println("La cantidad de Viejos es: " + Pedro);

            System.out.println("El peso promedio de los Niños es: " + promedio_M);
            System.out.println("El peso promedio de los Jovenes es: " + promedio_G);
            System.out.println("El peso promedio de los Adultos es: " + promedio_C);
            System.out.println("El peso promedio de los Viejos es: " + promedio_P);

        } while (contador < cantidad);
    }
}
