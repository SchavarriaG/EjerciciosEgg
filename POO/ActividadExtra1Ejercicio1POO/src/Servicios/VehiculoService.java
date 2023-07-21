package Servicios;

import Entidades.Vehiculo;
import Enums.TipoVehiculo;

public class VehiculoService {

    public int mover(Vehiculo vehiculo, int segundos){
        if(vehiculo.getTipo() == TipoVehiculo.AUTOMOVIL){
            return 3 * segundos;
        } else if (vehiculo.getTipo() == TipoVehiculo.MOTOCICLETA) {
            return 2 * segundos;
        }else {
            return segundos;
        }
    }

    public int frenar(Vehiculo vehiculo){
        if(vehiculo.getTipo() == TipoVehiculo.BICICLETA){
            return 2;
        }else{
            return 0;
        }
    }
}
