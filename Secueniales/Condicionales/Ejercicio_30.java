public class Ejercicio_30 {

    public static void main(String[] args) {

        int A, B, C, D;
        int N;
        int Resultado;

        System.out.println("Digite el primer digito:");
        A = Integer.parseInt(System.console().readLine());

        System.out.println("Digite el segundo digito:");
        B = Integer.parseInt(System.console().readLine());

        System.out.println("Digite el tercer digito:");
        C = Integer.parseInt(System.console().readLine());

        System.out.println("Digite el cuarto digito:");
        D = Integer.parseInt(System.console().readLine());

        N = A * 1000 + B * 100 + C * 10 + D;

        Resultado = (int) (Math.round(N / 100.0) * 100);

        System.out.println("El numero es: " + N);
        System.out.println("El numero redondeado es: " + Resultado);
    }
}