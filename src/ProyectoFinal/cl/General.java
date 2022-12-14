package ProyectoFinal.cl;

import ProyectoFinal.Contenedoras.CLinkedList;
import ProyectoFinal.Contenedoras.CQueue;

public class General {

    protected String nombre;

    static CLinkedList reservas = new CLinkedList();
    static CQueue colaReservas = new CQueue();

    public General() {

    }

    public General(String nombre) {
        this.nombre = nombre;
    }

    public void reservarGeneral () {
        General general = new General();
        if (reservas.getGeneralLinkedList().size() >= 20){
            colaReservas.getGeneralQueue().add(general);
        } else {
            reservas.getGeneralLinkedList().add(general);
        }

    }

    public static int mostrarReservas() {
        System.out.println("************************************");
        System.out.println("Actualmente se encuentran reservados: " + reservas.getGeneralLinkedList().size() + " espacios en General");
        System.out.println("************************************");
        return reservas.getGeneralLinkedList().size();
    }

    public static void mostrarColaDeReservas() {
        System.out.println("************************************");
        System.out.println("Actualmente se encuentrar reservados: " + colaReservas.getGeneralQueue().size() + " espacios en la cola de General");
        System.out.println("************************************");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {

        return "Bienvenido al teatro Los Patitos" +
                "\nSe muestra una lista de las personas que han reservado un cupo en la zona Preferencia: " + getNombre();
    }

    /*

        System.out.println("Primer elemento: " + reservas.peek());
*/

}
