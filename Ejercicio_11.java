public class Ejercicio_11 {
    public static void main(String[] args) {

        String nombre;

        double horasNormales, pagoHora, horasExtras;
        double sueldoBase, pagoHoraExtra, pagoHorasExtras;

        double paroForzoso, politicaHabitacional, cajaAhorro;
        double totalDeducciones;

        double actualizacionAcademica;
        double numeroHijos, asignacionHijos, primaHogar;
        double totalAsignaciones;

        double sueldoNeto;

        System.out.println("Digite el nombre del trabajador:");
        nombre = System.console().readLine();

        System.out.println("Digite el numero de horas normales trabajadas:");
        horasNormales = Double.parseDouble(System.console().readLine());

        System.out.println("Digite el pago de una hora normal:");
        pagoHora = Double.parseDouble(System.console().readLine());

        System.out.println("Digite el numero de horas extras trabajadas:");
        horasExtras = Double.parseDouble(System.console().readLine());

        System.out.println("Digite el numero de hijos:");
        numeroHijos = Double.parseDouble(System.console().readLine());

        sueldoBase = horasNormales * pagoHora;

        pagoHoraExtra = pagoHora * 25 / 100;

        pagoHorasExtras = horasExtras * pagoHoraExtra;

        paroForzoso = sueldoBase * 5 / 100;

        politicaHabitacional = sueldoBase * 2 / 100;

        cajaAhorro = sueldoBase * 7 / 100;

        totalDeducciones = paroForzoso + politicaHabitacional + cajaAhorro;

        actualizacionAcademica = 25000;

        asignacionHijos = numeroHijos * 17300;

        primaHogar = 18000;

        totalAsignaciones = actualizacionAcademica + asignacionHijos+ primaHogar;
        
        sueldoNeto = sueldoBase + pagoHorasExtras + totalAsignaciones - totalDeducciones;

        System.out.println("Digite el nombre del trabajador: " + nombre);
        System.out.println("Sueldo base: " + sueldoBase);
        System.out.println("Pago por horas extras: " + pagoHorasExtras);

        System.out.println("Deduccion por paro forzoso: " + paroForzoso);
        System.out.println("Deduccion por politica habitacional: " + politicaHabitacional);
        System.out.println("Deduccion por caja de ahorro: " + cajaAhorro);

        System.out.println("Total de deducciones: " + totalDeducciones);

        System.out.println("Asignacion por actualizacion academica: "
                           + actualizacionAcademica);

        System.out.println("Asignacion por hijos: " + asignacionHijos);

        System.out.println("Prima por hogar: " + primaHogar);

        System.out.println("Total de asignaciones: " + totalAsignaciones);

        System.out.println("El sueldo neto de " + nombre  + " es: " + sueldoNeto);
    }
}