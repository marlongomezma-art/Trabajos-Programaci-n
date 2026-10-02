import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {

        int Niño, Joven, Adulto, Viejo;
        int res1 = 0;
        double pes_N, pes_J, pes_A, pes_V;
        double por_N, por_J, por_A, por_V;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de Niños que viven en el lugar:");
        Niño = teclado.nextInt();
        System.out.println("Ingrese la cantidad de Jóvenes que viven en el lugar:");
        Joven = teclado.nextInt();
        System.out.println("Ingrese la cantidad de Adultos que viven en el lugar:");
        Adulto = teclado.nextInt();
        System.out.println("Ingrese la cantidad de Viejos que viven en el lugar:");
        Viejo = teclado.nextInt();

        for (int cantidad = 100; cantidad >= res1; res1 = Niño + Joven + Adulto + Viejo) {
            System.out.println("Ingrese el peso del niño: ");
            pes_N = teclado.nextDouble();
            System.out.println("Ingrese el peso del joven: ");
            pes_J = teclado.nextDouble();
            System.out.println("Ingrese el peso del adulto: ");
            pes_A = teclado.nextDouble();
            System.out.println("Ingrese el peso del viejo: ");
            pes_V = teclado.nextDouble();

            pes_N = Niño * pes_N;
            pes_J = Joven * pes_J;
            pes_A = Adulto * pes_A;
            pes_V = Viejo * pes_V;

            por_N = pes_N / Niño;
            por_J = pes_J / Joven;
            por_A = pes_A / Adulto;
            por_V = pes_V / Viejo;

            System.out.println("La cantidad de Niños es de: " + Niño);
            System.out.println("La cantidad de Jóvenes es de: " + Joven);
            System.out.println("La cantidad de Adultos es de: " + Adulto);
            System.out.println("La cantidad de Viejos es de: " + Viejo);

            System.out.println("La cantidad de peso en los Niños es de: " + por_N);
            System.out.println("La cantidad de peso en los Jóvenes es de: " + por_J);
            System.out.println("La cantidad de peso en los Adultos es de: " + por_A);
            System.out.println("La cantidad de peso en los Viejos es de: " + por_V);
        }
    }
}