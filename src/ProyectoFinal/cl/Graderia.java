package ProyectoFinal.cl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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

    public static void mostrarReservas() {
        System.out.println("Actualmente se encuentran reservados: " + reservas.size() + " espacios");
    }

    public static void mostrarColaDeReservas() {
        System.out.println("Actualmente se encuentrar reservados: " + colaReservas.size() + " espacios");
    }

    /*

        System.out.println("Primer elemento: " + reservas.peek());
*/
}
