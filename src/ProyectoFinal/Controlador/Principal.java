package ProyectoFinal.Controlador;

import ProyectoFinal.Vista.Interfaz;

import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws IOException {
        int opcion;
        boolean salir = false;

        do {
            Interfaz.presentarMenu();
            opcion = Interfaz.seleccionarOpcion();
            salir = Interfaz.ejecutarOpcion(opcion);
        } while (!salir);
    }
}
