public class Ejercicio_10
{
    public static void main(String[] args){

        double chelines, pesetas, dracmas, francos, dolares, libras;
        System.out.println("Digite la cantidad de chelines: ");
        chelines = Double.parseDouble(System.console().readLine());
        pesetas = chelines * 956.871 /100;
        System.out.println("El equivalente en pesetas es: " + pesetas);

        System.out.println("Digite la cantidad de dracmas griegos:");
        dracmas = Double.parseDouble(System.console().readLine());
        pesetas = dracmas * 88.607 /100;
        francos = pesetas * 20.110;
        System.out.println("El equivalente en francos es: " + francos);

        System.out.println("Digite la cantidad de pesetas:");
        pesetas = Double.parseDouble(System.console().readLine());
        dolares = pesetas / 122.499;
        libras = pesetas * 100 /9.289;
        System.out.println("El equivalente en libras es: " + libras);
        System.out.println("El equivalente en dolares es: " + dolares);
        

    }
}