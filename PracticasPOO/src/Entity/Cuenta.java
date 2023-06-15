package Entity;

import Utils.Read;
import Utils.Write;

public class Cuenta {
    private int numeroCuenta;
    private long clienteDNI;
    private int saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long clienteDNI, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.clienteDNI = clienteDNI;
        this.saldoActual = saldoActual;
    }

    public static Cuenta crearCuenta() {
        Write.withLineBreak("Ingresa tu número de cuenta:");
        int numeroCuenta = Read.integer();
        Write.withLineBreak("Ingresa tu DNI de cliente:");
        long clienteDNI = Read.integerLarge();
        Write.withLineBreak("Ingresa el saldo de tu cuenta:");
        int saldoActual = Read.integer();
        return new Cuenta(numeroCuenta, clienteDNI, saldoActual);
    }

    public void ingresar(int ingreso){
        saldoActual += ingreso;
    }

    public void retirar(int retiro){
        saldoActual =  (retiro > saldoActual) ? 0 : saldoActual - retiro;
    }

    public void extraccionRapida(int retiro){
        if((double) retiro <= saldoActual * 0.2){
            saldoActual -= retiro;
        }else{
            Write.withLineBreak("No puedes retirar más del 20% de tu saldo actual.");
        }
    }

    public void consultarSaldo(){
        Write.withLineBreak("Su saldo actual es $" + getSaldoActual());
    }

    public void consultarDatos(){
        Write.withLineBreak("Tu cuenta es #" + getNumeroCuenta());
        Write.withLineBreak("Tu DNI asociado a la cuenta es DNI: " + getClienteDNI());
    }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getClienteDNI() {
        return clienteDNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setClienteDNI(long clienteDNI) {
        this.clienteDNI = clienteDNI;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
}
