
public class Ejercicio_8  {
    public static void main(String[] args) {
        Double a, b, c;
        Double P, A;
        System.out.println("Digite el valor del lado a:");
        a = Double.parseDouble(System.console().readLine());
        System.out.println("Digite el valor del lado b:");
        b = Double.parseDouble(System.console().readLine());
        System.out.println("Digite el valor del lado c:");
        c = Double.parseDouble(System.console().readLine());
        P = (a + b + c) / 2;
        A = Math.sqrt(P*(P - a)*(P - b)*(P - c));
        System.out.println("El area del triangulo es:" + A);
    }
}