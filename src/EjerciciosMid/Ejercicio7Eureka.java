package EjerciciosMid;

import Utils.Escribir;
import Utils.Leer;

/*
7. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
*/
public class Ejercicio7Eureka {

    public static void ejecutar(){
        Escribir.conSalto("Ingresa una frase: ");
        String frase = Leer.caracter();
        Escribir.conSalto(eurekaCheck(frase));
    }

    public static String eurekaCheck (String frase){
        return "eureka".equalsIgnoreCase(frase)? "Correcto" : "Incorrecto";
    }
}
