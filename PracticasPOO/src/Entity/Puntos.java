package Entity;

import Utils.Read;
import Utils.Write;

import java.util.Random;

public class Puntos {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public static Puntos crerPuntos(){
        Write.withLineBreak("Ingresa la coordenada x del punto:");
        int x = Read.integer();
        Write.withLineBreak("Ingresa la coordenada y del punto: ");
        int y = Read.integer();
        return new Puntos((int)(Math.random()*100),(int)(Math.random()*10),x,y);
    }

    public void calcularDistancia(){
        Write.withLineBreak("La distancia entre los puntos "+ this + " es " + (Math.round(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2))*100)/100.0)  );
    }

    public String toString(){
        return "X1= "+x1+", Y1= "+y1+", X2= "+x2+" y Y2= "+y2;
    }
}
