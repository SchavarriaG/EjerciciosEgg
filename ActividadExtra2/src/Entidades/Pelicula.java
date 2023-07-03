package Entidades;

public class Pelicula {

    private String titulo;
    private String genero;
    private int anio;
    private int duracionMinutos;

    public Pelicula() {
    }

    public Pelicula(String titulo, String genero, int anio, int duracionMinutos) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.duracionMinutos = duracionMinutos;
        System.out.println("Pelicula cargada.");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String toString() {
        return "Pelicula {" + " titulo = " + titulo  + ", genero = " + genero  + ", año = " + anio
                + ", duracionMinutos = " + duracionMinutos + " min }";
    }
}
