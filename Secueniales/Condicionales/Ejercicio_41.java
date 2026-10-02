public class Ejercicio_41 {

    public static void main(String[] args) {

        double Hectareas;
        double Metros_Cuadrados;
        double Pino;
        double Oyamel;
        double Cedro;
        double Cantidad_Pinos;
        double Cantidad_Oyameles;
        double Cantidad_Cedros;

        System.out.println("Digite la cantidad de hectareas del bosque:");
        Hectareas = Double.parseDouble(System.console().readLine());

        Metros_Cuadrados = Hectareas * 10000;

        if (Metros_Cuadrados > 1000000) {

            Pino = Metros_Cuadrados * 70 / 100;
            Oyamel = Metros_Cuadrados * 20 / 100;
            Cedro = Metros_Cuadrados * 10 / 100;

        } else {

            Pino = Metros_Cuadrados * 50 / 100;
            Oyamel = Metros_Cuadrados * 30 / 100;
            Cedro = Metros_Cuadrados * 20 / 100;
        }

        Cantidad_Pinos = Pino * 8 / 10;
        Cantidad_Oyameles = Oyamel * 15 / 15;
        Cantidad_Cedros = Cedro * 10 / 18;

        System.out.println("Cantidad de pinos: " + Cantidad_Pinos);
        System.out.println("Cantidad de oyameles: " + Cantidad_Oyameles);
        System.out.println("Cantidad de cedros: " + Cantidad_Cedros);
    }
}