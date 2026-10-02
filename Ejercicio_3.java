public class Ejercicio_3 {
    public static void  main(String[] args) {
        int sueldoBase;
        int Venta1,Venta2,Venta3;
        Double comision;
        Double sueldoTotal;

        System.out.println("Digite el valor de su sueldoBase:");
        sueldoBase = Integer.parseInt(System.console().readLine());
        System.out.println("Digite el valor de la venta 1:");
        Venta1= Integer.parseInt(System.console().readLine());
        System.out.println("Digite el valor de la venta 2:");
        Venta2= Integer.parseInt(System.console().readLine());
        System.out.println("Digite el valor de la venta 3:");
        Venta3= Integer.parseInt(System.console().readLine());
        comision = Double.parseDouble(String.valueOf(Venta1+Venta2+Venta3))*0.10;
        sueldoTotal = (sueldoBase + comision);
        System.out.println("El sueldo total es: " + sueldoTotal);

    }

}