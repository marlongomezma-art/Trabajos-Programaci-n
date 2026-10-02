public class Ejercicio_17 {
    public static void main(String[] args) {

        double precioFinal, pvp;
        double descuento, porcentaje;

        System.out.println("Digite el precio final:");
        precioFinal = Double.parseDouble(System.console().readLine());

        System.out.println("Digite el precio de venta al publico:");
        pvp = Double.parseDouble(System.console().readLine());

        descuento = pvp - precioFinal;

        porcentaje = descuento * 100 / pvp;

        System.out.println("El descuento es: " + descuento);
        System.out.println("El porcentaje de descuento es: " + porcentaje + "%");
    }
}