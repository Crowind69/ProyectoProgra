package ProyectoFinal.cl;


import java.util.LinkedList;
import java.util.Queue;

public class Preferencial {

    static Queue<Integer> reservas = new LinkedList<>();
    static Queue<Integer> colaReservas = new LinkedList<>();

    public Preferencial() {

    }

    public void reservarPreferencial () {

        if (reservas.size() > 10){
            colaReservas.add(1 + colaReservas.size());
        } else {
            reservas.add(1 + reservas.size());
        }

    }

    public static int mostrarReservas() {
        System.out.println("************************************");
        System.out.println("Actualmente se encuentran reservados: " + reservas.size() + " espacios en Preferencial");
        System.out.println("************************************");
         return reservas.size();
    }

    public static void mostrarColaDeReservas() {
        System.out.println("************************************");
        System.out.println("Actualmente se encuentrar reservados: " + colaReservas.size() + " espacios en la cola de reserva de Preferencial");
        System.out.println("************************************");
    }

    /*

        System.out.println("Primer elemento: " + reservas.peek());
*/


}
