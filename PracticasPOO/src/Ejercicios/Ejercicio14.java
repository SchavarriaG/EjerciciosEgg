package Ejercicios;

import Entity.Movil;

public class Ejercicio14 {

    public static void inicializar(){
        Movil movil1 = Movil.cargarCelular();
        System.out.println(movil1.toString());
        Movil movil2 = Movil.cargarCelular();
        System.out.println(movil2.toString());
    }
}