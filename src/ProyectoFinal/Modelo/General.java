package ProyectoFinal.Modelo;

import ProyectoFinal.Contenedoras.CLinkedList;
import ProyectoFinal.Contenedoras.CQueue;

public class General extends PersonasReservas {

    static CLinkedList reservas = new CLinkedList();
    static CQueue colaReservas = new CQueue();

    public General(String nombreCliente) {
    	super(nombreCliente);

    }

    public String toString() {

        return "Bienvenido al teatro Los Patitos" +
                "\nSe muestra una lista de las personas que han reservado un cupo en la zona Preferencia: " + getNombreCliente();
    }
}
