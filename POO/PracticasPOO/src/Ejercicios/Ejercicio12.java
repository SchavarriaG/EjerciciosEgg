package Ejercicios;

import Entity.PersonaV2;
import Utils.Read;
import Utils.Write;

public class Ejercicio12 {

    public static void inicializar(){
        PersonaV2 persona = PersonaV2.crearPersona();
        Write.withLineBreak("La edad de "+ persona.getNombre() + " es "
                + persona.calcularEdad() + " años.");
        Write.withLineBreak("Ingrese una edad: ");
        int anios = Read.integer();
        Write.withLineBreak("La edad de " + persona.getNombre() + " "
                + ((persona.menorQue(anios))? "si" : "no") +" es menor que " + anios + " años.");
        Write.withLineBreak(persona.mostrarPersona());
    }
}