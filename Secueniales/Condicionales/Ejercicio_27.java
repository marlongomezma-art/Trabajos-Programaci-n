public class Ejercicio_27 {

    public static void main(String[] args) {

        double Valor1, Valor2, Valor3;
        double Area;
        double Pi;

        System.out.println("Digite el valor 1:");
        Valor1 = Double.parseDouble(System.console().readLine());

        System.out.println("Digite el valor 2:");
        Valor2 = Double.parseDouble(System.console().readLine());

        System.out.println("Digite el tercer valor:");
        Valor3 = Double.parseDouble(System.console().readLine());

        Pi = 3.1416;

        // Triángulo
        Area = (Valor1 * Valor2) / 2;

        if (Area == Valor3) {

            System.out.println("La figura es un Triángulo");

        } else {

            // Círculo
            Area = Pi * Math.pow(Valor1, 2);

            if (Area == Valor3) {

                System.out.println("La figura es un Círculo");

            } else {

                // Rectángulo
                Area = Valor1 * Valor2;

                if (Area == Valor3) {

                    System.out.println("La figura es un Rectángulo");

                } else {

                    System.out.println("No coincide con ninguna de las figuras");
                }
            }
        }
    }
}