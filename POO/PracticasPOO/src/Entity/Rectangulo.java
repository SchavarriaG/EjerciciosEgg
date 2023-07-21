package Entity;

import Utils.Read;
import Utils.Write;

public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.altura = altura;
        this.base = base;
    }

    public static Rectangulo crearRectangulo() {
        Write.withLineBreak("Ingresa el valor de la base: ");
        int base = Read.integer();
        Write.withLineBreak("Ingresa el valor de la altura: ");
        int altura = Read.integer();
        return new Rectangulo(base, altura);
    }

    public int calcularSuperficie() {
        return base * altura;
    }

    public int calcularPerimetro() {
        return (base + altura) * 2;
    }

    public void dibujarRectangulo(){
        for(int i = 1; i <= altura; i++){
            for (int j = 1; j <= base; j++){
                if(i == 1 || i == altura || j == 1 || j == base){
                    Write.withoutLineBreak("*");
                }else {
                    Write.withoutLineBreak(" ");
                }
            }
            Write.withLineBreak("");
        }
    }
    public int getBase() {
        return base;
    }

    public int getAltura(){
        return altura;
    }

    public void setBase(int base){
        this.base = base;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }
}
