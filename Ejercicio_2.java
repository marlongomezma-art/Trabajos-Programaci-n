public class Ejercicio_2 {


        public static void main(String[] args) {
        


            Double Capital;
            Double ganancia;
            Double Total;
            System.out.println("Digite el valor de Capital");
            Capital= Double.parseDouble(System.console().readLine());
            ganancia= Capital*0.02;
            System.out.println("El valor de las ganancias del mes son: " + ganancia);
            Total= Capital+ganancia;
            System.out.println("El valor total de mi capital es: " + Total);


    }
    

}