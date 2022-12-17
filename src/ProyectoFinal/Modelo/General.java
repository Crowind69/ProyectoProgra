package ProyectoFinal.Modelo;

public class General extends PersonasReservas {

    public General(String nombreCliente) {
    	super(nombreCliente);

    }

    public String toString() {

        return "Bienvenido al teatro Los Patitos" +
                "\nSe muestra una lista de las personas que han reservado un cupo en la zona Graderia General: " + getNombreCliente();
    }
}
