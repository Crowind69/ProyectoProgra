package ProyectoFinal.cl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class General {

    Queue<Integer> reservas = new LinkedList<>();
    Queue<Integer> colaReservas = new LinkedList<>();

    public General() {

        if (reservas.size() > 10){
            colaReservas.add(colaReservas.size()+1);
        } else {
            reservas.add(reservas.size()+1);
        }

    }

    public void mostrarReservas() {
        System.out.println("Actualemte se encuentran reservados: " + reservas.size() + " espacios");
    }

    public void mostrarColaDeReservas() {
        System.out.println("Actualemte se encuentrar reservados: " + colaReservas.size() + " espacios");
    }

    /*

        System.out.println("Primer elemento: " + reservas.peek());
*/

}
