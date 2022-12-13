package ProyectoFinal.Contenedoras;

import ProyectoFinal.cl.General;

import java.util.LinkedList;

public class CLinkedList {
    private static LinkedList<General> generalLinkedList;

    public CLinkedList() {
        setGeneralLinkedList(new LinkedList<General>());
    }

    CLinkedList(LinkedList<General> l) {
        this.setGeneralLinkedList(l);
    }

    public void setGeneralLinkedList(LinkedList<General> generalLinkedList) {
        this.generalLinkedList = generalLinkedList;
    }

    public LinkedList<General> getGeneralLinkedList() {
        return generalLinkedList;
    }


}
