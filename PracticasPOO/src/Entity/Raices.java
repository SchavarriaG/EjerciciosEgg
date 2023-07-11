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

    public double obtenerDiscriminante(){
        return Math.pow(b,2) - 4*a*c;
    }

    public boolean tieneRaices(){
        return obtenerDiscriminante() >= 0;
    }

    public boolean tieneRaiz(){
        return obtenerDiscriminante() == 0;
    }

    public void obtenerRaices(){
        if(tieneRaices()){
            Write.withLineBreak("Las raices de la ecuación de segundo grado " + this
                    +" son: X1= " + ( (-b + Math.sqrt(Math.pow(b,2) -(4*a*c)) ) /(2*a))
                    + " y X2= "   + ( (-b - Math.sqrt(Math.pow(b,2) -(4*a*c)) ) /(2*a))    );
        }else{
            Write.withLineBreak("No tiene dos raices.");
        }
    }

    public void obtenerRaiz(){
        if(tieneRaices()){
            Write.withLineBreak("Las raiz de la ecuación de segundo grado " + this +" es 0.");
        }else{
            Write.withLineBreak("No tiene dos raices.");
        }
    }


    public String toString(){
        return a + "x^2 + "+ b+"x + "+c;
    }
}
