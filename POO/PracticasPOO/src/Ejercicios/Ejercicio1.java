package Ejercicios;

import Entity.Libro;
import Service.LibroService;

public class Ejercicio1 {

    public static void inicializar(){
        // Creación de objeto por medio del servicio
        LibroService libroService = new LibroService();
        Libro libro1 = libroService.cargarLibro();
        libroService.verLibro(libro1);

        // Creación de objeto por medio del servicio pero con método estático
        Libro libro2 = LibroService.cargarLibroEstatico();
        LibroService.verLibroEstatico(libro2);
    }
}
