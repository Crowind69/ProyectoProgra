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

    public CQueue(){
        myQueue = new LinkedList<Preferencial>();
        graderiaQueue = new LinkedList<Graderia>();
        generalQueue = new LinkedList<General>();

    }
    public CQueue(Queue<Preferencial> myQueue, Queue<Graderia> graderiaQueue, Queue<General> generalQueue, Queue<Preferencial> preferencialCola){
        this.myQueue = myQueue;
        this.graderiaQueue = graderiaQueue;
        this.generalQueue = generalQueue;
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


    public static Queue<Preferencial> getQueue() {
        return myQueue;
    }

    public static Queue<Graderia> getGraderiaQueue() {
        return graderiaQueue;
    }

    public static Queue<General> getGeneralQueue() {
        return generalQueue;
    }

}
