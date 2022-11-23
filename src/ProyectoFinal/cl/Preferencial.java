package ProyectoFinal.cl;


import java.util.ArrayList;
import java.util.Arrays;

public class Preferencial {
    static ArrayList<Preferencial> listaEspera = new ArrayList<Preferencial>();
    static int[] campos = new int[10];

    public Preferencial() {

    }

    public Preferencial(int[] campos) {
        this.campos = campos;
    }

    public static ArrayList<Preferencial> getListaEspera() {
        return listaEspera;
    }

    public static void setListaEspera(ArrayList<Preferencial> listaEspera) {
        Preferencial.listaEspera = listaEspera;
    }

    public int[] getCampos() {
        return campos;
    }

    public void setCampos(int[] campos) {
        this.campos = campos;
    }


    public static void devolverCampo() {

        // vamos a crear una funcion que devuelve el campo que se acaba de comprar

    }

    @Override
    public String toString() {
        return "Preferencial{" +
                "campos=" + Arrays.toString(campos) +
                '}';
    }
}
