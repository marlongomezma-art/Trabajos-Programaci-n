public class Ejercicio_13 {
    public static void main(String[] args) {

        double n1, n2, n3, n4, n5, n6, n7, n8;
        double total;

        System.out.println("Digite cantidad de billetes de 50000:");
        n1 = Double.parseDouble(System.console().readLine());

        System.out.println("Digite cantidad de billetes de 20000:");
        n2 = Double.parseDouble(System.console().readLine());

        System.out.println("Digite cantidad de billetes de 10000:");
        n3 = Double.parseDouble(System.console().readLine());

        System.out.println("Digite cantidad de billetes de 5000:");
        n4 = Double.parseDouble(System.console().readLine());

        System.out.println("Digite cantidad de billetes de 2000:");
        n5 = Double.parseDouble(System.console().readLine());

        System.out.println("Digite cantidad de billetes de 1000:");
        n6 = Double.parseDouble(System.console().readLine());

        System.out.println("Digite cantidad de billetes de 500:");
        n7 = Double.parseDouble(System.console().readLine());

        System.out.println("Digite cantidad de billetes de 100:");
        n8 = Double.parseDouble(System.console().readLine());

        total = n1 * 50000
              + n2 * 20000
              + n3 * 10000
              + n4 * 5000
              + n5 * 2000
              + n6 * 1000
              + n7 * 500
              + n8 * 100;

        System.out.println("El dinero total es: " + total);
    }
}