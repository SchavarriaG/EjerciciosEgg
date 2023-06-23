package Entity;

public class Cadena {
    private String frase;
    private int longitud;

    public int mostrarVocales(){
        /*String letra;
        int count = 0;
        for (int i = 0; i < longitud; i++){
            letra = frase.substring(i,i+1);
            if("a".equalsIgnoreCase(letra) || "e".equalsIgnoreCase(letra) || "i".equalsIgnoreCase(letra)
                    || "o".equalsIgnoreCase(letra) || "u".equalsIgnoreCase(letra) ){
                count++;
            }
        }
        return count;*/
        return vecesRepetido("a") + vecesRepetido("e") + vecesRepetido("i") + vecesRepetido("o") +
                vecesRepetido("u");
    }

    public String invertirFrase(){
        StringBuilder fraseInv = new StringBuilder();
        for(int i = longitud - 1; i >= 0 ;i--){
            fraseInv.append(frase.charAt(i));
        }
        return fraseInv.toString();
    }

    public int vecesRepetido(String letra){
        int count = 0;
        for (int i = 0; i < longitud; i++){
            if(letra.equalsIgnoreCase(frase.substring(i,i+1))){
                count++;
            }
        }
        return count;
    }

    public boolean compararLongitud(String frase){
        return longitud == frase.length();
    }

    public String unirFrases(String frase){
        return this.frase + frase;
    }

    public String reemplazarLetra(String caracter){
        return frase.replace("a", caracter);
    }

    public boolean contiene(String letra){
        return frase.contains(letra);
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }
    public int getLongitud() {
        return longitud;
    }


}
