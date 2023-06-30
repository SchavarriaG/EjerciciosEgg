package Servicios;

import Entidades.Alquiler;
import Entidades.Pelicula;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AlquilerServicio {

    static Alquiler[] alquileres = new Alquiler[100];
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static Alquiler crearAlquiler() {
        System.out.println("Ingrese el título de la película alquilada:");
        String peliculaAlquilada = leer.nextLine();

        System.out.println("Ingrese la fecha de inicio del alquiler en el formato dd/MM/yyyy:");
        Date fechaInicio = pedirFecha(leer.nextLine());

        System.out.println("Ingrese la fecha de fin del alquiler en el formato dd/MM/yyyy:");
        Date fechaFin = pedirFecha(leer.nextLine());

        System.out.println("Ingrese el precio de la película:");
        double precio = leer.nextDouble();

        return new Alquiler(peliculaAlquilada, fechaInicio, fechaFin, precio);
    }


    public static Date pedirFecha(String fechaIngresada) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha;
        try {
            fecha = formatoFecha.parse(fechaIngresada);
            System.out.println("Fecha ingresada: " + fecha);
            return fecha;

        } catch (ParseException e) {
            System.out.println("Formato de fecha inválido. Inténtalo de nuevo.");
        }
        return null;
    }

    public static void almacenarAlquiler(Alquiler alquiler){
        for(int i = 0; i < alquileres.length; i++){
            if(alquileres[i] == null){
                alquileres[i] = alquiler;
                i = alquileres.length;
            }
        }
    }

    public static void cargarAlquiler(){
        almacenarAlquiler(crearAlquiler());
    }

    public static void buscarAlquilerPorFecha(String fecha){
        Date fechaIngresada = pedirFecha(fecha);
        boolean existente = false;
        for(int i = 0; i < alquileres.length; i++){
            if(alquileres[i] != null && alquileres[i].getFechaInicio() == fechaIngresada){
                System.out.println("Si existe el alquiler");
                System.out.println(alquileres[i].toString());
                existente = true;
                i = alquileres.length;
            }
        }
        if (!existente) {
            System.out.println("No existe el alquiler.");
        }



    }
}
