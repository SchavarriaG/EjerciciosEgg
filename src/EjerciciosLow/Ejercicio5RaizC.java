package EjerciciosLow;

import Utils.Escribir;
import Utils.Leer;

/*
5. Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
public class Ejercicio5RaizC {

    public static void ejecutar(){
        Escribir.conSalto("Escribe un número entero: ");
        int num = Leer.entero();
        Escribir.conSalto("El doble de "+ num +" es: " + num*2);
        Escribir.conSalto("El triple de "+ num +" es: " + num*3);
        Escribir.conSalto("La raíz cuadrada de "+ num +" es: " + Math.sqrt(num));
    }
}
