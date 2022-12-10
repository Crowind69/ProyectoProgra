package ProyectoFinal.ui;

import ProyectoFinal.cl.General;
import ProyectoFinal.cl.Graderia;
import ProyectoFinal.cl.Preferencial;

import java.util.Scanner;

public class menus {

    static Scanner entrada = new Scanner(System.in);

    /* *****************************************
           INICIO DE OPCIONES PARA MENUS
       **************************************** */
    public static void presentarMenu() {
        System.out.println(" ***************************************** ");
        System.out.println("1. Realizar reservacion; ");
        System.out.println("2. Mostrar reservas por ubicacion: ");
        System.out.println("3. Mostrar colas de espera por ubicacion: ");
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
        System.out.println("2. Graderia Preferencial");
        System.out.println("3. Graderia General");
        System.out.println("4. Salir");
        System.out.println(" ***************************************** ");

    }

    /* *****************************************
          FIN DE OPCIONES PARA MENUS
      **************************************** */


    /* *****************************************
        INICIO DE RESERVAS POR UBICACION
    **************************************** */
    public static boolean reservarPreferencial() {
       //Ejecutamos el constructor de preferencial que automaticamente incrementa en 1 la reserva, y si ya hay 10, incrementa la cola

        Preferencial Reserva = new Preferencial();
        Reserva.reservar();
        System.out.println("Su reserva a sido creada con exito");
        return true;

    }

    public static boolean reservarGraderia() {
        //Ejecutamos el constructor de preferencial que automaticamente incrementa en 1 la reserva, y si ya hay 10, incrementa la cola

        Graderia Reserva = new Graderia();
        Reserva.reservarGraderia();
        System.out.println("Su reserva a sido creada con exito");
        return true;

    }

    public static boolean reservarGeneral() {
        //Ejecutamos el constructor de preferencial que automaticamente incrementa en 1 la reserva, y si ya hay 10, incrementa la cola

        General Reserva = new General();
        Reserva.reservarGeneral();
        System.out.println("Su reserva a sido creada con exito");
        return true;

    }

    public static boolean reservar(int opcion) {

        boolean salir = false;
        switch (opcion){

            case 1:
                //Reservamos Preferencial
                 salir = reservarPreferencial();
                break;

            case 2:
                //Reservar en graderia
                salir = reservarGraderia();
                break;

            case 3:
                //Reservar general
                salir = reservarGeneral();
                break;

            default:
                System.out.println("Opcion invalida");
        }
        return salir;
    }

    /* *****************************************
        FIN DE RESERVAS POR UBICACION
    **************************************** */


    /* *****************************************
       INICIO DE METODOS PARA MOSTRAR RESULTADOS
   **************************************** */
    public static boolean moostrarReservas(int opcion) {

        boolean salir = false;
        switch (opcion){

            case 1:
                //Mostrar Reserva Preferencial
                Preferencial reservasDePreferencial = new Preferencial();
                reservasDePreferencial.mostrarReservas();
                salir = true;
                break;

            case 2:
                //Mostrar Reserva Graderia
                Graderia reservasDeGraderial = new Graderia();
                reservasDeGraderial.mostrarReservas();
                salir = true;
                break;

            case 3:
                //Mostrar Reserva general
                General reservasDeGeneral = new General();
                reservasDeGeneral.mostrarReservas();
                salir = true;
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

      /* *****************************************
       FIN DE METODOS PARA MOSTRAR RESULTADOS
   **************************************** */


        /* *****************************************
       MENU PRINCIPAL QUE INICIA TODAS LAS OPCIONES
    **************************************** */

    public static boolean ejecutarOpcion(int opcion) {

        boolean salir = false;
        switch (opcion) {
            case 1:
                //Escoger la ubicacion en donde queremos reservar
                do {
                    ubicacionReserva();
                    opcion = seleccionarOpcion();
                    // realizamos la reservacion donde se escogio
                    salir = reservar(opcion);

                    if (opcion == 4){
                        salir = true;
                    }
                } while (!salir);
                salir = false;
                break;

            case 2:
                //mostrando reservas por ubicacion
                do {
                    ubicacionReserva();
                    opcion = seleccionarOpcion();
                    // mostramos la reserva de la ubicacion seleccionada
                    salir = moostrarReservas(opcion);
                } while (!salir);


                // volvemos al menu
                if (opcion == 4){
                    salir = true;
                }
                salir = false;
                break;

                // mostramos las reservas de esta ubicacion junto con la disponibilidad

            case 3:
                //Mostrar cola de reservas por ubicacion
                do {
                    ubicacionReserva();
                    opcion = seleccionarOpcion();

                    // mostramos la cola de reservas de la ubicacion seleccionada


                    //salimos
                    salir = moostrarColaDeReservas(opcion);

                    // volvemos al menu
                    if (opcion == 4){
                        salir = true;
                    }

                } while (!salir);
                salir = false;
                break;

                // mostrar la cola de la ubicacion seleccion

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
