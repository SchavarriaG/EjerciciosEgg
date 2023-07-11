package Entity;

import Utils.Read;
import Utils.Write;

public class Ahorcado {
    private String[] palabraSecreta;
    private String[] palabraArmada;
    private int intentosExitosos;
    private int intentosFallidos;
    private static final int intentos = 7;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraSecreta,String[] palabraArmada) {
        this.palabraSecreta = palabraSecreta;
        this.palabraArmada = palabraArmada;
        this.intentosExitosos = 0;
        this.intentosFallidos = 0;
    }


    public static Ahorcado crearJuego(){
        System.out.println("--------------------------------------------------------------------");
        Write.withLineBreak("Palabra que desea:");
        String palabra = Read.text();

        String[] letras = new String[palabra.length()];
        String[] aux = new String[palabra.length()];
        for(int i = 0; i < palabra.length(); i++){
            letras[i] = palabra.substring(i,i+1);
            aux[i] = "_";
        }
        return new Ahorcado(letras,aux);
    }

    public void iniciarPartida(){
        System.out.println("--------------------------------------------------------------------");
        Write.withLineBreak("Comienza la partida:");
        do {
            mostrarPalabra();
            Write.withoutLineBreak("Escribe la letra a encontrar: ");
            buscar(Read.text());
            System.out.println("--------------------------------------------------------------------");
        }while(!finalizaPartida());

    }
    public void mostrarPalabra(){
        System.out.println("--------------------------------------------------------------------");
        System.out.println("La palabra de longitud " + palabraArmada.length +" es la siguiente: ");
        StringBuilder palabra = new StringBuilder();
        for(int i = 0; i < palabraArmada.length; i++){
            palabra.append(palabraArmada[i]).append(",");
        }
        Write.withLineBreak(palabra.substring(0, (palabraArmada.length*2) - 1));
        System.out.println("--------------------------------------------------------------------");
    }


    public void buscar(String letra){
        boolean encontrada = false;
        boolean repetida = false;
        for(int i = 0; i < palabraSecreta.length; i++){
            if(!palabraArmada[i].equalsIgnoreCase(letra) && palabraSecreta[i].equalsIgnoreCase(letra)){
                palabraArmada[i] = letra;
                intentosExitosos ++;
                encontrada = true;

            } else if (palabraArmada[i].equalsIgnoreCase(letra)) {
                System.out.println("Ya la habías escrito!.");
                repetida = true;
                encontrada = true;
                break;
            }
        }
        if(!encontrada){
            intentosFallidos++;
        }else if(encontrada && !repetida){
            System.out.println("Encontraste la letra!.");
            System.out.println("Encontradas "+intentosExitosos + " letras de "+ palabraSecreta.length );
        }else{
            System.out.println("Llevas " + intentosExitosos + " letras de "+ palabraSecreta.length );
        }
    }

    public boolean finalizaPartida(){
        boolean finaliza = false;
        if(intentosExitosos < palabraSecreta.length){
        switch (intentosFallidos){
            case 0:
                System.out.println("Vas invict@! Sigue así!.");
                break;
            case 1:
                System.out.println("               ");
                System.out.println("               ");
                System.out.println("               ");
                System.out.println("               ");
                System.out.println("               ");
                System.out.println("         /\\   ");
                System.out.println("               ");
                break;
            case 2:
                System.out.println("                ");
                System.out.println("         ||     ");
                System.out.println("         ||     ");
                System.out.println("         ||     ");
                System.out.println("         ||     ");
                System.out.println("         /\\    ");
                System.out.println("                ");
                break;
            case 3:
                System.out.println(" __________    ");
                System.out.println("         ||    ");
                System.out.println("         ||    ");
                System.out.println("         ||    ");
                System.out.println("         ||    ");
                System.out.println("         /\\   ");
                System.out.println("               ");
                break;
            case 4:
                System.out.println(" __________    ");
                System.out.println(" |       ||    ");
                System.out.println("         ||    ");
                System.out.println("         ||    ");
                System.out.println("         ||    ");
                System.out.println("         /\\    ");
                System.out.println("               ");
                break;
            case 5:
                System.out.println(" __________    ");
                System.out.println(" |       ||    ");
                System.out.println("( )      ||    ");
                System.out.println("         ||    ");
                System.out.println("         ||    ");
                System.out.println("         /\\    ");
                System.out.println("               ");
                break;
            case 6:
                System.out.println(" __________    ");
                System.out.println(" |       ||    ");
                System.out.println("( )      ||    ");
                System.out.println("/|\\      ||    ");
                System.out.println("         ||    ");
                System.out.println("         /\\    ");
                System.out.println("               ");
                break;
            case 7:
                System.out.println(" __________    ");
                System.out.println(" |       ||    ");
                System.out.println("( )      ||    ");
                System.out.println("/|\\      ||    ");
                System.out.println("/ \\      ||    ");
                System.out.println("         /\\    ");
                System.out.println("Perdiste :(     ");
                finaliza = true;
                break;
        }}else {
            mostrarPalabra();
            System.out.println("Ganaste!. Fallaste en " + intentosFallidos + " oportunidades." );
            finaliza = true;
        }
        return finaliza;
    }
}
