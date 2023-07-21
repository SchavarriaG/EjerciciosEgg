package Service;

import Entity.Libro;
import Utils.Read;
import Utils.Write;


public class LibroService {
    public Libro cargarLibro(){
        Write.withLineBreak("Ingresa los datos del libro:");
        Write.withLineBreak("Ingresa el código ISBN del libro: ");
        String codeISBN = Read.text();
        Write.withLineBreak("Ingresa el titulo del libro: ");
        String titulo = Read.text();
        Write.withLineBreak("Ingresa el autor del libro: ");
        String autor = Read.text();
        Write.withLineBreak("Ingresa el número de páginas del libro: ");
        int numPaginas = Read.integer();
        return new Libro(codeISBN, titulo, autor, numPaginas);
    }

    public static Libro cargarLibroEstatico(){
        Write.withLineBreak("Ingresa los datos del libro:");
        Write.withLineBreak("Ingresa el código ISBN del libro: ");
        String codeISBN = Read.text();
        Write.withLineBreak("Ingresa el titulo del libro: ");
        String titulo = Read.text();
        Write.withLineBreak("Ingresa el autor del libro: ");
        String autor = Read.text();
        Write.withLineBreak("Ingresa el número de páginas del libro: ");
        int numPaginas = Read.integer();
        return new Libro(codeISBN, titulo, autor, numPaginas);
    }

    public Libro cargarLibro2(){
        Libro libro1 = new Libro();
        Write.withLineBreak("Ingresa el código ISBN del libro: ");
        libro1.setISBN(Read.text());
        Write.withLineBreak("Ingresa el titulo del libro: ");
        String titulo = Read.text();
        Write.withLineBreak("Ingresa el autor del libro: ");
        String autor = Read.text();
        Write.withLineBreak("Ingresa el número de páginas del libro: ");
        int numPaginas = Read.integer();
        return libro1;
    }

    public void verLibro(Libro libroEjemplo){
        Write.withLineBreak("El código ISBN del libro es : " + libroEjemplo.getCodeISBN());
        Write.withLineBreak("El titulo del libro es: " + libroEjemplo.getTitulo());
        Write.withLineBreak("El autor del libro es: " + libroEjemplo.getAutor());
        Write.withLineBreak("El número de páginas del libro es: " + libroEjemplo.getNumPaginas());
    }

    public static void verLibroEstatico(Libro libroEjemplo){
        Write.withLineBreak("El código ISBN del libro es : " + libroEjemplo.getCodeISBN());
        Write.withLineBreak("El titulo del libro es: " + libroEjemplo.getTitulo());
        Write.withLineBreak("El autor del libro es: " + libroEjemplo.getAutor());
        Write.withLineBreak("El número de páginas del libro es: " + libroEjemplo.getNumPaginas());
    }
}
