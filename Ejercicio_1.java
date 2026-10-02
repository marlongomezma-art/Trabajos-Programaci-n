import

import java.util.Scanner;.java.util.Scanner;

public class Ejercicio_1 {
    
    public static void main(String[] arsg) {

        int edad1, edad2, edad3;
        float promedio;
        Scanner sc=new Scanner(System.in);

        System.out.print("Digite la edad de la persona 1: ");
        edad1= sc.nextInt();
        System.out.print("digite la edad de la persona 2: " );
        edad2= sc.nextInt();
        System.out.println("digite la edad de la persona 3: ");
        edad3=sc.nextInt();
        promedio =(edad1+edad2+edad3)/3;
        System.out.println("el promedio de las edades es: "+ promedio);
     }

}
