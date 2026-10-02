public class Ejercicio_42 {

    public static void main(String[] args) {

        int Edad_Meses;
        double Hemoglobina;
        char Sexo;
        double Minimo;

        System.out.println("Digite la edad en meses:");
        Edad_Meses = Integer.parseInt(System.console().readLine());

        System.out.println("Digite el nivel de hemoglobina:");
        Hemoglobina = Double.parseDouble(System.console().readLine());

        System.out.println("Digite el sexo (M = Mujer, H = Hombre):");
        Sexo = System.console().readLine().charAt(0);

        if (Edad_Meses <= 1) {

            Minimo = 13;

        } else if (Edad_Meses <= 6) {

            Minimo = 10;

        } else if (Edad_Meses <= 12) {

            Minimo = 11;

        } else if (Edad_Meses <= 60) {

            Minimo = 11.5;

        } else if (Edad_Meses <= 120) {

            Minimo = 12.6;

        } else if (Edad_Meses <= 180) {

            Minimo = 13;

        } else if (Sexo == 'M' || Sexo == 'm') {

            Minimo = 12;

        } else {

            Minimo = 14;
        }

        if (Hemoglobina < Minimo) {

            System.out.println("La persona tiene Anemia.");

        } else {

            System.out.println("La persona no tiene Anemia.");
        }
    }
}