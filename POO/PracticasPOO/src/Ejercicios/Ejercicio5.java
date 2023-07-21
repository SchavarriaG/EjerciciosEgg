package Ejercicios;

import Entity.Cuenta;
import Utils.Write;

public class Ejercicio5 {

    public static void inicializar(){
        Cuenta cuenta1 = Cuenta.crearCuenta();
        cuenta1.consultarDatos();
        cuenta1.consultarSaldo();
        Write.withLineBreak("Enviaste un ingreso de 1000$.");
        cuenta1.ingresar(1000);
        cuenta1.consultarSaldo();
        Write.withLineBreak("Enviaste un retiro de 500$.");
        cuenta1.retirar(500);
        cuenta1.consultarSaldo();
        Write.withLineBreak("Enviaste un retiro rápido de 2000$.");
        cuenta1.extraccionRapida(2000);
    }
}