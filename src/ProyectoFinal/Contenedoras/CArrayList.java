package ProyectoFinal.Contenedoras;

import ProyectoFinal.cl.Preferencial;

import java.util.ArrayList;

public class CArrayList {
    private static ArrayList<Preferencial> myList;
    private static ArrayList<Preferencial> myLista;


    public CArrayList() {
        setMyList(new ArrayList<Preferencial>());
        setMyLista(new ArrayList<Preferencial>());


    }

    CArrayList(ArrayList<Preferencial> l, ArrayList<Preferencial> ll) {

        this.setMyList(l);
        this.setMyLista(ll);
    }

    public static ArrayList<Preferencial> getMyList() {

        return myList;
    }

    public  ArrayList<Preferencial> getMyLista() {

        return  myLista;
    }

    public void setMyList(ArrayList<Preferencial> myList) {

        this.myList = myList;
    }

    public void setMyLista(ArrayList<Preferencial> myLista) {

        this.myLista = myLista;
    }

}
