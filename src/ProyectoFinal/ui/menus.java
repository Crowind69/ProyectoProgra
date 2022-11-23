package ProyectoFinal.ui;

import ProyectoFinal.cl.General;
import ProyectoFinal.cl.Graderia;
import ProyectoFinal.cl.Preferencial;

import java.util.Scanner;

public class menus {

    static Scanner entrada = new Scanner(System.in);


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

    public static void ubicacionReserva() {

        System.out.println(" ***************************************** ");
        System.out.println("1. Preferencial");
        System.out.println("2. Gradería Preferencial");
        System.out.println("3. Gradería General");
        System.out.println("4. Salir");
        System.out.println(" ***************************************** ");

    }

    public static void reservarPreferencial() {
        System.out.println("vamos a llamar al set de preferencial para asigarle el espacio");
        System.out.println("Devolver al menu");

    }

    public static void reservarGraderia() {
        System.out.println("vamos a llamar al set de preferencial para asigarle el espacio");
        System.out.println("Devolver al menu");

    }

    public static void reservarGeneral() {
        System.out.println("vamos a llamar al set de preferencial para asigarle el espacio");
        System.out.println("Devolver al menu");

    }

    public static boolean reservar(int opcion) {

        boolean salir = false;
        switch (opcion){

            case 1:
                //Reservamos Preferencial
                System.out.println(" ***************************************** ");
                System.out.println("    Reservando en preferencial      ");
                System.out.println(" ***************************************** ");
                // empezar a ejectuar el codigo en la CL

                new Preferencial();
               // reservarPreferencial();

                break;

            case 2:
                //Reservar en graderia
                System.out.println(" ***************************************** ");
                System.out.println("    Reservando en graderia preferencial      ");
                System.out.println(" ***************************************** ");
                // empezar a ejectuar el codigo en la CL
                new Graderia();
                break;

            case 3:
                //Reservar general
                System.out.println(" ***************************************** ");
                System.out.println("    Reservando en general      ");
                System.out.println(" ***************************************** ");
                // empezar a ejectuar el codigo en la CL
                new General();
            default:
                System.out.println("Opcion invalida");

        }

        return salir;

    }

    public static boolean moostrarReservas(int opcion) {

        boolean salir = false;
        switch (opcion){

            case 1:
                //Mostrar Reserva Preferencial

                break;

            case 2:
                //Mostrar Reserva Graderia
           ;
                break;

            case 3:
                //Mostrar Reserva general
                break;

            default:
                System.out.println("Opcion invalida");

        }

        return salir;

    }

    public static boolean moostrarColaDeReservas(int opcion) {

        boolean salir = false;
        switch (opcion){

            case 1:
                //Mostrar Reserva Preferencial

                break;

            case 2:
                //Mostrar Reserva Graderia
                ;
                break;

            case 3:
                //Mostrar Reserva general
                break;

            default:
                System.out.println("Opcion invalida");

        }

        return salir;

    }

    public static boolean ejecutarOpcion(int opcion) {

        boolean salir = false;
        switch (opcion) {
            case 1:
                //Escoger la ubicacion en donde queremos reservar
                do {
                    ubicacionReserva();
                    opcion = seleccionarOpcion();
                    salir = reservar(opcion);
                } while (!salir);

                break;

            case 2:
                //mostrando reservas por ubicacion
                do {
                    ubicacionReserva();
                    opcion = seleccionarOpcion();
                    salir = moostrarReservas(opcion);
                } while (!salir);
                break;

            case 3:
                //Mostrar cola de reservas
                do {
                    ubicacionReserva();
                    opcion = seleccionarOpcion();
                    salir = moostrarColaDeReservas(opcion);
                } while (!salir);
                break;

            case 4:
                //vamos a traer total de reservas de preferencial
                //vamos a traer el total de reservas de gerencia
                //vamos a traer el total de reservas de general

                // vamos a multiplicar cada valor por lo que vale su tiquete
                // mostrarmos el output
                break;

            case 5:
                //mostrando ganancias por ubicaciones
                //llamamos el get con el arraylist de cada clase
                break;

            case 6:
                //mostrando el teatro
                //llamamos los vectores y los imprimimos
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
