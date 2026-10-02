import java.util.Scanner;

public class Ejercicio_Switch15 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int Dia, Mes, Anio;
        int Dia_Actual, Mes_Actual, Anio_Actual;
        int Edad;
        String Signo;

        System.out.println("Digite el dia de nacimiento:");
        Dia = teclado.nextInt();

        System.out.println("Digite el mes de nacimiento:");
        Mes = teclado.nextInt();

        System.out.println("Digite el año de nacimiento:");
        Anio = teclado.nextInt();

        System.out.println("Digite el dia actual:");
        Dia_Actual = teclado.nextInt();

        System.out.println("Digite el mes actual:");
        Mes_Actual = teclado.nextInt();

        System.out.println("Digite el año actual:");
        Anio_Actual = teclado.nextInt();

        Edad = Anio_Actual - Anio;

        if (Mes_Actual < Mes || (Mes_Actual == Mes && Dia_Actual < Dia)) {
            Edad = Edad - 1;
        }

        int rango;

        if ((Mes == 11 && Dia >= 22) || (Mes == 12 && Dia <= 21)) {
            rango = 1;
        } else if ((Mes == 12 && Dia >= 22) || (Mes == 1 && Dia <= 20)) {
            rango = 2;
        } else if ((Mes == 1 && Dia >= 21) || (Mes == 2 && Dia <= 19)) {
            rango = 3;
        } else if ((Mes == 2 && Dia >= 20) || (Mes == 3 && Dia <= 19)) {
            rango = 4;
        } else if ((Mes == 3 && Dia >= 21) || (Mes == 4 && Dia <= 20)) {
            rango = 5;
        } else if ((Mes == 4 && Dia >= 21) || (Mes == 5 && Dia <= 21)) {
            rango = 6;
        } else if ((Mes == 5 && Dia >= 22) || (Mes == 6 && Dia <= 21)) {
            rango = 7;
        } else if ((Mes == 6 && Dia >= 22) || (Mes == 7 && Dia <= 22)) {
            rango = 8;
        } else if ((Mes == 7 && Dia >= 23) || (Mes == 8 && Dia <= 23)) {
            rango = 9;
        } else if ((Mes == 8 && Dia >= 24) || (Mes == 9 && Dia <= 22)) {
            rango = 10;
        } else if ((Mes == 9 && Dia >= 23) || (Mes == 10 && Dia <= 22)) {
            rango = 11;
        } else {
            rango = 12;
        }

        switch (rango) {
            case 1:
                Signo = "Sagitario";
                break;
            case 2:
                Signo = "Capricornio";
                break;
            case 3:
                Signo = "Acuario";
                break;
            case 4:
                Signo = "Piscis";
                break;
            case 5:
                Signo = "Aries";
                break;
            case 6:
                Signo = "Tauro";
                break;
            case 7:
                Signo = "Geminis";
                break;
            case 8:
                Signo = "Cancer";
                break;
            case 9:
                Signo = "Leo";
                break;
            case 10:
                Signo = "Virgo";
                break;
            case 11:
                Signo = "Libra";
                break;
            case 12:
                Signo = "Escorpion";
                break;
            default:
                Signo = "";
                break;
        }

        System.out.println("El signo del zodiaco es: " + Signo);
        System.out.println("La edad de la persona es: " + Edad);

    }
}
