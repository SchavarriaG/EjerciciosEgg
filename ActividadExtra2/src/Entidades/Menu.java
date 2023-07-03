package Entidades;

import Servicios.AlquilerServicio;
import Servicios.PeliculaServicio;

import java.util.Scanner;

public class Menu {

    public static void mostrarMenu() {
        String opcion;
        boolean opcionSalir;
        Scanner read = new Scanner(System.in);
        do {
            System.out.println("===== Servicio de Alquiler de Peliculas =====");
            System.out.println("1. Cargar una pelicula");
            System.out.println("2. Listar todas las peliculas disponibles");
            System.out.println("3. Crear un alquiler");
            System.out.println("4. Listar todos los alquileres: ");
            System.out.println("5. Buscar pelicula por titulo: ");
            System.out.println("6. Buscar pelicula por genero:  ");
            System.out.println("7. Buscar alquileres por fecha: ");
            System.out.println("8. Salir.");
            System.out.print("Elige una opcion: ");
            opcion = read.nextLine();
            opcionSalir = false;
            System.out.println("");
            System.out.println("===============================================");
            switch (opcion) {
                case "1":
                    PeliculaServicio.cargarPelicula();
                    break;
                case "2":
                    PeliculaServicio.listarPeliculas();
                    break;
                case "3":
                    AlquilerServicio.cargarAlquiler();
                    break;
                case "4":
                    AlquilerServicio.listarAlquileres();
                    break;
                case "5":
                    System.out.println("Ingrese por favor el título de la película a buscar: ");
                    PeliculaServicio.buscarPeliculaPorTitulo(read.nextLine());
                    break;
                case "6":
                    System.out.println("Ingrese por favor el género de la película a buscar: ");
                    PeliculaServicio.buscarPeliculaPorGenero(read.nextLine());
                    break;
                case "7":
                    System.out.println("Ingrese por favor la fecha del alquiler a buscar en el formato (dd/mm/yyyy): ");
                    AlquilerServicio.buscarAlquilerPorFecha(read.nextLine());
                    break;
                case "8":
                    System.out.println("Gracias por utilizar nuestro servicio de alquiler de peliculas!");
                    opcionSalir = true;
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, selecciona una opcion valida.");
            }
            System.out.println("===============================================");
        } while (!opcionSalir);
    }
}
