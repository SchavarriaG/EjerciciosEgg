package EjerciciosMid;

import Utils.Escribir;
import Utils.Leer;

public class Ejercicio8Length {

    public static void ejercutar(){
        Escribir.conSalto("Escribe la frase: ");
        String frase = Leer.caracter();
        Escribir.conSalto(checkLength(frase));
    }

    public static String checkLength(String frase){
        return frase.length() == 8 ? "Correcto" : "Incorrecto";
    }
}
