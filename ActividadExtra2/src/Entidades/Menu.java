package Entidades;

import java.util.Scanner;

public class Menu {

    public void mostrarMenu() {
        int opcion;
        Scanner read = new Scanner(System.in);
        do {
            System.out.println("===== Servicio de Alquiler de Peliculas =====");
            System.out.println("1. Cargar una pelicula");
            System.out.println("2. Listar todas las peliculas disponibles");
            System.out.println("3. Crear un alquiler");
            System.out.println("4. Listar todos los alquileres");
            System.out.println("5. Buscar peliculas por titulo o genero");
            System.out.println("6. Buscar alquileres por fecha");
            System.out.println("7. Salir");
            System.out.print("Elige una opcion: ");
            opcion = read.nextInt();
            read.nextLine();

            switch (opcion) {
                case 1:

                    break;
                case 2:
                    //listarPeliculas();
                    break;
                case 3:
                    //crearAlquiler();
                    break;
                case 4:
                    //listarAlquileres();
                    break;
                case 5:
                    //buscarPelicula();
                    break;
                case 6:
                    //buscarAlquilerPorFecha();
                    break;
                case 7:
                    System.out.println("Gracias por utilizar nuestro servicio de alquiler de peliculas!");
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, selecciona una opcion valida.");
            }
        } while (opcion < 1 || opcion > 7);


    }
}
