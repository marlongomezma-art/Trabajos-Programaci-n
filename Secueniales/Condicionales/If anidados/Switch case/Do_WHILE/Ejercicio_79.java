package Ejercicio_59j;

import java.util.Scanner;

public class Ejercicio_79 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int cantidadAutores;
        int autor = 1;

        int totalLibros = 0;
        int librosCienciaFiccion = 0;
        int librosRomance = 0;

        int mayorCantidadLibros = 0;
        String autorMayor = "";

        System.out.println("Ingrese la cantidad de autores:");
        cantidadAutores = teclado.nextInt();

        do {

            teclado.nextLine();
            System.out.println("\n========== AUTOR #" + autor + " ==========");
            String apellido;
            int cantidadLibros;
            System.out.println("Ingrese el apellido del autor:");
            apellido = teclado.nextLine();
            System.out.println("Ingrese la cantidad de libros escritos:");
            cantidadLibros = teclado.nextInt();

            int libro = 1;
            int paginasTotales = 0;
            int mayorPaginas = 0;
            int codigoMayorPaginas = 0;

            do {

                System.out.println("\n------ LIBRO #" + libro + " ------");
                System.out.println("Ingrese el código del libro:");
                int codigo = teclado.nextInt();
                System.out.println(
                        "Ingrese el género:"
                                + "\n1. Ciencia ficción"
                                + "\n2. Romance"
                                + "\n3. Acción"
                                + "\n4. Terror"
                                + "\n5. Novela"
                                + "\n6. Autoayuda"
                                + "\n7. Académico"
                );

                int genero = teclado.nextInt();
                System.out.println("Ingrese el número de páginas:");
                int paginas = teclado.nextInt();
                paginasTotales += paginas;
                if (paginas > mayorPaginas) {
                    mayorPaginas = paginas;
                    codigoMayorPaginas = codigo;
                }

                if (genero == 1) {
                    librosCienciaFiccion++;
                } else if (genero == 2) {
                    librosRomance++;
                }
                totalLibros++;
                libro++;

            } while (libro <= cantidadLibros);

            System.out.println("\n----- INFORMACIÓN DEL AUTOR -----");
            System.out.println("Apellido: " + apellido);
            System.out.println("Total de páginas escritas: " + paginasTotales);
            System.out.println("Código del libro con mayor cantidad de páginas: " + codigoMayorPaginas);
            System.out.println("Cantidad de páginas: " + mayorPaginas);

            if (cantidadLibros > mayorCantidadLibros) {
                mayorCantidadLibros = cantidadLibros;
                autorMayor = apellido;
            }
            autor++;

        } while (autor <= cantidadAutores);

        double porcentajeCienciaFiccion = (double) librosCienciaFiccion / totalLibros * 100;
        System.out.println("\n========== RESULTADOS GENERALES ==========");
        System.out.println("Porcentaje de libros de ciencia ficción: " + porcentajeCienciaFiccion + "%");
        System.out.println("Cantidad de libros de ciencia ficción: " + librosCienciaFiccion);
        System.out.println("Cantidad de libros de romance: " + librosRomance);
        System.out.println("Autor con mayor cantidad de libros: " + autorMayor);
        System.out.println("Cantidad de libros escritos: " + mayorCantidadLibros);
    }
}