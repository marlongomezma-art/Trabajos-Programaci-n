public class Ejercicio_51 {
    public static void main(String[] args) {

        int Marlon = 6;
        int Gomez = 1;
        int Suma = 0;

        while (Gomez <= 12) {
            Suma += Marlon;
            Marlon += 5;
            Gomez++;
        }

        System.out.println("El termino doceavo es: " + (Marlon - 5));
        System.out.println("La suma de los 12 terminos es: " + Suma);
    }
}
