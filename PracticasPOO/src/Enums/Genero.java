package Enums;

public enum Genero {
     FEMENINO("Femenino", 1), MASCULINO("Masculino",2), OTRO("Otro", 3);

    private String genero;
    private int orden;
    Genero(String genero, int orden) {
        this.genero = genero;
        this.orden = orden;
    }

    public String getGenero(){
        return genero;
    }

    public int getOrden(){
        return orden;
    }

//Así se usan los enums

    /*Genero genero = Genero.HOMBRE;    // Instancia de un enum de la clase Sexo
    genero.name();    // Devuelve un String con el nombre de la constante (HOMBRE)
    genero.toString();    // Devuelve un String con el nombre de la constante (HOMBRE)
    genero.ordinal();    // Devuelve un entero con la posición del enum según está declarada (3).
    genero.compareTo(Enum otro);    // Compara el enum con el parámetro según el orden en el que están declarados lo enum
    Genero.values(); */   // Devuelve un array que contiene todos los enum
}
