package Entidades;

public class Pentagono {

    private int lado;
    private double apotema;

    public Pentagono() {
    }
    public Pentagono(int lado) {
        this.lado = lado;
        this.apotema = (lado / 2) * Math.sqrt(1+(2/Math.sqrt(5)));
    }

    public double area(){
        return (lado * 5 * apotema) / 2;
    }

    public double perimetro(){
        return lado * 5;
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
