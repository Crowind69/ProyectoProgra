package ProyectoFinal.main;

import java.util.Scanner;

import static ProyectoFinal.ui.menus.*;

public class Principal {

    public static void main(String[] args) {
        int opcion;
        boolean salir = false;

        do {
            presentarMenu();
            opcion = seleccionarOpcion();
            salir = ejecutarOpcion(opcion);
        } while (!salir);
    }
}
