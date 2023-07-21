package Servicios;

import Entidades.Alquiler;
import Entidades.Pelicula;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AlquilerServicio {

    static Alquiler[] alquileres = new Alquiler[100];
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private static Alquiler crearAlquiler() {
        System.out.println("Ingrese el título de la película alquilada:");
        String peliculaAlquilada = leer.nextLine();

        System.out.println("Ingrese la fecha de inicio del alquiler en el formato dd/MM/yyyy:");
        Date fechaInicio = transformarFecha(leer.nextLine());

        System.out.println("Ingrese la fecha de fin del alquiler en el formato dd/MM/yyyy:");
        Date fechaFin = transformarFecha(leer.nextLine());

        //return new Alquiler("Buscando a nemo", fechaInicio, fechaFin, calcularAlquiler(fechaInicio, fechaFin));
        return  new Alquiler(peliculaAlquilada,fechaInicio,fechaFin,calcularAlquiler(fechaInicio,fechaFin));
    }


    public static Date transformarFecha(String fechaIngresada) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha;
        try {
            fecha = formatoFecha.parse(fechaIngresada);
            //System.out.println("Fecha ingresada: " + fecha);
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
        Date fechaIngresada = transformarFecha(fecha);
        boolean existente = false;
        for(int i = 0; i < alquileres.length; i++){
            if(alquileres[i] != null && fechaIngresada.equals(alquileres[i].getFechaInicio())){
                System.out.println("Si existe el alquiler, es: ");
                System.out.println(alquileres[i].toString());
                existente = true;
                i = alquileres.length;
            }
        }
        if (!existente) {
            System.out.println("No existe el alquiler.");
        }
    }

    public static double calcularAlquiler(Date fechaInicio, Date fechaFin){
        long millisDias =  Math.abs(fechaInicio.getTime() - fechaFin.getTime());
        long diasDiff = TimeUnit.DAYS.convert(millisDias, TimeUnit.MILLISECONDS);
        double precioDiasAlquiler = 0;
        if(diasDiff <= 3){
            precioDiasAlquiler = 10;
        }else{
            precioDiasAlquiler = Math.round(10 * Math.pow(1.1,diasDiff - 3)*100.0)/100.0;
        }
        System.out.println("EL precio de alquiler es: " + precioDiasAlquiler + "$");
        return precioDiasAlquiler;
    }

    public static void listarAlquileres(){
        boolean hayAlquileres = false;
        for(int i = 0; i < alquileres.length; i++){
            if(alquileres[i] != null){
                System.out.println(alquileres[i].toString());
                hayAlquileres = true;
            }
        }
        if(!hayAlquileres){
            System.out.println("No hay alquileres.");
        }
    }

    public static Alquiler[] getAlquileres(){
        return alquileres;
    }
}
