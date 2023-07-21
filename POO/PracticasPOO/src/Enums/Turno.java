package Enums;

public enum Turno {
    MANANA("Mañana"), TARDE("Tarde");

    private String value;

    Turno(String genero) {
        this.value = genero;
    }

    public String getValue() {
        return value;
    }

}
