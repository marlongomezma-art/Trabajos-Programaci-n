public class Ejercicio_7{
    public static void main(String[] args) {

        int Metros;
        double pulgadas, pies;
        System.out.println("Digite la cantidad en Metros:");
        Metros = Integer.parseInt(System.console().readLine());
        pulgadas = (Metros * 39.27);
        pies = (pulgadas / 12);
        System.out.println("La cantidad en pulgadas es:" + pulgadas);
        System.out.println("La cantidad en pies es:" + pies);
    }
}
