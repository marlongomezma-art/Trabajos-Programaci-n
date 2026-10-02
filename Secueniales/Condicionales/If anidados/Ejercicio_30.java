import java.util.Scanner;
    public class Ejercicio_30{
        public static void main(String[] args){
          Scanner teclado = new Scanner(System.in);
            int A, B, C, D;
            int N;
            int Resultado=0;

            System.out.println("Digite el primer digito:");
            A = Integer.parseInt(teclado.nextLine());

            System.out.println("Digite el segundo digito:");
            B = Integer.parseInt(teclado.nextLine());

            System.out.println("Digite el tercer digito:");
            C = Integer.parseInt(teclado.nextLine());

            System.out.println("Digite el cuarto digito:");
            D = Integer.parseInt(teclado.nextLine());
            N = A * 1000 + B * 100 + C * 10 + D;

            if ((C < 5)&&(C >= 0)) {
                Resultado = A * 1000 + B * 100;
            }
             else {
                if (C >= 5) {
                    Resultado = A * 1000 + B * 100 + 100;
                } else {
                    Resultado = N;
                }
            }
            System.out.println("El numero es: " + N);
            System.out.println("El numero redondeado es: " + Resultado);
        }
}



