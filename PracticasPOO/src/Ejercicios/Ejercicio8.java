package Ejercicios;

import Entity.Cadena;
import Utils.Read;
import Utils.Write;

public class Ejercicio8 {

    public static void inicializar(){
        Cadena cadena = new Cadena();
        Write.withLineBreak("Ingrese la frase que desee: ");
        cadena.setFrase(Read.text());

        Write.withLineBreak("Contabilicemos las vocales: tiene " + cadena.mostrarVocales() + " vocales.");

        Write.withLineBreak("Frase invertida: " + cadena.invertirFrase());

        Write.withLineBreak("Ingresa el caracter que quieres contabilizar en la frase: ");
        String caracter = Read.text();
        Write.withLineBreak("El caracter \"" + caracter+ "\" está "+ cadena.vecesRepetido(caracter) + " veces.");

        Write.withLineBreak("Ingresa la frase que deseas comparar en tamaño con la frase principal:");
        String rta = (cadena.compararLongitud(Read.text())) ? "Sí": "No";
        Write.withLineBreak("La cadena " + rta + " tiene la misma cantidad de caracteres." );

        Write.withLineBreak("Ingresa la frase que desees unir con la frase principal:");
        Write.withLineBreak("La frase resultante es: " + cadena.unirFrases(Read.text()) );

        Write.withLineBreak("Ingresa un caracter para reemplazar en la frase principal: ");
        Write.withLineBreak("La frase resultante es: " + cadena.reemplazarLetra(Read.text()));

        Write.withLineBreak("Ingresa el caracter que deseas buscar en la frase principal: ");
        caracter = Read.text();
        rta = (cadena.contiene(caracter)) ? "Sí": "No";
        Write.withLineBreak("La cadena " + rta + " contiene el caracter " + caracter );
    }
}