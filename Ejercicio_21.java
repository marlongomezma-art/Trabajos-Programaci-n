public class Ejercicio_21 {
    public static void main(String[] args) {

        double naranjas, precioDocena, ventaTotal;
        double docenas, inversion, ganancia, porcentaje;

        System.out.println("Digite la cantidad de naranjas:");
        naranjas = Double.parseDouble(System.console().readLine());

        System.out.println("Digite el precio de la docena:");
        precioDocena = Double.parseDouble(System.console().readLine());

        System.out.println("Digite el dinero obtenido por la venta:");
        ventaTotal = Double.parseDouble(System.console().readLine());

        docenas = naranjas / 12;

        inversion = docenas * precioDocena;

        ganancia = ventaTotal - inversion;

        porcentaje = ganancia * 100 / inversion;

        System.out.println("La inversion fue: " + inversion);
        System.out.println("La ganancia fue: " + ganancia);
        System.out.println("El porcentaje de ganancia es: " + porcentaje + "%");
    }
}   