package Service;

import Entity.Matematica;
import Utils.Write;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;


public class ArregloService {

    public static double[] inicializar(double[] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = Math.random();
        }
        return arreglo;
    }

    public static void imprimirArreglo(double[] arreglo){
        StringBuilder arregloPrint = new StringBuilder();
        arregloPrint.append("[");
        for(int i = 0; i < arreglo.length; i++){
            arregloPrint.append(Matematica.redondear(arreglo[i],2)+",");
        }
        arregloPrint.deleteCharAt(arregloPrint.length()-1);
        arregloPrint.append("]");
        Write.withLineBreak(arregloPrint);
    }

    public static double[] ordenarArreglo(double[] arreglo){
        AtomicInteger i = new AtomicInteger(0);
        double[] arregloAux = new double[arreglo.length];
        Arrays.stream(arreglo).sorted().forEach(value -> arregloAux[i.getAndIncrement()] = value);
        return arregloAux;
    }

    public static double[] llenarArreglo(double[] arregloB, double[] arregloA){
        for(int i = 0; i < arregloB.length;i++){
            if(i < arregloB.length/2){
                arregloB[i] = arregloA[i];
            }else{
                arregloB[i] = 0.5;
            }
        }
        return arregloB;
    }
}
