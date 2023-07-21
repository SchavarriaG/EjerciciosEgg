package Ejercicios;

import Entity.Circunferencia;
import Utils.Write;

public class Ejercicio2 {
    public static void inicializar() {
        Circunferencia c1 = new Circunferencia();
        c1.crearCircunferencia();
        Write.withLineBreak("El área del círculo es: " + c1.calcularArea());
        Write.withLineBreak("El perímetro del círculo es: " + c1.calcularPerimetro());
    }
}
