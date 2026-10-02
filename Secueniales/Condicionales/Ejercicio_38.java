public class Ejercicio_38 {

    public static void main(String[] args) {

        int Dia, Mes, Anio;
        int Dia_Actual, Mes_Actual, Anio_Actual;
        int Edad;
        String Signo;

        System.out.println("Digite el dia de nacimiento:");
        Dia = Integer.parseInt(System.console().readLine());

        System.out.println("Digite el mes de nacimiento:");
        Mes = Integer.parseInt(System.console().readLine());

        System.out.println("Digite el año de nacimiento:");
        Anio = Integer.parseInt(System.console().readLine());

        System.out.println("Digite el dia actual:");
        Dia_Actual = Integer.parseInt(System.console().readLine());

        System.out.println("Digite el mes actual:");
        Mes_Actual = Integer.parseInt(System.console().readLine());

        System.out.println("Digite el año actual:");
        Anio_Actual = Integer.parseInt(System.console().readLine());

        Edad = Anio_Actual - Anio;

        if (Mes_Actual < Mes || (Mes_Actual == Mes && Dia_Actual < Dia)) {

            Edad = Edad - 1;
        }

        if ((Mes == 11 && Dia >= 22) || (Mes == 12 && Dia <= 21)) {

            Signo = "Sagitario";

        } else if ((Mes == 12 && Dia >= 22) || (Mes == 1 && Dia <= 20)) {

            Signo = "Capricornio";

        } else if ((Mes == 1 && Dia >= 21) || (Mes == 2 && Dia <= 19)) {

            Signo = "Acuario";

        } else if ((Mes == 2 && Dia >= 20) || (Mes == 3 && Dia <= 19)) {

            Signo = "Piscis";

        } else if ((Mes == 3 && Dia >= 21) || (Mes == 4 && Dia <= 20)) {

            Signo = "Aries";

        } else if ((Mes == 4 && Dia >= 21) || (Mes == 5 && Dia <= 21)) {

            Signo = "Tauro";

        } else if ((Mes == 5 && Dia >= 22) || (Mes == 6 && Dia <= 21)) {

            Signo = "Geminis";

        } else if ((Mes == 6 && Dia >= 22) || (Mes == 7 && Dia <= 22)) {

            Signo = "Cancer";

        } else if ((Mes == 7 && Dia >= 23) || (Mes == 8 && Dia <= 23)) {

            Signo = "Leo";

        } else if ((Mes == 8 && Dia >= 24) || (Mes == 9 && Dia <= 22)) {

            Signo = "Virgo";

        } else if ((Mes == 9 && Dia >= 23) || (Mes == 10 && Dia <= 22)) {

            Signo = "Libra";

        } else {

            Signo = "Escorpion";
        }

        System.out.println("El signo del zodiaco es: " + Signo);
        System.out.println("La edad de la persona es: " + Edad);
    }
}