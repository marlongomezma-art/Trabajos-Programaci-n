
import java.util.Scanner;
    public class Ejercico_27 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            double Valor1, Valor2, Valor3;

            double Areatriangulo, Areacirculo, Arearectangulo;
            double Pi= 3.14;

            System.out.println("Digite el valor 1:");
            Valor1 = Double.parseDouble(teclado.nextLine());

            System.out.println("Digite el valor 2:");
            Valor2 = Double.parseDouble(teclado.nextLine());

            System.out.println("Digite el valor 2:");
            Valor3 = Double.parseDouble(teclado.nextLine());


            Areatriangulo = (Valor1 * Valor2) / 2;

            if (Areatriangulo == Valor3) {

                System.out.println("La figura es un Triángulo");

            } else {


                Areacirculo = Valor2 * (Valor1*Valor1);

                if (Areacirculo == Valor3) {

                    System.out.println("La figura es un Círculo");

                } else {


                    Arearectangulo = Valor1 * Valor2;

                    if (Arearectangulo == Valor3) {

                        System.out.println("La figura es un Rectángulo");

                    } else {

                        System.out.println("No coincide con ninguna de las figuras");
                    }
                }
            }
        }
    }











