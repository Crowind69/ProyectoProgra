package ProyectoFinal.Vista;

import ProyectoFinal.Contenedoras.CArrayList;
import ProyectoFinal.Contenedoras.CLinkedList;
import ProyectoFinal.Contenedoras.CQueue;
import ProyectoFinal.Contenedoras.CStack;
import ProyectoFinal.Teatro.Teatro2;
import ProyectoFinal.Modelo.General;
import ProyectoFinal.Modelo.Graderia;
import ProyectoFinal.Modelo.Preferencial;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.IOException;
import java.util.Iterator;

public class Interfaz {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
	static PrintStream out = System.out;

    static CArrayList listaUsuariosPreferencial = new CArrayList();
    static CLinkedList listaGeneral = new CLinkedList();
    static CStack listaGraderia = new CStack();
    static CQueue colaPreferencial = new CQueue();
    static CQueue colaGraderia = new CQueue();
    static CQueue colaGeneral = new CQueue();

    static Preferencial Preferencial = new Preferencial(null);
    static Graderia Graderia = new Graderia(null);
    static General General = new General(null);

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

    public static int seleccionarOpcion() throws IOException {
        int opcion = 0;

        try {
            System.out.print("Ingrese su opcion: ");
            opcion = Integer.parseInt(in.readLine());
        } catch (NumberFormatException ex) {
            System.out.println("Error, ingrese solo los números que se indican según cada menú");
        }
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
    public static boolean reservaciones(Preferencial preferencial) throws IOException {
       //Ejecutamos el constructor de preferencial que automaticamente incrementa en 1 la reserva, y si ya hay 10, incrementa la cola

        String nombre;

        try {
            if (listaUsuariosPreferencial.getMyList().size() >= 10){
                System.out.println("Bienvenido.\nLo sentimos, actualmente se han reservado todos los asientos, su" +
                        "solicitud sera ingresada a la cola de espera.\nPor favor indicar el nombre completo" +
                        "para agregarlo a la cola: ");
                nombre = in.readLine();
                preferencial = new Preferencial(nombre);
                colaPreferencial.getQueue().add(preferencial);

                System.out.println("************************************");
                System.out.println("Su solicitud fue ingresada a la cola de espera con exito");
                System.out.println("************************************");
            } else {
                System.out.println("Bienvenido. \nIngrese su nombre completo: ");
                nombre = in.readLine();
                preferencial = new Preferencial(nombre);
                listaUsuariosPreferencial.getMyList().add(preferencial);

                System.out.println("************************************");
                System.out.println("Su reserva a sido creada con exito");
                System.out.println("************************************");
            }
        } catch (Exception  ex) {
            System.out.println("Lo sentimos, ha ocurrido un error, vuelva a intentarlo");
        }
        return true;
    }

    public static boolean reservaciones(Graderia graderia) throws IOException{
        //Ejecutamos el constructor de preferencial que automaticamente incrementa en 1 la reserva, y si ya hay 10, incrementa la cola

        String nombre;
        try {
            if (listaGraderia.getStack().size() >= 50) {
                System.out.println("Bienvenido.\nLo sentimos, actualmente se han reservado todos los asientos, su" +
                        "solicitud sera ingresada a la cola de espera.\nPor favor indicar el nombre completo" +
                        "para agregarlo a la cola: ");
                nombre = in.readLine();
                graderia = new Graderia(nombre);
                colaGraderia.getGraderiaQueue().add(graderia);

                System.out.println("************************************");
                System.out.println("Su solicitud fue ingresada a la cola de espera con exito");
                System.out.println("************************************");
            } else {
                System.out.println("Bienvenido. \nIngrese su nombre completo: ");
                nombre = in.readLine();
                graderia = new Graderia(nombre);
                listaGraderia.getStack().push(graderia);

                System.out.println("************************************");
                System.out.println("Su reserva a sido creada con exito");
                System.out.println("************************************");
            }

        } catch (Exception ex) {
            System.out.println("Lo sentimos, ha ocurrido un error, vuelva a intentarlo");
        }


        return true;
    }

    public static boolean reservaciones(General general) throws IOException{
        //Ejecutamos el constructor de preferencial que automaticamente incrementa en 1 la reserva, y si ya hay 10, incrementa la cola

        String nombre;
        try {
            if (listaGeneral.getGeneralLinkedList().size() >= 20) {
                System.out.println("Bienvenido. \n Lo sentimos, actualmente se han reservado todos los asientos, su" +
                        "solicitud sera ingresada a la cola de espera.\nPor favor indicar el nombre completo" +
                        "para agregarlo a la cola: ");
                nombre = in.readLine();
                general = new General(nombre);
                colaGeneral.getGeneralQueue().add(general);

                System.out.println("************************************");
                System.out.println("Su solicitud fue ingresada a la cola de espera con exito");
                System.out.println("************************************");
            } else {
                System.out.println("Bienvenido. \nIngrese su nombre completo: ");
                nombre = in.readLine();
                general = new General(nombre);
                listaGeneral.getGeneralLinkedList().add(general);

                System.out.println("************************************");
                System.out.println("Su reserva a sido creada con exito");
                System.out.println("************************************");
            }
        } catch (Exception ex) {
            System.out.println("Lo sentimos, ha ocurrido un error, vuelva a intentarlo");
        }
        return true;
    }

    public static boolean reservar(int opcion) throws IOException{

        boolean salir = false;
        switch (opcion){

            case 1:
                //Reservamos Preferencial
                 salir = reservaciones(Preferencial);
                break;

            case 2:
                //Reservar en graderia
                salir = reservaciones(Graderia);
                break;

            case 3:
                //Reservar general
                salir = reservaciones(General);
                break;

            case 4:
                salir = true;
                break;

            default:
                System.out.println("Opcion invalida, vuelva a intentarlo");
        }
        return salir;
    }

    /* *****************************************
        FIN DE RESERVAS POR UBICACION
    **************************************** */


    /* *****************************************
       INICIO DE METODOS PARA MOSTRAR RESULTADOS
   **************************************** */

    public static void listarReservas(Preferencial pre) throws IOException {

        if (listaUsuariosPreferencial.getMyList().size() == 0) {
            System.out.println("No hay reservas");
        } else {
            for (int i = 0; i < listaUsuariosPreferencial.getMyList().size(); i++) {
                System.out.println(listaUsuariosPreferencial.getMyList().get(i).toString());
            }
        }

        System.out.println("************************************");
        System.out.println("Actualmente se encuentran reservados: " + listaUsuariosPreferencial.getMyList().size() + " espacios en Preferencial");
        System.out.println("************************************");
    }

    public static void listarReservas(Graderia gra) throws IOException {

        if (listaGraderia.getStack().size() == 0) {
            System.out.println("No hay reservas");
        } else {
            for (int i = 0; i < listaGraderia.getStack().size(); i++) {
                System.out.println(listaGraderia.getStack().get(i).toString());
            }
        }

        System.out.println("************************************");
        System.out.println("Actualmente se encuentran reservados: " + listaGraderia.getStack().size() + " espacios en Graderia");
        System.out.println("************************************");
    }

    public static void listarReservas(General gen) throws IOException {

        if (listaGeneral.getGeneralLinkedList().size() == 0) {
            System.out.println("No hay reservas");
        } else {
            for (int i = 0; i < listaGeneral.getGeneralLinkedList().size(); i++) {
                System.out.println(listaGeneral.getGeneralLinkedList().get(i).toString());
            }
        }

        System.out.println("************************************");
        System.out.println("Actualmente se encuentran reservados: " + listaGeneral.getGeneralLinkedList().size() + " espacios en General");
        System.out.println("************************************");
    }

    public static void listarColasReservas(Preferencial prefe) throws IOException {

        if (colaPreferencial.getQueue().size() == 0) {
            System.out.println("No hay cola de reservas");
        } else {
            for (int i = 0; i < colaPreferencial.getQueue().size(); i++) {
                System.out.println(colaPreferencial.getQueue());
            }
        }


        System.out.println("************************************");
        System.out.println("Actualmente se encuentrar reservados: " + colaPreferencial.getQueue().size() + " espacios en la cola de reserva de Preferencial");
        System.out.println("************************************");
    }

    public static void listarColasReservas(Graderia grade) throws IOException {
        if (colaGraderia.getGraderiaQueue().size() == 0) {
            System.out.println("No hay cola de reservas");
        } else {
            for (int i = 0; i < colaGraderia.getGraderiaQueue().size(); i++) {
                System.out.println(colaGraderia.getGraderiaQueue());
            }
        }

        System.out.println("************************************");
        System.out.println("Actualmente se encuentran reservados: " + colaGraderia.getGraderiaQueue().size() + " espacios reservados en la cola de Graderia");
        System.out.println("************************************");
    }

    public static void listarColasReservas(General gener) throws IOException {

        if (colaGeneral.getGeneralQueue().size() == 0) {
            System.out.println("No hay cola de reservas");
        } else {
            for (int i = 0; i < colaGeneral.getGeneralQueue().size(); i++) {
                System.out.println(colaGeneral.getGeneralQueue().toString());
            }
        }

        System.out.println("************************************");
        System.out.println("Actualmente se encuentrar reservados: " + colaGeneral.getGeneralQueue().size() + " espacios en la cola de General");
        System.out.println("************************************");
    }

    public static boolean moostrarReservas(int opcion) throws IOException {

        boolean salir = false;
        switch (opcion){

            case 1:
                //Mostrar Reserva Preferencial

                listarReservas(Preferencial);
                salir = true;
                break;

            case 2:
                //Mostrar Reserva Graderia

                listarReservas(Graderia);
                salir = true;
                break;

            case 3:
                //Mostrar Reserva general

                listarReservas(General);
                salir = true;
                break;

            case 4:
                salir = true;
                break;

            default:
                System.out.println("Opcion invalida, vuelva a intentarlo");

        }

        return salir;

    }

    public static boolean moostrarColaDeReservas(int opcion) throws IOException{

        boolean salir = false;
        switch (opcion){

            case 1:
                //Mostrar Reserva Preferencial

                listarColasReservas(Preferencial);
                salir = true;
                break;


            case 2:
                //Mostrar Reserva Graderia

                listarColasReservas(Graderia);
                salir = true;
                break;

            case 3:
                //Mostrar Reserva general

                listarColasReservas(General);
                salir = true;
                break;

            case 4:
                salir = true;
                break;

            default:
                System.out.println("Opcion invalida, vuelva a intentarlo");

        }
        return salir;
    }

      /* *****************************************
       FIN DE METODOS PARA MOSTRAR RESULTADOS
   **************************************** */


        /* *****************************************
       INICIO DE METODOS PARA MOSTRAR GANANCIAS
   **************************************** */

    public static void gananciasPorZona(Preferencial p) {

        int totalPreferencial = listaUsuariosPreferencial.getMyList().size();
        totalPreferencial = 7000 * totalPreferencial;
        System.out.println("************************************");
        System.out.println("La cantidad de Ganacias generadas por Preferencial es de: "+totalPreferencial+" colones");
        System.out.println("************************************");
    }

    public static void gananciasPorZona(Graderia gr) {

        int totalGraderia = listaGraderia.getStack().size();
        totalGraderia = 5500 * totalGraderia;
        System.out.println("************************************");
        System.out.println("La cantidad de Ganacias generadas por Graderia es de: "+totalGraderia+" colones");
        System.out.println("************************************");
    }

    public static void gananciasPorZona(General ge) {

        int totalGeneral = listaGeneral.getGeneralLinkedList().size();
        totalGeneral = 4000 * totalGeneral;
        System.out.println("************************************");
        System.out.println("La cantidad de Ganacias generadas por General es de: "+totalGeneral+" colones");
        System.out.println("************************************");
    }

    public static void gananciasTotales() {

        int totalPreferencial = listaUsuariosPreferencial.getMyList().size();
        int totalGraderia = listaGraderia.getStack().size();
        int totalGeneral = listaGeneral.getGeneralLinkedList().size();

        // vamos a multiplicar cada valor por lo que vale su tiquete
        totalPreferencial = 7000 * totalPreferencial;
        totalGraderia = 5500 * totalGraderia;
        totalGeneral = 4000 * totalGeneral;

        // sumamos todos los valores
        int totalGanancias = totalPreferencial + totalGraderia + totalGeneral;

        // mostrarmos el output
        System.out.println("************************************");
        System.out.println("Hay un total de: "+ totalGanancias+ " de ganancias generadas");
        System.out.println("************************************");
    }

    public static boolean moostrarGanacias(int opcion) {

        boolean salir = false;
        switch (opcion){

            case 1:
                //Mostrar Ganancias Preferencial

                gananciasPorZona(Preferencial);
                salir = true;
                break;

            case 2:
                //Mostrar Ganancias Graderia

                gananciasPorZona(Graderia);
                salir = true;
                break;

            case 3:
                //Mostrar Ganancias General

                gananciasPorZona(General);
                salir = true;
                break;

            case 4:
                salir = true;
                break;

            default:
                System.out.println("Opcion invalida, vuelva a intentarlo");

        }
        return salir;
    }

        /* *****************************************
       FIN DE METODOS PARA MOSTRAR GANANCIAS
   **************************************** */

        /* *****************************************
       MENU PRINCIPAL QUE INICIA TODAS LAS OPCIONES
    **************************************** */

    public static boolean ejecutarOpcion(int opcion) throws IOException {

        boolean salir = false;
        switch (opcion) {
            case 1:
                //Escoger la ubicacion en donde queremos reservar
                do {
                    ubicacionReserva();
                    opcion = seleccionarOpcion();
                    // realizamos la reservacion donde se escogio
                    salir = reservar(opcion);

                    // volvemos al menu
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

                //mostrando cola reservas por ubicacion
                do {
                    ubicacionReserva();
                    opcion = seleccionarOpcion();
                    // mostramos la cola de reserva de la ubicacion seleccionada
                    salir = moostrarColaDeReservas(opcion);
                } while (!salir);


                // volvemos al menu
                if (opcion == 4){
                    salir = true;
                }
                salir = false;
                break;

            // mostramos las colas de reservas de esta ubicacion junto con la disponibilidad


            case 4:

                //Mostrar ganancias totales
                gananciasTotales();
                break;

            case 5:

                // Mostrar ganancias por ubicaciones
                do {
                    ubicacionReserva();
                    opcion = seleccionarOpcion();
                    salir = moostrarGanacias(opcion);
                } while (!salir);


                // volvemos al menu
                if (opcion == 4){
                    salir = true;
                }
                salir = false;
                break;

            case 6:

                // Mostrar el teatro
                System.out.println("************************************");

                Teatro2 teatro = new Teatro2();
                teatro.setVisible(true);

                System.out.println("************************************");
                break;

            case 7:
                salir = true;
                break;

            default:
                System.out.println("Opcion invalida, vuelva a intentarlo");
        }
        return salir;
    }
}
