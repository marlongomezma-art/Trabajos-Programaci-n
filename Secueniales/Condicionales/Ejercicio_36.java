public class Ejercicio_36 {

    public static void main(String[] args) {

        int Cantidad;
        int B50000, B20000, B10000, B5000, B2000;
        int B1000, B500, B100, B50, B20, B10;

        System.out.println("Digite la cantidad de Bolivares:");
        Cantidad = Integer.parseInt(System.console().readLine());

        B50000 = Cantidad / 50000;
        Cantidad = Cantidad % 50000;

        B20000 = Cantidad / 20000;
        Cantidad = Cantidad % 20000;

        B10000 = Cantidad / 10000;
        Cantidad = Cantidad % 10000;

        B5000 = Cantidad / 5000;
        Cantidad = Cantidad % 5000;

        B2000 = Cantidad / 2000;
        Cantidad = Cantidad % 2000;

        B1000 = Cantidad / 1000;
        Cantidad = Cantidad % 1000;

        B500 = Cantidad / 500;
        Cantidad = Cantidad % 500;

        B100 = Cantidad / 100;
        Cantidad = Cantidad % 100;

        B50 = Cantidad / 50;
        Cantidad = Cantidad % 50;

        B20 = Cantidad / 20;
        Cantidad = Cantidad % 20;

        B10 = Cantidad / 10;
        Cantidad = Cantidad % 10;

        System.out.println("Billetes de 50000: " + B50000);
        System.out.println("Billetes de 20000: " + B20000);
        System.out.println("Billetes de 10000: " + B10000);
        System.out.println("Billetes de 5000: " + B5000);
        System.out.println("Billetes de 2000: " + B2000);
        System.out.println("Billetes de 1000: " + B1000);
        System.out.println("Billetes de 500: " + B500);
        System.out.println("Billetes de 100: " + B100);
        System.out.println("Billetes de 50: " + B50);
        System.out.println("Billetes de 20: " + B20);
        System.out.println("Billetes de 10: " + B10);
    }
}