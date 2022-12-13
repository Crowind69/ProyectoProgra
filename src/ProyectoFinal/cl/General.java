package ProyectoFinal.cl;

import java.util.LinkedList;
import java.util.Queue;

public class General {

    static LinkedList<Integer> reservas = new LinkedList<>();
    static Queue<Integer> colaReservas = new LinkedList<>();

    public General() {

    }

    public void reservarGeneral () {
        if (reservas.size() >= 20){
            colaReservas.add(1 + colaReservas.size());
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
        System.out.println("Actualmente se encuentrar reservados: " + colaReservas.size() + " espacios en la cola de General");
        System.out.println("************************************");
    }

    /*

        System.out.println("Primer elemento: " + reservas.peek());
*/

}
