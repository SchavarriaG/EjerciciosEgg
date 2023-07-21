package Ejercicios;

import Entity.Persona;
import Service.PersonaService;
import Utils.Read;
import Utils.Write;

public class Ejercicio7 {

    public static void inicializar(){
        Write.withLineBreak("Ingresa la cantidad de personas que desea registrar: ");
        int cantidadPersonas = Read.integer();
        Persona[] personas = new Persona[cantidadPersonas];

        for (int i = 0; i< personas.length;i++){
            personas[i] = PersonaService.crearPersona();
            Write.withLineBreak("Se registró la persona: "+personas[i]);
        }
        int contadorMayores = 0;
        int contadorPesoIdeal = 0;
        int contadorSobrePeso = 0;
        int contadorPesoBajo = 0;
        for (Persona persona : personas){
            Write.withLineBreak("Para "+persona.getNombre()+" :");
            int imc = PersonaService.calcularIMC(persona);
            if (imc == -1){
                Write.withLineBreak("Estás por debajo de tu peso ideal.");
                contadorPesoBajo++;
            }else if(imc == 0){
                Write.withLineBreak("Estás en tu peso ideal.");
                contadorPesoIdeal++;
            }else{
                Write.withLineBreak("Tienes sobrepeso.");
                contadorSobrePeso++;
            }

            if(PersonaService.esMayorDeEdad(persona)){
                Write.withLineBreak("Es mayor de edad.");
                contadorMayores ++;
            }else {
                Write.withLineBreak("Es menor de edad.");
            }
        }

        System.out.println("El porcentaje de personas mayores de edad es " + (double) contadorMayores / cantidadPersonas * 100 + "%" );
        System.out.println("El porcentaje de personas menores de edad es " + (double) (cantidadPersonas - contadorMayores) / cantidadPersonas * 100 + "%" );
        System.out.println("El porcentaje de personas con el peso menor al ideal es " + (double) contadorPesoBajo / cantidadPersonas * 100 + "%" );
        System.out.println("El porcentaje de personas con el peso ideal es " + (double) contadorPesoIdeal / cantidadPersonas * 100 + "%" );
        System.out.println("El porcentaje de personas con sobrepeso es " + (double) contadorSobrePeso / cantidadPersonas * 100 + "%" );
    }
}