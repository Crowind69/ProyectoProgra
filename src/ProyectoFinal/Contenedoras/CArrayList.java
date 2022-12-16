package ProyectoFinal.Contenedoras;

import ProyectoFinal.Modelo.Preferencial;

import java.util.ArrayList;

public class CArrayList {
    private static ArrayList<Preferencial> myList;

    public CArrayList() {

        setMyList(new ArrayList<Preferencial>());
    }

    CArrayList(ArrayList<Preferencial> l) {

        this.setMyList(l);
    }

    public static ArrayList<Preferencial> getMyList() {

        return myList;
    }

    public void setMyList(ArrayList<Preferencial> myList) {

        this.myList = myList;
    }
}
