package ProyectoFinal.cl;


import ProyectoFinal.Contenedoras.CArrayList;
import ProyectoFinal.Contenedoras.CQueue;



public class Preferencial extends PersonasReservas{
	
	static CArrayList reservas = new CArrayList();
    static CQueue colaReservas = new CQueue();

    public Preferencial(String nombreCliente) {
    	super(nombreCliente);

    }


    public static int mostrarReservas() {
        System.out.println("************************************");
        System.out.println("Actualmente se encuentran reservados: " + reservas.getMyList().size() + " espacios en Preferencial");
        System.out.println("************************************");
        return reservas.getMyList().size();
    }

    public static void mostrarColaDeReservas() {
        System.out.println("************************************");
        System.out.println("Actualmente se encuentrar reservados: " + colaReservas.getQueue().size() + " espacios en la cola de reserva de Preferencial");
        System.out.println("************************************");
    }


    public String toString() {

        return "Bienvenido al teatro Los Patitos" +
                "\nSe muestra una lista de las personas que han reservado un cupo en la zona Preferencia: " + getNombreCliente();
    }
}