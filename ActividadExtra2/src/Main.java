import Entidades.Menu;
import Servicios.AlquilerServicio;
import Servicios.PeliculaServicio;

public class Main {
    public static void main(String[] args) {
        //Pruebas
        /*PeliculaServicio.listarPeliculas();
        PeliculaServicio.cargarPelicula();
        PeliculaServicio.listarPeliculas();
        PeliculaServicio.buscarPeliculaPorGenero("accion");
        PeliculaServicio.buscarPeliculaPorTitulo("la momia");
        PeliculaServicio.buscarPeliculaPorGenero("comedia");
        PeliculaServicio.buscarPeliculaPorTitulo("la momia 2");


        AlquilerServicio.cargarAlquiler();
        AlquilerServicio.buscarAlquilerPorFecha("09/09/2023");
        AlquilerServicio.buscarAlquilerPorFecha("10/09/2023");
        AlquilerServicio.calcularAlquiler(AlquilerServicio.getAlquileres()[0]);
        AlquilerServicio.cargarAlquiler();
        AlquilerServicio.buscarAlquilerPorFecha("10/09/2023");
        AlquilerServicio.calcularAlquiler(AlquilerServicio.getAlquileres()[1]);*/

        Menu.mostrarMenu();
    }
}