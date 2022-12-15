package ProyectoFinal.Contenedoras;

import ProyectoFinal.cl.General;
import ProyectoFinal.cl.Graderia;
import ProyectoFinal.cl.Preferencial;

import java.util.LinkedList;
import java.util.Queue;

public class CQueue {
    private static Queue<Preferencial> myQueue; //Clase Preferencial
    private static Queue<Graderia> graderiaQueue;
    private static Queue<General> generalQueue;
    private static Queue<Preferencial> preferencialCola; //Clase menú para guardar nombres
    public CQueue(){
        myQueue = new LinkedList<Preferencial>();
        graderiaQueue = new LinkedList<Graderia>();
        generalQueue = new LinkedList<General>();
        preferencialCola = new LinkedList<Preferencial>();

    }
    public CQueue(Queue<Preferencial> myQueue, Queue<Graderia> graderiaQueue, Queue<General> generalQueue, Queue<Preferencial> preferencialCola){
        this.myQueue = myQueue;
        this.graderiaQueue = graderiaQueue;
        this.generalQueue = generalQueue;
        this.preferencialCola = preferencialCola;
    }
    public void setMyQueue(Queue<Preferencial> myQueue) {
        this.myQueue = myQueue;
    }

    public void setGraderiaQueue(Queue<Graderia> graderiaQueue) {
        this.graderiaQueue = graderiaQueue;
    }

    public void setGeneralQueue(Queue<General> generalQueue) {
        this.generalQueue = generalQueue;
    }

    public void setPreferencialCola(Queue<Preferencial> preferencialCola) {
        this.preferencialCola = preferencialCola;
    }

    public static Queue<Preferencial> getQueue() {
        return myQueue;
    }

    public static Queue<Graderia> getGraderiaQueue() {
        return graderiaQueue;
    }

    public static Queue<General> getGeneralQueue() {
        return generalQueue;
    }

    public static Queue<Preferencial> getPreferencialCola() {
        return preferencialCola;
    }
}
