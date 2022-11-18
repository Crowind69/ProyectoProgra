package ProyectoFinal;

import java.util.Scanner;

public class Principal {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        boolean salir = false;

        do {
            presentarMenu();
            opcion = seleccionarOpcion();
            salir = ejecutarOpcion(opcion);
        } while (!salir);
    }

    public static void presentarMenu() {
        System.out.println(" ***************************************** ");
        System.out.println("1. Realizar reservación; ");
        System.out.println("2. Mostrar reservas por ubicación: ");
        System.out.println("3. Mostrar colas de espera por ubicación: ");
        System.out.println("4. Mostrar ganancias totales ");
        System.out.println("5. Mostrar ganancias por ubicaciones ");
        System.out.println("6. Mostrar el teatro");
        System.out.println("7. Salir");
        System.out.println(" ***************************************** ");

    }

    public static int seleccionarOpcion() {
        int opcion;
        System.out.print("Ingrese su opcion: ");
        opcion = entrada.nextInt();
        return opcion;

    }

    public static boolean ejecutarOpcion(int opcion) {

        boolean salir = false;
        switch (opcion) {
            case 1:
                //realizando reservacion
                break;

            case 2:
                //mostrando reservas por ubicacion
                break;

            case 3:
                //mostrando colas de espera
                break;

            case 4:
                //mostrando ganancias totales
                break;

            case 5:
                //mostrando ganancias por ubicaciones
                break;

            case 6:
                //mostrando el teatro
                break;

            case 7:
                salir = true;
                break;

            default:
                System.out.println("Opcion invalida");
        }
        return salir;
    }

}
