package Enums;

public enum TipoVehiculo {

    AUTOMOVIL("Automovil",1), MOTOCICLETA("Motocicleta", 2), BICICLETA("Bicicleta", 3);

    private String tipo;
    private int orden;
    TipoVehiculo(String tipo, int orden) {
        this.tipo = tipo;
        this.orden = orden;
    }

    public String getTipo(){
        return tipo;
    }

    public int getOrden(){
        return orden;
    }
}
