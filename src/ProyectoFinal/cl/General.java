package ProyectoFinal.cl;

import ProyectoFinal.Contenedoras.CQueue;

import java.util.LinkedList;
import java.util.Queue;

public class General {

    static LinkedList<Integer> reservas = new LinkedList<>();
    static CQueue colaReservas = new CQueue();

    public General() {

    }

    public void reservarGeneral () {
        General general = new General();
        if (reservas.size() >= 20){
            colaReservas.getGeneralQueue().add(general);
        } else {
            reservas.add(1 + reservas.size());
        }

    }

    public static int mostrarReservas() {
        System.out.println("************************************");
        System.out.println("Actualmente se encuentran reservados: " + reservas.size() + " espacios en General");
        System.out.println("************************************");
        return reservas.size();
    }

    public static void mostrarColaDeReservas() {
        System.out.println("************************************");
        System.out.println("Actualmente se encuentrar reservados: " + colaReservas.getGeneralQueue().size() + " espacios en la cola de General");
        System.out.println("************************************");
    }

    /*

        System.out.println("Primer elemento: " + reservas.peek());
*/

}
