package Ejercicios;

import Entity.Curso;

public class Ejercicio13 {

    public static void inicializar(){
        Curso curso1 = Curso.crearCurso();
        curso1.calcularGananciaSemanal();
        System.out.println(curso1.toString());
        Curso curso2 = Curso.crearCurso();
        curso2.calcularGananciaSemanal();
        System.out.println(curso2.toString());
    }
}