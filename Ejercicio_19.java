public class Ejercicio_19 {
    public static void main(String[] args) {

        double presupuesto;
        double ginecologia, traumatologia, pediatria;

        System.out.println("Digite el presupuesto anual:");
        presupuesto = Double.parseDouble(System.console().readLine());

        ginecologia = presupuesto * 40 / 100;

        traumatologia = presupuesto * 30 / 100;

        pediatria = presupuesto * 30 / 100;

        System.out.println("Ginecologia recibe: " + ginecologia);
        System.out.println("Traumatologia recibe: " + traumatologia);
        System.out.println("Pediatria recibe: " + pediatria);
    }
}