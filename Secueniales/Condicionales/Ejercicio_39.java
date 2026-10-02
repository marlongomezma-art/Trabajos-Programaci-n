public class Ejercicio_39 {

    public static void main(String[] args) {

        double Valor;
        double Porcentaje_Depreciacion;
        double Porcentaje_Incremento;
        double Depreciacion;
        double Incremento;

        System.out.println("Digite el valor del automovil y del terreno:");
        Valor = Double.parseDouble(System.console().readLine());

        System.out.println("Digite el porcentaje de depreciacion del automovil:");
        Porcentaje_Depreciacion = Double.parseDouble(System.console().readLine());

        System.out.println("Digite el porcentaje de incremento del terreno:");
        Porcentaje_Incremento = Double.parseDouble(System.console().readLine());

        Depreciacion = Valor * Porcentaje_Depreciacion / 100;

        Incremento = Valor * Porcentaje_Incremento / 100;

        if (Depreciacion <= Incremento / 2) {

            System.out.println("Debe comprar el automovil.");

        } else {

            System.out.println("No debe comprar el automovil.");
        }

        System.out.println("La depreciacion del automovil es: " + Depreciacion);
        System.out.println("El incremento del terreno es: " + Incremento);
    }
}