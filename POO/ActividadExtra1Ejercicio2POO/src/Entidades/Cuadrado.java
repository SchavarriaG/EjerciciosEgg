package Entidades;

public class Cuadrado {
    private int lado;

    public Cuadrado() {
    }
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int area(){
        return lado * lado;
    }

    public int perimetro(){
        return 4 * lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

}
