package EjerciciosMid;

import Utils.Escribir;
import Utils.Leer;

public class Ejercicio9EmpezaPorA {

    public static void ejercutar(){
        Escribir.conSalto("Escribe una frase: ");
        Escribir.conSalto(Ejercicio9EmpezaPorA.contentACheck(Leer.caracter()));
    }

    public static String contentACheck(String frase){
        return  "a".equalsIgnoreCase(frase.substring(0,1)) ? "Correcto" : "Incorrecto";
    }
}
