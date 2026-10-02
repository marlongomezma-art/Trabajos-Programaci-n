public class Ejercicio_16 {
    public static void main(String[] args) {

        double largo, ancho, areaLamina;
        double consumoPieza, piezas, desperdicio;

        largo = 4;
        ancho = 1.5;
        consumoPieza = 0.5;

        areaLamina = largo * ancho;

        piezas = areaLamina / consumoPieza;

        desperdicio = areaLamina - (piezas * consumoPieza);

        System.out.println("Area de la lamina: " + areaLamina);
        System.out.println("Cantidad de piezas: " + piezas);
        System.out.println("Desperdicio: " + desperdicio);
    }
}