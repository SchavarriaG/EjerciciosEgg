package EjerciciosMid;

import Utils.Escribir;
import Utils.Leer;

/*
6. Crear un programa que dado un numero determine si es par o impar.
*/
public class Ejercicio6ParImpar {

    public static void ejecutar(){
        Escribir.conSalto("Escribe un número entero: ");
        int num = Leer.entero();
        Escribir.conSalto(num % 2 == 0 ? "Es par.": "Es impar.");

    }
}
