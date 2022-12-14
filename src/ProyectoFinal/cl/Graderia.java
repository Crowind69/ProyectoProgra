package ProyectoFinal.cl;

import ProyectoFinal.Contenedoras.CQueue;
import ProyectoFinal.Contenedoras.CStack;


public class Graderia {

    protected String nombre;

    static CStack reservas = new CStack();

    static CQueue colaReservas = new CQueue();
    public Graderia() {

    }

    public Graderia(String nombre) {
        this.nombre = nombre;
    }

    public void reservarGraderia () {
        Graderia graderia = new Graderia();
        if (reservas.getStack().size() >= 25){
            colaReservas.getGraderiaQueue().add(graderia);
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
        System.out.println("Actualmente se encuentran reservados: " + colaReservas.getGraderiaQueue().size() + " espacios reservados en la cola de Graderia");
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
