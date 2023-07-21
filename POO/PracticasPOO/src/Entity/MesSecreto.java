package Entity;

import Utils.Read;
import Utils.Write;

public class MesSecreto {
    private static final String[] meses = {"enero","febrero","marzo","abril"
            ,"mayo","junio","julio","agosto","septiembre","octubre","noviembre"
            ,"diciembre"};
    private static String mesSecreto = meses[(int) Math.round(Math.random()*11)];

    public static void adivinar(){
        boolean adivina = false;

        Write.withoutLineBreak("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
        do{
            if(mesSecreto.equalsIgnoreCase(Read.text())){
                Write.withLineBreak("¡Ha acertado!");
                adivina = true;
            }else {
                Write.withoutLineBreak("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            }
        }while(!adivina);
    }
}
