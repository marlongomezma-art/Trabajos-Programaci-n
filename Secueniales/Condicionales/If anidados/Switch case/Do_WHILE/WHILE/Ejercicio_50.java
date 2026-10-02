public class Ejercicio_50 {
    public static void main(String[] args) {

        int Marlon = 98;
        int Gomez = 0;

        while (Marlon <= 1003) {
            Gomez += Marlon;
            Marlon += 2;
        }

        System.out.println(Gomez);
    }
}
