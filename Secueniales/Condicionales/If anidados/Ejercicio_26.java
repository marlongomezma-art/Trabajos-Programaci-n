import java.util.Scanner;
    public class Ejercicio_26 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int A, B, C, D;
            double Resultado;
            System.out.println("Ingrese el valor de de los datos ");

            System.out.println("Digite el valor de A:");
            A = Integer.parseInt(teclado.nextLine());
            System.out.println("Digite el valor de B:");
            B = Integer.parseInt(teclado.nextLine());
            System.out.println("Digite el valor de C:");
            C = Integer.parseInt(teclado.nextLine());
            System.out.println("Digite el valor de D:");
            D = Integer.parseInt(teclado.nextLine());

            if (D == 0) {

                Resultado =((A - C)*(A - C));

                System.out.println("El resultado es: " + Resultado);

            } else  {
                if ((D > 0) && (D <= 15)) {

                Resultado = ((A - B)*(A - B)*(A - B) / D);

                System.out.println("El resultado es: " + Resultado);
                }else {
                    System.out.println("El valor de D es muy alto y no quiero calcucalarlo");
                }
            }
        }
    }