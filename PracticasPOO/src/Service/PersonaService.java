package Service;

import Entity.Persona;
import Enums.Genero;
import Utils.Read;
import Utils.Write;

import java.util.Arrays;
import java.util.Objects;

public class PersonaService {

    public static Persona crearPersona(){
        Write.withLineBreak("Ingresa tu nombre: ");
        String nombre = Read.text();
        Write.withLineBreak("Ingresa tu edad: ");
        int edad = Read.integer();
        Genero genero = validarGenero();
        Write.withLineBreak("Ingresa tu peso en kilogramos: ");
        double peso = Read.decimal();
        Write.withLineBreak("Ingresa tu altura en centímetros: ");
        int altura = Read.integer();
        return new Persona(nombre, edad, genero, peso, altura);
    }

    private static Genero validarGenero(){
        boolean validador;
        String genero;
        do{
            Write.withLineBreak("Ingresa tu género (\"1\" para Femenino, \"2\" para Masculino, \"3\" para Otro)");
            genero = Read.text();

            if (!"1".equals(genero) && !"2".equals(genero) && !"3".equals(genero)){
                Write.withLineBreak("Opción inválida, intente de nuevo.");
                validador = false;
            }else {
                validador = true;
            }
        }
        while (!validador);

        //System.out.println(Arrays.toString(Genero.values()));
        return Genero.values()[Integer.parseInt(genero)-1];
    }

    public static int calcularIMC(Persona persona){
        double imc = (persona.getPeso() / Math.pow((double)persona.getAltura()/100,2));
        //System.out.println(imc);
        //la importancia del manejo de tipos de datos
        //System.out.println(Math.pow((double)persona.getAltura()/100,2));
        //System.out.println(Math.pow(persona.getAltura()/100,2));
        //System.out.println(Math.pow(((double)persona.getAltura())/100,2));
        if (imc < 20){
            //Write.withLineBreak("Estás por debajo de tu peso ideal.");
            return -1;
        }else if(imc >= 20 && imc <= 25){
            //Write.withLineBreak("Estás en tu peso ideal.");
            return 0;
        }else{
            //Write.withLineBreak("Tienes sobrepeso.");
            return 1;
        }
    }

    public static boolean esMayorDeEdad(Persona persona){
        /*if(persona.getEdad() >= 18){
            return true;
        }else{
            return false;
        }*/
        //return (persona.getEdad()>= 18) ? true: false;
        return persona.getEdad()>=18;
    }
}
