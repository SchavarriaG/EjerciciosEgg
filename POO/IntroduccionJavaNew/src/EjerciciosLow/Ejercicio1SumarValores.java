package EjerciciosLow;/* 1.   Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
        dos. El programa deberá después mostrar el resultado de la sum
*/

import Utils.*;
public class Ejercicio1SumarValores {

    public static void ejecutar(){
        Escribir.conSalto("Ejercicio1: "); //System.out.prinln

        Escribir.conSalto("Ingresa dos valores:");
        int val1 = Leer.entero();
        int val2 = Leer.entero();
        Escribir.conSalto("El resultado es: " + suma(val1, val2));
    }

    public static int suma(int num1, int num2){
        return num1 + num2;
    }
}
