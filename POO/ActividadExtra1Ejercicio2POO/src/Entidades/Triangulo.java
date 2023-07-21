package Entidades;

public class Triangulo {

    private int base;
    private double altura;

    public Triangulo() {
    }
    public Triangulo(int base) {
        this.base = base;
        this.altura = Math.sqrt(3)*base/2;
    }

    public double area(){
        return (base * altura) / 2;
    }

    public int perimetro(){
        return base * 3;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
