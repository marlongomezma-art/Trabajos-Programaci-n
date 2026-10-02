public class Ejercicio_14 {
    public static void main(String[] args) {

        double a, b, c, d, e, f;
        double x, y;

        System.out.println("Digite a:");
        a = Double.parseDouble(System.console().readLine());

        System.out.println("Digite b:");
        b = Double.parseDouble(System.console().readLine());

        System.out.println("Digite c:");
        c = Double.parseDouble(System.console().readLine());

        System.out.println("Digite d:");
        d = Double.parseDouble(System.console().readLine());

        System.out.println("Digite e:");
        e = Double.parseDouble(System.console().readLine());

        System.out.println("Digite f:");
        f = Double.parseDouble(System.console().readLine());

        x = (c * e - b * f) / (a * e - b * d);

        y = (a * f - c * d) / (a * e - b * d);

        System.out.println("El valor de X es: " + x);
        System.out.println("El valor de Y es: " + y);
    }
}