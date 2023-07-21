package Entidades;

import Enums.TipoVehiculo;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private TipoVehiculo tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, TipoVehiculo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", tipo='" + tipo.getTipo() + '\'' +
                '}';
    }
}
