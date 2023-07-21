package EjerciciosLow;/*4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/

import Utils.Escribir;
import Utils.Leer;

public class Ejercicio4CelsiusFahren {
    public static void ejecutar() {

        Escribir.conSalto("Ejercicio 4:");
        Escribir.conSalto("Ingresa la temperatura actual en grados Celsius (C): ");
        int gradosCelsius = Leer.entero();
        Escribir.conSalto("La temperatura en grados Fahrenheit (F) es: " + calcularFahrenheit(gradosCelsius));

    }

    public static double calcularFahrenheit(int gradosCelsius){
        return 32 + ( gradosCelsius * 1.8);
    }
}
