public class Ejercicio_37 {

    public static void main(String[] args) {

        double A, B, C;
        double S, Area;
        double Mayor;
        double Menor1, Menor2;

        System.out.println("Digite el lado A:");
        A = Double.parseDouble(System.console().readLine());

        System.out.println("Digite el lado B:");
        B = Double.parseDouble(System.console().readLine());

        System.out.println("Digite el lado C:");
        C = Double.parseDouble(System.console().readLine());

        if (A >= B && A >= C) {

            Mayor = A;
            Menor1 = B;
            Menor2 = C;

        } else if (B >= A && B >= C) {

            Mayor = B;
            Menor1 = A;
            Menor2 = C;

        } else {

            Mayor = C;
            Menor1 = A;
            Menor2 = B;
        }

        if (Menor1 + Menor2 > Mayor) {

            S = (A + B + C) / 2;
            Area = Math.sqrt(S * (S - A) * (S - B) * (S - C));

            System.out.println("Los datos corresponden a un triangulo.");
            System.out.println("Area del triangulo: " + Area);

            if (A == B && B == C) {

                System.out.println("El triangulo es Equilatero.");

            } else if (A == B || A == C || B == C) {

                System.out.println("El triangulo es Isosceles.");

            } else {

                System.out.println("El triangulo es Escaleno.");
            }

        } else {

            System.out.println("Los lados no forman un triangulo.");
        }
    }
}