package Ejercicios;

import Service.ArregloService;

public class Ejercicio10 {

    public static void inicializar(){
        //IMPORTANTE: NO USÉ LA CLASE ARRAY PORQUE NO LO VI :(
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        ArregloService.inicializar(arregloA);
        System.out.println("Arreglo A inicializado:");
        ArregloService.imprimirArreglo(arregloA);
        arregloA = ArregloService.ordenarArreglo(arregloA);
        System.out.println("Arreglo A ordenado:");
        ArregloService.imprimirArreglo(arregloA);
        ArregloService.llenarArreglo(arregloB, arregloA);
        System.out.println("Arreglo B inicializado:");
        ArregloService.imprimirArreglo(arregloB);
        System.out.println("Arreglo A ordenado luego de llenar B:");
        ArregloService.imprimirArreglo(arregloA);
    }
}