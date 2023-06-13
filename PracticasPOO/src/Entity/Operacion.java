package Entity;

import Utils.Read;
import Utils.Write;

public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion(){

    }
    public Operacion(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion crerOperacion(){
        Write.withLineBreak("Ingresa el número 1:");
        int num1 = Read.integer();
        Write.withLineBreak("Ingresa el número 2:");
        int num2 = Read.integer();
        return new Operacion(num1, num2);
    }

    public int sumar(int num1, int num2){
        return num1 + num2;
    }

    public int restar(int num1, int num2){
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2){
        if (num1 == 0 || num2 == 0){
            Write.withLineBreak("Error, estás multiplicando por cero.");
            return 0;
        }else{
            return num1 * num2;
        }

    }

    public double dividir(int num1, int num2){
        if (num2 == 0){
            Write.withLineBreak("Error, no se puede dividir por cero.");
            return 0;
        }else{
            return  num1 / num2;
        }
    }
    public int getNumero1(){
        return numero1;
    }

    public int getNumero2(){
        return numero2;
    }

    public void setNumero1(int numero1){
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2){
        this.numero2 = numero2;
    }
}
