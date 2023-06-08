package EjerciciosMid;

import Utils.Escribir;
import Utils.Leer;

public class Ejercicio10ValorLimite {

    public static void ejecutar() {
        int numLim, numEntry;
        Escribir.conSalto("Ingrese un valor límite entero:");
        numLim = Leer.entero();
        numEntry = 0;

        do {
            Escribir.conSalto("Ingrese un valor entero:");
            numEntry += Leer.entero();
        } while (numLim >= numEntry);
        Escribir.conSalto("Has sobrepasado el valor límite por " + (numEntry - numLim));
    }
}
