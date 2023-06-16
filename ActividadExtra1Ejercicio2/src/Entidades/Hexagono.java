package Entidades;

public class Hexagono {

    private int lado;
    private double apotema;

    public Hexagono() {
    }
    public Hexagono(int lado) {
        this.lado = lado;
        this.apotema = Math.sqrt(Math.pow(lado, 2) - Math.pow(lado/2, 2));
    }

    public double area(){
        return lado * 3 * apotema;
    }

    public double perimetro(){
        return lado * 6;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }
}
