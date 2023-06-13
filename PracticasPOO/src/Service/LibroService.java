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

    public void verLibro(Libro libro){
        Write.withLineBreak("El código ISBN del libro es : " + libro.getCodeISBN());
        Write.withLineBreak("El titulo del libro es: " + libro.getTitulo());
        Write.withLineBreak("El autor del libro es: " + libro.getAutor());
        Write.withLineBreak("El número de páginas del libro es: " + libro.getNumPaginas());
    }
}
