package Ejercicios;

import Entity.Matematica;

public class Ejercicio9 {

    public static void inicializar(){
        //Matematica matematica = new Matematica(Math.random(),Math.random());

        Matematica.setNumA(Math.random());
        Matematica.setNumB(Math.random());
        System.out.println("El valor mayor es: " + Matematica.devolverMayor());
        System.out.println("El valor mayor elevado al valor menor: "
                + Matematica.redondear(Matematica.devolverMayor(),2)+ "^"
                + Matematica.redondear(Matematica.devolverMenor(),2) +" = "
                + Matematica.calcularPotencia());
        System.out.println("La raíz del valor menor es: " + Matematica.calculaRaiz());
    }
}