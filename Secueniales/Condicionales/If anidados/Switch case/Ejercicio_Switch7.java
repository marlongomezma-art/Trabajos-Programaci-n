import java.util.Scanner;

public class Ejercicio_Switch7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A, B, C, D;
        int N;
        int Resultado = 0;

        System.out.println("Digite el primer digito:");
        A = Integer.parseInt(teclado.nextLine());

        System.out.println("Digite el segundo digito:");
        B = Integer.parseInt(teclado.nextLine());

        System.out.println("Digite el tercer digito:");
        C = Integer.parseInt(teclado.nextLine());

        System.out.println("Digite el cuarto digito:");
        D = Integer.parseInt(teclado.nextLine());

        N = A * 1000 + B * 100 + C * 10 + D;

        int categoria;
        if (C < 5 && C >= 0) {
            categoria = 1;
        } else if (C >= 5) {
            categoria = 2;
        } else {
            categoria = 3;
        }

        switch (categoria) {
            case 1:
                Resultado = A * 1000 + B * 100;
                break;

            case 2:
                Resultado = A * 1000 + B * 100 + 100;
                break;

            case 3:
                Resultado = N;
                break;

            default:
                System.out.println("Valor no válido");
                break;
        }

        System.out.println("El numero es: " + N);
        System.out.println("El numero redondeado es: " + Resultado);
    }
}