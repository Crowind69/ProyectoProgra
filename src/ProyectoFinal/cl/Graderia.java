package ProyectoFinal.cl;

import ProyectoFinal.Contenedoras.CStack;

import java.util.LinkedList;
import java.util.Queue;

public class Graderia {

    static CStack reservas = new CStack();
    static Queue<Integer> colaReservas = new LinkedList<>();

    public Graderia() {

    }

    public void reservarGraderia () {
        Graderia graderia = new Graderia();
        if (reservas.getStack().size() >= 25){
            colaReservas.add(1 + colaReservas.size());
        } else {
            reservas.getStack().push(graderia);
        }

    }

    public static int mostrarReservas() {
        System.out.println("************************************");
        System.out.println("Actualmente se encuentran reservados: " + reservas.getStack().size() + " espacios en Graderia");
        System.out.println("************************************");
        return reservas.getStack().size();
    }

    public static void mostrarColaDeReservas() {
        System.out.println("************************************");
        System.out.println("Actualmente se encuentran reservados: " + colaReservas.size() + " espacios reservados en la cola de Graderia");
        System.out.println("************************************");

    }

    /*

        System.out.println("Primer elemento: " + reservas.peek());
*/
}
