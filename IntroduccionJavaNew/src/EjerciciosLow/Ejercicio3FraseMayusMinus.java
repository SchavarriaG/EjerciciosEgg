package EjerciciosLow;

import Utils.Escribir;
import Utils.Leer;

//3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
//   en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
//   Java.
public class Ejercicio3FraseMayusMinus {

    public static void ejecutar() {
        Escribir.conSalto("Ejercicio 3:");
        Escribir.conSalto("Escriba una frase: ");
        String frase = Leer.caracter();
        Escribir.conSalto("La frase en mayúsculas: " + frase.toUpperCase());
        Escribir.conSalto("La frase en minúsculas: " + frase.toLowerCase());
    }
}
