package Entity;

import Utils.Read;
import Utils.Write;

public class Circunferencia {
    private double radio;

    public Circunferencia(){

    }
    public Circunferencia(double radio){
        this.radio = radio;
    }

    public void crearCircunferencia(){
        Write.withLineBreak("Ingresa el radio de la circunferencia");
        radio = Read.decimal();
        //setRadio(Read.decimal());  Otra forma
    }
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetro(){
        return Math.PI * 2 * radio;
    }

    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }
}
