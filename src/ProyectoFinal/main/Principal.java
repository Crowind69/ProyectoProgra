package ProyectoFinal.main;

import ProyectoFinal.ui.menus;

import java.util.Scanner;

import static ProyectoFinal.ui.menus.*;

public class Principal {

    public static void main(String[] args) {
        int opcion;
        boolean salir = false;

        do {
            menus.presentarMenu();
            opcion = menus.seleccionarOpcion();
            salir = menus.ejecutarOpcion(opcion);
        } while (!salir);
    }
}
