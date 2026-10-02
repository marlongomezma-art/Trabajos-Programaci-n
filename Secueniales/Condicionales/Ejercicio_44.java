public class Ejercicio_44 {

    public static void main(String[] args) {

        double Hipoteca;
        double Inversion_Total;
        double Inversion_Persona;
        double Inversion_Socio;
        double Resto;

        System.out.println("Digite el monto de la hipoteca:");
        Hipoteca = Double.parseDouble(System.console().readLine());

        System.out.println("Digite el monto total de la inversion:");
        Inversion_Total = Double.parseDouble(System.console().readLine());

        if (Hipoteca < 1000000) {

            Inversion_Persona = Inversion_Total * 50 / 100;
            Inversion_Socio = Inversion_Total * 50 / 100;

        } else {

            Resto = Inversion_Total - Hipoteca;

            Inversion_Persona = Hipoteca + Resto / 2;
            Inversion_Socio = Resto / 2;
        }

        System.out.println("La inversion de la persona es: " + Inversion_Persona);
        System.out.println("La inversion del socio es: " + Inversion_Socio);
    }
}