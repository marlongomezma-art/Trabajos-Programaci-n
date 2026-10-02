public class Ejercicio_43 {

    public static void main(String[] args) {

        double Capital;
        double Prestamo;
        double Nuevo_Saldo;
        double Resto;
        double Insumos;
        double Incentivos;

        System.out.println("Digite el capital actual:");
        Capital = Double.parseDouble(System.console().readLine());

        if (Capital < 0) {

            Prestamo = 10000 - Capital;
            Nuevo_Saldo = 10000;

        } else if (Capital <= 20000) {

            Prestamo = 20000 - Capital;
            Nuevo_Saldo = 20000;

        } else {

            Prestamo = 0;
            Nuevo_Saldo = Capital;
        }

        Resto = Nuevo_Saldo - 5000 - 2000;

        Insumos = Resto / 2;
        Incentivos = Resto / 2;

        System.out.println("El prestamo bancario es: " + Prestamo);
        System.out.println("La cantidad para insumos es: " + Insumos);
        System.out.println("La cantidad para incentivos es: " + Incentivos);
    }
}