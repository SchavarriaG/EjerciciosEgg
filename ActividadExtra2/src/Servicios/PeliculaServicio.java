package Servicios;

import Entidades.Pelicula;

import java.util.Scanner;

public class PeliculaServicio {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    static Pelicula[] peliculasDisponibles = new Pelicula[100]; // [............La momia,null,null]  Peliculas


    public static Pelicula crearPelicula(){
        /*System.out.println("Ingrese el título de la película:");
        String titulo = leer.nextLine();
        System.out.println("Ingrese el genero de la película:");
        String genero = leer.nextLine();
        System.out.println("Ingrese el año de la película:");
        int anio = leer.nextInt();
        System.out.println("Ingrese la duración en minutos de la película:");
        int duracionMinutos = leer.nextInt();

        // Pelicula peli - new Pelicula(titulo, genero, anio, duracionMinutos);
        // return  peli;
        return new Pelicula(titulo, genero, anio, duracionMinutos);*/
        return new Pelicula("la momia","acción",1999,124);
    }

    public static void listarPeliculas(){
        for(int i = 0; i < peliculasDisponibles.length; i++){
            if(peliculasDisponibles[i] != null){
                System.out.println(peliculasDisponibles[i].toString());
            }
        }
    }


    public static void almacenarPelicula(Pelicula pelicula){
        for(int i = 0; i < peliculasDisponibles.length; i++){
            if(peliculasDisponibles[i] == null){
                peliculasDisponibles[i] = pelicula;
                i = peliculasDisponibles.length;
            }
        }
    }

    public static void cargarPelicula(){
        almacenarPelicula(crearPelicula());
    }

    public static void buscarPeliculaPorTitulo(String titulo){
        boolean existente = false;
        for(int i = 0; i < peliculasDisponibles.length; i++){

            if(peliculasDisponibles[i] != null && peliculasDisponibles[i].getTitulo() == titulo){
                System.out.println("Existe la película.");
                existente = true;
                i = peliculasDisponibles.length;
            }
        }

        if (!existente) {
            System.out.println("No existe la película.");
        }
    }

    public static void buscarPeliculaPorGenero(String genero){
        boolean existente = false;
        for(int i = 0; i < peliculasDisponibles.length; i++){

            if(peliculasDisponibles[i].getGenero() == genero){
                System.out.println("Existe la película de este género.");
                existente = true;
                i = peliculasDisponibles.length;
            }
        }

        if (!existente) {
            System.out.println("No existe la película.");
        }
    }


}
