package Entidades;

public class Rombo {

    private int diagonalMayor;
    private int diagonalMenor;

    public Rombo() {
    }
    public Rombo(int diagonalMayor, int diagonalMenor) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    public double area(){
        return diagonalMayor * diagonalMenor / 2;
    }

    public double perimetro(){
        return Math.sqrt(Math.pow(diagonalMayor/2, 2) + Math.pow(diagonalMenor/2, 2)) * 4;
    }

    public int getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(int diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public int getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(int diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }
}
