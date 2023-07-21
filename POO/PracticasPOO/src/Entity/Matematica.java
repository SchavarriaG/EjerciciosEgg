package Entity;

import java.text.DecimalFormat;

public class Matematica {
    private static double numA;
    private static double numB;

    public Matematica() {
    }
    public Matematica(double numA, double numB) {
        numA = numA;
        numB = numB;
    }

    public double getNumA() {
        return numA;
    }

    public static void setNumA(double a) {
        numA = a;
    }

    public double getNumB() {
        return numB;
    }

    public static void setNumB(double b) {
        numB = b;
    }

    public static double devolverMayor(){
        if(numA >= numB){
            return numA;
        }else {
            return numB;
        }
    }

    public static double devolverMenor(){
        if(numA <= numB){
            return numA;
        }else {
            return numB;
        }
    }

    public static double calcularPotencia(){

        return redondear(Math.pow(  redondear(devolverMayor(),2),
                                    redondear(devolverMenor(),2)),2);
    }

    public static double calculaRaiz(){
        return Math.sqrt(Math.abs(devolverMenor()));
    }

    public static double redondear(double valor, int cantidadDecimales){
        //Forma de redondear, al valor lo multiplicamos por 10 ^ cantidad de decimales que queremos,
        // luego dividimos por el mismo valor para recuperar solo la cantidad de decimales escogidos
        double aux = Math.pow(10.0, cantidadDecimales);
        return Math.round(valor*aux)/aux;
    }
}
