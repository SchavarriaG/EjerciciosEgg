package EjerciciosLow;//2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
//   pantalla.

import Utils.Escribir;
import Utils.Leer;

public class Ejercicio2IngresarString {

    public static void ejecutar(){
        Escribir.conSalto("Ejercicio2: ");

        Escribir.conSalto("Ingresa tu nombre: ");
        String nombre = Leer.caracter();
        Escribir.conSalto("El nombre ingresado es: " + nombre);

    }
}
