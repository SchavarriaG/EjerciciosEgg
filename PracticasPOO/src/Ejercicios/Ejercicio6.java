package Ejercicios;

import Entity.Cafetera;
import Utils.Read;
import Utils.Write;

public class Ejercicio6 {

    public static void inicializar(){
        // Probar con los valores 200, 300  respectivamente para ver todas las funcionalidades
        Cafetera cafetera1 = new Cafetera(1000,50);
        cafetera1.vaciarCafetera();
        Write.withLineBreak("Se llenará la cafetera.");
        cafetera1.llenarCafetera();
        Write.withLineBreak("Ingresa la cantidad de café que desea servir: ");
        cafetera1.servirTaza(Read.integer());
        Write.withLineBreak("Ingresa la cantidad de café que desea agregar: ");
        cafetera1.agregarCafe(Read.integer());
    }
}