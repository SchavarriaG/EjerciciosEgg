package Ejercicios;

import Entity.Rectangulo;
import Utils.Write;

public class Ejercicio4 {

    public static void inicializar(){
        Rectangulo rectangulo1 = Rectangulo.crearRectangulo();
        Write.withLineBreak("La superficie del rectángulo es: " + rectangulo1.calcularSuperficie());
        Write.withLineBreak("El perímetro del rectángulo es: " + rectangulo1.calcularPerimetro());
        rectangulo1.dibujarRectangulo();
    }
}