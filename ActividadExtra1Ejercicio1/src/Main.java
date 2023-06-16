import Entidades.Vehiculo;
import Enums.TipoVehiculo;

public class Main {
    public static void main(String[] args){

        Vehiculo auto = new Vehiculo();
        auto.setAnio(2022);
        auto.setMarca("Seat");
        auto.setModelo("Arona");
        auto.setTipo(TipoVehiculo.AUTOMOVIL);

        Vehiculo motocicleta = new Vehiculo("Honda","CBR",2021,TipoVehiculo.MOTOCICLETA);

        Vehiculo bicicleta = new Vehiculo("Shimano", "gw", 2022, TipoVehiculo.BICICLETA);



    }
}
