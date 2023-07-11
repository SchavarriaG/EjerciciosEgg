package Ejercicios;

import Entity.Cancion;
import Utils.Write;

public class EjercicioE1 {

    public static void inicializar(){
        Cancion cancion1 = new Cancion();
        cancion1.setAutor("Feid");
        cancion1.setTitulo("PURRITO APA");
        Write.withLineBreak("El autor de la canción es " + cancion1.getAutor());
        Write.withLineBreak("El título de la canción es " + cancion1.getTitulo());

        Cancion cancion2 = new Cancion("A little piece of heaven", "Avenged Sevenfold");
        Write.withLineBreak(cancion2);
    }
}