public class Ejercicio_50 {
    public static void main(String[] args) {

        int Marlon = 98;
        int Gomez = 0;

        do {
            Gomez += Marlon;
            Marlon += 2;
        } while (Marlon <= 1003);

        System.out.println(Gomez);
    }
}
