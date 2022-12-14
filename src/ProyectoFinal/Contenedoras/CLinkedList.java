package ProyectoFinal.Contenedoras;

import ProyectoFinal.cl.General;

import java.util.LinkedList;

public class CLinkedList {
    private static LinkedList<General> generalLinkedList;
    private static LinkedList<General> generalReservas;

    public CLinkedList() {

        setGeneralLinkedList(new LinkedList<General>());
        setGeneralReservas(new LinkedList<General>());

    }

    CLinkedList(LinkedList<General> l, LinkedList<General> ll) {

        this.setGeneralLinkedList(l);
        this.setGeneralReservas(ll);
    }

    public void setGeneralLinkedList(LinkedList<General> generalLinkedList) {
        this.generalLinkedList = generalLinkedList;
    }

    public  void setGeneralReservas(LinkedList<General> generalReservas) {
        this.generalReservas = generalReservas;
    }

    public LinkedList<General> getGeneralLinkedList() {

        return generalLinkedList;
    }

    public static LinkedList<General> getGeneralReservas() {
        return generalReservas;
    }
}
