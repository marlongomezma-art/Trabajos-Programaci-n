public class Ejercicio_45 {

    public static void main(String[] args) {

        double A;
        double B;
        double C;
        double D;
        double X1;
        double X2;

        System.out.println("Digite el valor de A:");
        A = Double.parseDouble(System.console().readLine());

        System.out.println("Digite el valor de B:");
        B = Double.parseDouble(System.console().readLine());

        System.out.println("Digite el valor de C:");
        C = Double.parseDouble(System.console().readLine());

        D = Math.pow(B, 2) - 4 * A * C;

        if (D == 0) {

            X1 = -B / (2 * A);
            X2 = X1;

            System.out.println("X1 = " + X1);
            System.out.println("X2 = " + X2);

        } else if (D > 0) {

            X1 = (-B + Math.sqrt(D)) / (2 * A);
            X2 = (-B - Math.sqrt(D)) / (2 * A);

            System.out.println("X1 = " + X1);
            System.out.println("X2 = " + X2);

        } else {

            System.out.println("La ecuacion no tiene solucion en los Reales.");
        }
    }
}