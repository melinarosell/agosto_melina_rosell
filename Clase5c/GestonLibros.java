package Clase5;
import java.util.Scanner;

public class GestonLibros {

    public static void main(String args[]){

            System.out.println("INGRESE LOS DATOS DEL LIBRO1");
            Libro libro1 = new Libro();
            libro1.setIsbn(pedirIsbn ());
            libro1.setTitulo(pedirTitulo());
            libro1.setAutor(pedirAutor());
            libro1.setNroPaginas(pedirNroPaginas());

            System.out.println("INGRESE LOS DATOS DEL LIBRO2");
            Libro libro2 = new Libro();
            libro2.setIsbn(pedirIsbn ());
            libro2.setTitulo(pedirTitulo());
            libro2.setAutor(pedirAutor());
            libro2.setNroPaginas(pedirNroPaginas());


            System.out.println(libro1);
            System.out.println("***********************");
            System.out.println(libro2);


    }

    public static int pedirIsbn ()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Isbn: ");
        int isbn = input.nextInt();
        return isbn;

    }

    public static String pedirTitulo ()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Titulo: ");
        String titulo = input.next();
        return titulo;
    }

    public static String pedirAutor ()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Autor: ");
        String autor = input.next();
        return autor;
    }

    public static int pedirNroPaginas ()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nro. de páginas ");
        int pag = input.nextInt();
        return pag;

    }

}
