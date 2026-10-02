public class Ejercicio_22 {
    public static void main(String[] args) {

        double precioContado, cuota;
        double totalCuotas, recargo, porcentaje;

        System.out.println("Digite el precio al contado:");
        precioContado = Double.parseDouble(System.console().readLine());

        System.out.println("Digite el valor de cada cuota:");
        cuota = Double.parseDouble(System.console().readLine());

        totalCuotas = cuota * 12;

        recargo = totalCuotas - precioContado;

        porcentaje = recargo * 100 / precioContado;

        System.out.println("Total pagando a cuotas: " + totalCuotas);
        System.out.println("Recargo: " + recargo);
        System.out.println("Porcentaje de recargo: " + porcentaje + "%");
    }
}