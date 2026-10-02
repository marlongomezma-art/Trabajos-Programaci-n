public class Ejercicio_9 {
    public static void main(String[] args) {
        double horas, preciohora, Sueldobase, impuesto, Sueldoneto;
        System.out.println("Digite el número de horas trabajadas: ");
        horas = Double.parseDouble(System.console().readLine());
        System.out.println("Digite el precio por hora: ");
        preciohora = Double.parseDouble(System.console().readLine());   
        Sueldobase = horas * preciohora;
        impuesto = Sueldobase * 0.10;
        Sueldoneto = Sueldobase - impuesto;
        System.out.println("El sueldo base es: " + Sueldobase);
        System.out.println("El impuesto es: " + impuesto);
        System.out.println("El sueldo neto es: " + Sueldoneto);
    }
}