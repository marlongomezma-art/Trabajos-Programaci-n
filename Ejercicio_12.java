public class Ejercicio_12 {
    public static void main(String[] args) {

        double examenMat, tareaMat1, tareaMat2, tareaMat3;
        double examenFis, tareaFis1, tareaFis2;
        double examenQui, tareaQui1, tareaQui2, tareaQui3;

        double promedioMat, promedioFis, promedioQui;
        double promedioGeneral;

        System.out.println("Digite el examen de Matematica:");
        examenMat = Double.parseDouble(System.console().readLine());

        System.out.println("Digite tarea 1 de Matematica:");
        tareaMat1 = Double.parseDouble(System.console().readLine());

        System.out.println("Digite tarea 2 de Matematica:");
        tareaMat2 = Double.parseDouble(System.console().readLine());

        System.out.println("Digite tarea 3 de Matematica:");
        tareaMat3 = Double.parseDouble(System.console().readLine());

        promedioMat = examenMat * 90 / 100
                + ((tareaMat1 + tareaMat2 + tareaMat3) / 3) * 10 / 100;


        System.out.println("Digite el examen de Fisica:");
        examenFis = Double.parseDouble(System.console().readLine());

        System.out.println("Digite tarea 1 de Fisica:");
        tareaFis1 = Double.parseDouble(System.console().readLine());

        System.out.println("Digite tarea 2 de Fisica:");
        tareaFis2 = Double.parseDouble(System.console().readLine());

        promedioFis = examenFis * 80 / 100
                + ((tareaFis1 + tareaFis2) / 2) * 20 / 100;


        System.out.println("Digite el examen de Quimica:");
        examenQui = Double.parseDouble(System.console().readLine());

        System.out.println("Digite tarea 1 de Quimica:");
        tareaQui1 = Double.parseDouble(System.console().readLine());

        System.out.println("Digite tarea 2 de Quimica:");
        tareaQui2 = Double.parseDouble(System.console().readLine());

        System.out.println("Digite tarea 3 de Quimica:");
        tareaQui3 = Double.parseDouble(System.console().readLine());

        promedioQui = examenQui * 85 / 100
                + ((tareaQui1 + tareaQui2 + tareaQui3) / 3) * 15 / 100;


        promedioGeneral = (promedioMat + promedioFis + promedioQui) / 3;

        System.out.println("Promedio de Matematica: " + promedioMat);
        System.out.println("Promedio de Fisica: " + promedioFis);
        System.out.println("Promedio de Quimica: " + promedioQui);
        System.out.println("Promedio general: " + promedioGeneral);
    }
}