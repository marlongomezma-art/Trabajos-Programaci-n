public class Ejercicio_33 {

    public static void main(String[] args) {

        String Nombre;
        double Compra;
        double Porcentaje_Descuento;
        double Descuento;
        double Pago;

        System.out.println("Digite el nombre del cliente:");
        Nombre = System.console().readLine();

        System.out.println("Digite el monto de la compra:");
        Compra = Double.parseDouble(System.console().readLine());

        if (Compra < 500) {

            Porcentaje_Descuento = 0;

        } else if (Compra <= 1000) {

            Porcentaje_Descuento = 5;

        } else if (Compra <= 7000) {

            Porcentaje_Descuento = 11;

        } else if (Compra <= 15000) {

            Porcentaje_Descuento = 18;

        } else {

            Porcentaje_Descuento = 25;
        }

        Descuento = Compra * Porcentaje_Descuento / 100;
        Pago = Compra - Descuento;

        System.out.println("Nombre del cliente: " + Nombre);
        System.out.println("Monto de la compra: " + Compra);
        System.out.println("Descuento recibido: " + Descuento);
        System.out.println("Monto a pagar: " + Pago);
    }
}