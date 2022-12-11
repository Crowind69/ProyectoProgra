package ProyectoFinal.cl;

import java.util.LinkedList;
import java.util.Queue;
public class Graderia {

    static Queue<Integer> reservas = new LinkedList<>();
    static Queue<Integer> colaReservas = new LinkedList<>();

    public Graderia() {

    }

    public void reservarGraderia () {

        if (reservas.size() > 10){
            colaReservas.add(1 + colaReservas.size());
        } else {
            reservas.add(1 + reservas.size());
        }

    }

    public static int mostrarReservas() {
        System.out.println("************************************");
        System.out.println("Actualmente se encuentran reservados: " + reservas.size() + " espacios en Graderia");
        System.out.println("************************************");
        return reservas.size();
    }

    public static void mostrarColaDeReservas() {
        System.out.println("************************************");
        System.out.println("Actualmente se encuentrar reservados: " + colaReservas.size() + " espacios reservados en la cola de Graderia");
        System.out.println("************************************");

    }

    /*

        System.out.println("Primer elemento: " + reservas.peek());
*/
}
