package Entidades;

public class Circulo {

    private int radio;

    public Circulo() {
    }
    public Circulo(int radio) {
        this.radio = radio;
    }

    public double area(){
        return Math.PI * Math.pow(radio,2);
    }

    public double perimetro(){
        return Math.PI * 2 * radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int lado) {
        this.radio = lado;
    }
}
