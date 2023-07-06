package Entity;

import Utils.Read;
import Utils.Write;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.YEARS;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class PracticaOnce {
    public static void operarFechas(int anio, int mes, int dia){

        Date fecha = new Date(anio-1900, mes-1, dia);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Write.withLineBreak("La fecha ingresada es: " + formato.format(fecha));
        Date fechaActual = new Date();
        Write.withLineBreak("La fecha   actual  es: " + formato.format(fechaActual));
        Write.withLineBreak("La diferencia es de " + (fechaActual.getYear() - fecha.getYear()) + " años.");

        //MEJOR SOLUCION LOCALDATE -- MEJOR QUE DATE (LIBRERÍA DEPRECADA PARA USAR LAS FECHAS)
        DateTimeFormatter formatov2 = DateTimeFormatter.ISO_LOCAL_DATE;

        Write.withLineBreak("=============VERSION 2 DEL EJERCICIO=============");

        LocalDate fechav2 = LocalDate.of(anio, mes, dia);
        Write.withLineBreak("La fecha ingresada es: " + fechav2.format(formatov2));

        LocalDate fechaActualv2 = LocalDate.now();
        Write.withLineBreak("La fecha   actual  es: " + fechaActualv2.format(formatov2));

        Write.withLineBreak("La diferencia es de " + Math.abs((int)YEARS.between(fechaActualv2, fechav2))+ " años.");

    }

    public static void inicializarConUsuario(){
        Write.withLineBreak("Ingrese el día:");
        int dia = Read.integer();
        Write.withLineBreak("Ingrese el mes:");
        int mes = Read.integer();
        Write.withLineBreak("Ingrese el año:");
        int anio = Read.integer();
        operarFechas(anio,mes,dia);
    }

    public static void inicializarSinUsuario(int anio, int mes, int dia){
        operarFechas(anio,  mes,  dia);
    }
}
