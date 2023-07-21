package Entity;

import Utils.Write;

public class Raices {
    private int a;
    private int b;
    private int c;

    public Raices() {
    }

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double obtenerDiscriminante(){
        return Math.pow(b,2) - 4*a*c;
    }

    private boolean tieneRaices(){
        return obtenerDiscriminante() > 0;
    }

    private boolean tieneRaiz(){
        return obtenerDiscriminante() == 0;
    }

    private void obtenerRaices(){
        if(tieneRaices()){
            Write.withLineBreak("Las raices de la ecuación de segundo grado " + this
                    +" son: X1= " + ( Math.round((-b + Math.sqrt(Math.pow(b,2) -(4*a*c)) ) /(2*a)*100)/100.0 )
                    + " y X2= "   + ( Math.round((-b - Math.sqrt(Math.pow(b,2) -(4*a*c)) ) /(2*a)*100)/100.0 )  );
        }else {
            obtenerRaiz();
        }
    }

    private void obtenerRaiz(){
        if(tieneRaiz()){
            Write.withLineBreak("Tiene una raiz la ecuación de segundo grado " + this +" y es "+ (-b/(2*a)));
        }else{
            Write.withLineBreak("No tiene solución.");
        }
    }

    public void calcular(){
        obtenerRaices();
    }

    public String toString(){
        return a + "x^2 + "+ b+"x + "+c;
    }
}
