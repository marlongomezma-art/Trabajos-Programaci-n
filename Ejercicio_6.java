public class Ejercicio_6 {

    public static void main(String[] args){
     int estudiantes;
     double Hombres, Mujeres;
     double porcentajeHombres, porcentajeMujeres;
     System.out.println("Digite el numero de estudiantes:");
     estudiantes = Integer.parseInt(System.console().readLine());
     System.out.println("el numero de estudiantes es: " + estudiantes);
     
     System.out.println("Digite el numero de estudiantes hombres:");
        Hombres = Double.parseDouble(System.console().readLine());
        porcentajeHombres = (estudiantes* Hombres) / 100;
        

     System.out.println("Digite el numero de estudiantes mujeres:");
        Mujeres = Double.parseDouble(System.console().readLine());
        porcentajeMujeres = (estudiantes* Mujeres) / 100;
        

        System.out.println("el porcentaje de estudiantes hombres es: " + porcentajeHombres);
        System.out.println("el porcentaje de estudiantes mujeres es: " + porcentajeMujeres);

    }

}