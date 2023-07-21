
import Ejercicios.*;
import Utils.Read;
import Utils.Write;

import java.lang.reflect.Constructor;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

       boolean salir = false;
        do {
            Write.withLineBreak("=============================================== ");
            Write.withLineBreak("Escriba el número del ejercicio a probar. ");
            Write.withLineBreak("- Para los extras escriba \"e1\" y para la prueba escriba \"prueba\".");
            Write.withLineBreak("- Para salir escriba \"salir\" .");
            Write.withLineBreak("=============================================== ");
            switch (Read.text().toLowerCase()){
                case "prueba":
                    Prueba.inicializar();
                    break;
                case "1":
                    Ejercicio1.inicializar();
                    break;
                case "2":
                    Ejercicio2.inicializar();
                    break;
                case "3":
                    Ejercicio3.inicializar();
                    break;
                case "4":
                    Ejercicio4.inicializar();
                    break;
                case "5":
                    Ejercicio5.inicializar();
                    break;
                case "6":
                    Ejercicio6.inicializar();
                    break;
                case "7":
                    Ejercicio7.inicializar();
                    break;
                case "8":
                    Ejercicio8.inicializar();
                    break;
                case "9":
                    Ejercicio9.inicializar();
                    break;
                case "10":
                    Ejercicio10.inicializar();
                    break;
                case "11":
                    Ejercicio11.inicializar();
                    break;
                case "12":
                    Ejercicio12.inicializar();
                    break;
                case "13":
                    Ejercicio13.inicializar();
                    break;
                case "14":
                    Ejercicio14.inicializar();
                    break;
                case "e1":
                    EjercicioE1.inicializar();
                    break;
                case "e2":
                    EjercicioE2.inicializar();
                    break;
                case "e3":
                    EjercicioE3.inicializar();
                    break;
                case "e4":
                    EjercicioE4.inicializar();
                    break;
                case "e5":
                    EjercicioE5.inicializar();
                    break;
                case "e6":
                    EjercicioE6.inicializar();
                    break;
                case "salir":
                    salir = true;
                    break;
                default:
                    Write.withLineBreak("Opción inválida, intenta de nuevo.");
            }
        } while(!salir);

        /*int anio = Read.integer();
        int mes = Read.integer();
        int dia = Read.integer();*//*

        Calendar fecha = new GregorianCalendar();
        //Date date = new Date();
        //fecha.setTime(date);

        fecha.set(2014, Calendar.MARCH, 15);
        System.out.println(fecha.get(Calendar.YEAR) + "/" +(fecha.get(Calendar.MONTH)) + "/" + fecha.get(Calendar.DATE));
*/
    }
}