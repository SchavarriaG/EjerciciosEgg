package Entity;

import Utils.Write;

public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {

    }
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
        escribirCantidadActual();
    }

    public void llenarCafetera(){
        Write.withLineBreak("Se llena la cafetera.");
        cantidadActual = capacidadMaxima;
        escribirCantidadActual();
    }

    public void servirTaza(int tamTaza){
        //cantidadActual = (cantidadActual < tamTaza) ? 0 : cantidadActual - tamTaza;
        if(tamTaza > cantidadActual){
            Write.withLineBreak("No se alcanza a llenar la taza.");
            vaciarCafetera();
        }else{
            Write.withLineBreak("Se llenó la taza con la cantidad " + tamTaza + " ml.");
            cantidadActual -= tamTaza;
        }
        escribirCantidadActual();
    }

    public void escribirCantidadActual(){
        Write.withLineBreak("La cantidad actual de la cafetera es " + cantidadActual + " de " + capacidadMaxima);
    }
    public void vaciarCafetera(){
        Write.withLineBreak("Se vació la cafetera.");
        cantidadActual = 0;
        escribirCantidadActual();
    }

    public void agregarCafe(int cafeAgregado){
        if(cafeAgregado + cantidadActual > capacidadMaxima){
            Write.withoutLineBreak("Se agrega la cantidad de " + (capacidadMaxima - cantidadActual));
            Write.withLineBreak(" y sobra " + (cafeAgregado+cantidadActual-capacidadMaxima));
            cantidadActual = capacidadMaxima;
        }else{
            Write.withLineBreak("Se agrega la cantidad de " + cafeAgregado);
            cantidadActual += cafeAgregado;
        }
        escribirCantidadActual();
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
}
