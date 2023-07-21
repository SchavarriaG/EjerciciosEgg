package Entity;

import Utils.Read;
import Utils.Write;

public class NIF {
    private long DNI;
    private String letra;

    private static final String[] vector = {"T","R","W","A","G","M","Y","F","P","D","X",
                                            "B","N","J","Z", "S","Q","V","H","L","C","K","E"};

    public void crearNif(){
        Write.withLineBreak("Ingresa tu DNI: ");
        DNI = Read.integerLarge();
        letra = vector[Math.round(DNI%23)];
    }

    public void mostrar(){
        Write.withLineBreak("Tu NIF es: "+ DNI + "-" + letra);
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
}
