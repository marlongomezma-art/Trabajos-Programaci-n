
public class Ejercicio_20 {
    public static void main(String[] args) {

        double capital, intereses, razon;

        System.out.println("Digite el valor del prestamo:");
        capital = Double.parseDouble(System.console().readLine());

        System.out.println("Digite el valor de los intereses:");
        intereses = Double.parseDouble(System.console().readLine());

        razon = intereses * 100 / (capital * 4);

        System.out.println("El porcentaje anual es: " + razon + "%");
    }
}