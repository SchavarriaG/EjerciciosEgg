package Entity;


import Enums.Turno;
import Utils.Read;
import Utils.Write;

import java.util.Arrays;

public class Movil {
    private String marca;
    private double precio;
    private String modelo;
    private int memoriaRam;
    private int almacenamiento;
    private int[] codigo = new int[7];

    public Movil() {
    }

    public Movil(String marca, double precio, String modelo, int memoriaRam, int almacenamiento, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    public static Movil cargarCelular(){
        Write.withLineBreak("Escriba la marca del celular: ");
        String marca = Read.text();

        Write.withLineBreak("Escriba el precio del celular: ");
        int precio = Read.integer();

        Write.withLineBreak("Escriba el modelo del celular: ");
        String modelo = Read.text();

        Write.withLineBreak("Escriba la cantidad de memoria ram en GB que tiene el celular: ");
        int memoriaRam = Read.integer();

        Write.withLineBreak("Escriba la capacidad de almacenamiento en GB del celular: ");
        int almacenamiento = Read.integer();

        Write.withLineBreak("Escriba el nombre de los alumnos: ");
        return new Movil(marca,precio,modelo,memoriaRam, almacenamiento, cargarCodigo());
    }

    public static int[] cargarCodigo(){
        int[] aux = new int[7];
        for (int i = 0; i < aux.length; i++){
            Write.withLineBreak("Escriba el dígito #" + (i+1) + " del código:");
            aux[i] = Read.integer();
        }
        return aux;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Movil{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", modelo='" + modelo + '\'' +
                ", memoriaRam=" + memoriaRam +
                ", almacenamiento=" + almacenamiento +
                ", codigo=" + Arrays.toString(codigo) +
                '}';
    }
}
