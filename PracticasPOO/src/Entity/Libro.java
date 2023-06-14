package Entity;

import Utils.Read;
import Utils.Write;

public class Libro {
    private String codeISBN;
    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro (){

    }

    public Libro(String codeISBN, String titulo, String autor, int numPaginas){
        this.codeISBN = codeISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getCodeISBN() {
        return codeISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setISBN(String codeISBN) {
        this.codeISBN = codeISBN;
    }
}
