public class Ejercicio_23 {
    public static void main(String[] args) {

        double M, N, B1, B2, B3, B4;
        double bultos, cajas;
        double sobranteHarina, sobranteAceite;
        double ingresoHarina, ingresoAceite;
        double ingresoDetalle, ingresoTotal;

        System.out.println("Digite los kilogramos de harina:");
        M = Double.parseDouble(System.console().readLine());

        System.out.println("Digite los litros de aceite:");
        N = Double.parseDouble(System.console().readLine());

        System.out.println("Digite el precio del bulto de harina:");
        B1 = Double.parseDouble(System.console().readLine());

        System.out.println("Digite el precio de la caja de aceite:");
        B2 = Double.parseDouble(System.console().readLine());

        System.out.println("Digite el precio del kilogramo de harina:");
        B3 = Double.parseDouble(System.console().readLine());

        System.out.println("Digite el precio del litro de aceite:");
        B4 = Double.parseDouble(System.console().readLine());

        bultos = M / 24;

        cajas = N / 15;

        sobranteHarina = M % 24;

        sobranteAceite = N % 15;

        ingresoHarina = bultos * B1;

        ingresoAceite = cajas * B2;

        ingresoDetalle = sobranteHarina * B3
                       + sobranteAceite * B4;

        ingresoTotal = ingresoHarina
                     + ingresoAceite
                     + ingresoDetalle;

        System.out.println("Ingreso por harina: " + ingresoHarina);
        System.out.println("Ingreso por aceite: " + ingresoAceite);
        System.out.println("Ingreso por sobrantes: " + ingresoDetalle);
        System.out.println("Ingreso total: " + ingresoTotal);
    }
}