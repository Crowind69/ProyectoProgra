package ProyectoFinal.Modelo;

public class Preferencial extends PersonasReservas{

    public Preferencial(String nombreCliente) {
    	super(nombreCliente);
    }

    public String toString() {

        return "Bienvenido al teatro Los Patitos" +
                "\nSe muestra una lista de las personas que han reservado un cupo en la zona Preferencia: " + getNombreCliente();
    }
}