package ProyectoFinal.cl;


import ProyectoFinal.Contenedoras.CArrayList;

import java.util.LinkedList;
import java.util.Queue;

public class Preferencial {

    protected String nombre;

    static CArrayList reservas = new CArrayList();

    static Queue<Integer> colaReservas = new LinkedList<>();

    public Preferencial() {


    }

    public Preferencial(String nombre) {

        this.nombre = nombre;
    }

    public void reservarPreferencial () {
        Preferencial p = new Preferencial();

        if (reservas.getMyList().size() >= 10){
            colaReservas.add(1 + colaReservas.size());
        } else {
            reservas.getMyList().add(p);
        }
    }

    public static int mostrarReservas() {
        System.out.println("************************************");
        System.out.println("Actualmente se encuentran reservados: " + reservas.getMyList().size() + " espacios en Preferencial");
        System.out.println("************************************");
        return reservas.getMyList().size();
    }

    public static void mostrarColaDeReservas() {
        System.out.println("************************************");
        System.out.println("Actualmente se encuentrar reservados: " + colaReservas.size() + " espacios en la cola de reserva de Preferencial");
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