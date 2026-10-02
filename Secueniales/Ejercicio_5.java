public class Ejercicio_5 {
    public static void main(String[]args) {

        int parcial1, parcial2, parcial3;
        double examen , trabajo;
        double Nota_parcial, Nota_Final, Nota_Examen, Nota_Trabajo;


            System.out.println("Digite la nota parcial 1:");
            parcial1 = Integer.parseInt(System.console().readLine());
            System.out.println("Digite la nota parcial 2:");
            parcial2 = Integer.parseInt(System.console().readLine());
            System.out.println("Digite la parcial 3:");
            parcial3 = Integer.parseInt(System.console().readLine());

            Nota_parcial = (parcial1 + parcial2 + parcial3)/3.0 * 0.55;
            System.out.println("la Nota parcial es: " + Nota_parcial);

            System.out.println("Digite la nota del examen:");
            examen = Double.parseDouble(System.console().readLine());
            Nota_Examen = (examen * 0.30);
            System.out.println("La nota del examen es: " + Nota_Examen);

            System.out.println("Digite la nota del trabajo:");
            trabajo = Double.parseDouble(System.console().readLine());
            Nota_Trabajo = (trabajo * 0.15);
            System.out.println("La nota del trabajo es: " + Nota_Trabajo);

            Nota_Final = Nota_parcial + Nota_Examen + Nota_Trabajo;
            System.out.println("La nota final es: " + Nota_Final);

      }
}
